package com.codeclan.example.filetrackersystem.repositories;

import com.codeclan.example.filetrackersystem.models.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders, Long> {
}
