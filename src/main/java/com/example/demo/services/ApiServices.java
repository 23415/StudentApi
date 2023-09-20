package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServices {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student s){
        return studentRepository.saveStudent(s);
    }
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudents();
    }
    public Student getStudentByUsn(String usn){
        return studentRepository.getStudentByUSN(usn);
    }
    public List<Student> getStudentBySem(int sem){
        return studentRepository.getStudentBySem(sem);
    }
    public List<Student> getStudentBySec(char sec){
        return studentRepository.getStudentBySec(sec);
    }
    public Student updateStudent(String usn){
        return studentRepository.updateStudentByUsn(usn);
    }
    public String deleteStudent(String usn){
        return studentRepository.deleteStudentByUsn(usn);
    }


}
