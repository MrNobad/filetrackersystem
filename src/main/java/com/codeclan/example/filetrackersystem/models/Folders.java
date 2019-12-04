package com.codeclan.example.filetrackersystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "folders")
public class Folders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

@JsonIgnoreProperties("folders")
    @OneToMany(mappedBy = "folders")
    private ArrayList<Files> files;

    public Folders(String title) {
        this.title = title;
        this.files = new ArrayList<Files>();

    }

    public Folders(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Files> getFiles() {
        return files;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFiles(ArrayList<Files> files) {
        this.files = files;
    }

}
