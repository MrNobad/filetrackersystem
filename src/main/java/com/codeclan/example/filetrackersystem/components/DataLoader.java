package com.codeclan.example.filetrackersystem.components;

import com.codeclan.example.filetrackersystem.models.Files;
import com.codeclan.example.filetrackersystem.models.Folders;
import com.codeclan.example.filetrackersystem.models.Users;
import com.codeclan.example.filetrackersystem.repositories.FileRepository;
import com.codeclan.example.filetrackersystem.repositories.FolderRepository;
import com.codeclan.example.filetrackersystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        FileRepository fileRepository;
        @Autowired
        FolderRepository folderRepository;
        @Autowired
        UserRepository userRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args) {
            Folders folder2 = new Folders("Quantum Soup");
            folderRepository.save(folder2);
            Folders folder3 = new Folders("Music");
            folderRepository.save(folder3);
            Files file2 = new Files("Glass Prices", "xml", "1213MB", "Quantum Soup");
            fileRepository.save(file2);
            Files file3 = new Files("Daddy Cool", "MP3", "5433MB", "Music")
            fileRepository.save(file3);
            Users user2 = new Users("Stevie Nobad", "");
            userRepository.save(user2);
            Users user3 = new Users("Sara Traill", folders);
            userRepository.save(user3);


        }
    }
