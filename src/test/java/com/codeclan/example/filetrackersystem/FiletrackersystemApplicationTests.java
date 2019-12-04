package com.codeclan.example.filetrackersystem;
import com.codeclan.example.filetrackersystem.models.Files;
import com.codeclan.example.filetrackersystem.models.Folders;
import com.codeclan.example.filetrackersystem.models.Users;
import com.codeclan.example.filetrackersystem.repositories.FileRepository;
import com.codeclan.example.filetrackersystem.repositories.FolderRepository;
import com.codeclan.example.filetrackersystem.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FiletrackersystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFile(){
		Files file1 = new Files("New CV", "docx", "32KB", "Tech CV's");
		fileRepository.save(file1);
	}

	@Test
	public void createFolder(){
		Folders folder1 = new Folders("Tech CV's");
		folderRepository.save(folder1);
	}

	@Test
	public void createUser(){
		Users user1 = new Users("Stephen Nobad", folders);
		userRepository.save(user1);
	}
}
