package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.ApiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class ApiController {
    @Autowired
    private ApiServices apiServices;
    private StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return apiServices.saveStudent(s);
    }

    @GetMapping("/view")
    public List<Student> getAllStudent(){
        return apiServices.getAllStudent();
    }

    @GetMapping("/view/byUsn/{usn}")
    public Student getStudentByUsn(@PathVariable("usn") String usn){
        return apiServices.getStudentByUsn(usn);
    }

    @GetMapping("/view/bySem/{sem}")
    public List<Student> getStudentBySem(@PathVariable("sem") int sem){
        return apiServices.getStudentBySem(sem);
    }

    @GetMapping("/view/bySec/{sec}")
    public List<Student> getStudentBySec(@PathVariable("sec") char sec){
        return apiServices.getStudentBySec(sec);
    }

    @PutMapping("/edit/{usn}")
    public Student updateStudent(@PathVariable("usn") String usn){
        return apiServices.updateStudent(usn);
    }

    @DeleteMapping("/delete/{usn}")
    public String deleteStudent(@PathVariable("usn") String usn){
        return apiServices.deleteStudent(usn);
    }

}
