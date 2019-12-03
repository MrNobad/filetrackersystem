package com.codeclan.example.filetrackersystem;
import com.codeclan.example.filetrackersystem.models.File;
import com.codeclan.example.filetrackersystem.models.Folder;
import com.codeclan.example.filetrackersystem.models.User;
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
		File file1 = new File("New CV", "docx", "32KB", "Tech CV's");
		fileRepository.save(file1);
	}

	@Test
	public void createFolder(){
		Folder folder1 = new Folder("Tech CV's");
		folderRepository.save(folder1);
	}

	@Test
	public void createUser(){
		User user1 = new User("Stephen Nobad");
		userRepository.save(user1);
	}
}
