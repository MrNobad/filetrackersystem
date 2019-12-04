package com.codeclan.example.filetrackersystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("users")
    @OneToMany(mappedBy = "users")
    private ArrayList<Folders> folders;

    public Users(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Folders> getFolder() {
        return folders;
    }

    public void setFolder(ArrayList<Folders> folders) {
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
