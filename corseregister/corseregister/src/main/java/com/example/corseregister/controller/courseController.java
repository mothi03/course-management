package com.example.corseregister.controller;

import com.example.corseregister.model.course;
import com.example.corseregister.model.courseRegistery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.corseregister.service.courseServices;
import java.util.List;

@RestController
public class courseController {
    @Autowired
    courseServices courseServices;
    @GetMapping("courses")
    public List<course> available(){
       return courseServices.avilablecourses();

    }
    @GetMapping("courses/enrolled")
    public List<courseRegistery> registery(){
        return courseServices.registery();
    }
    @PostMapping("courses/register")
    public void enroll(@RequestParam("name")String name , @RequestParam ("email") String email , @RequestParam("courseId") String courseId){
        courseServices.enroll(name , email , courseId);
    }



}
