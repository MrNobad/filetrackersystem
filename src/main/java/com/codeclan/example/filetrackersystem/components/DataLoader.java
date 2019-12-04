package com.codeclan.example.filetrackersystem.components;

import com.codeclan.example.filetrackersystem.models.File;
import com.codeclan.example.filetrackersystem.models.Folder;
import com.codeclan.example.filetrackersystem.models.User;
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
            Folder folder2 = new Folder("Quantum Soup");
            folderRepository.save(folder2);
            Folder folder3 = new Folder("Music");
            folderRepository.save(folder3);
            File file2 = new File("Glass Prices", "xml", "1213MB", "Quantum Soup");
            fileRepository.save(file2);
            File file3 = new File("Daddy Cool", "MP3", "5433MB", "Music");
            fileRepository.save(file3);
            User user2 = new User("Stevie Nobad");
            userRepository.save(user2);
            User user3 = new User("Sara Traill");
            userRepository.save(user3);


        }
    }
