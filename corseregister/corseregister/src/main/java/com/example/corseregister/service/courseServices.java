package com.example.corseregister.service;

import com.example.corseregister.model.course;
import com.example.corseregister.model.courseRegistery;
import com.example.corseregister.repostery.courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.corseregister.repostery.registeryrepo;

import java.util.List;

@Service
public class courseServices {
@Autowired
courserepo Courserepo;
    public List<course> avilablecourses() {
        return Courserepo.findAll();
    }
    @Autowired
registeryrepo Registeryrepo;
    public List<courseRegistery> registery() {
        return Registeryrepo.findAll();
    }

    public void enroll(String name, String email, String courseId) {
        courseRegistery courseregistery = new courseRegistery(name , email , courseId);
        Registeryrepo.save(courseregistery);
    }
}
