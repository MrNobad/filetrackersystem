package com.codeclan.example.filetrackersystem.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "files")
    private ArrayList<File> files;

    public Folder(String title) {
        this.title = title;
        this.files = new ArrayList<>();

    }

    public Folder(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

}
