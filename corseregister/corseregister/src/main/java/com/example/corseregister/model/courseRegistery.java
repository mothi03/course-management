package com.example.corseregister.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class courseRegistery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private  String name;
    private  String email;
    private  String courseId;

    public courseRegistery(String name, String email, String courseId) {
    this.name = name;
    this.email = email;
    this.courseId = courseId;
    }

    public courseRegistery() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

}
