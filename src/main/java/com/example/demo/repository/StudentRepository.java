package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> sList = new ArrayList<>();

    public void createStudent(){
        sList=List.of(new Student("1Am20cs204","Sukirti","Kumar","Jha",
                "sukrit@mail.com","9045458901", 7,'D',7.35,0));
    }

    public List<Student> getAllStudents(){
        return sList;
    }
    public Student getStudentByUSN(String usn){
        for(int i=0;i<sList.size();i++){
            if(usn.equals(sList.get(i).getUSN()))
                return sList.get(i);
        }
        return null;
    }

    public List<Student> getStudentBySem(int sem){
        List<Student> semStudent = new ArrayList<>();
        for(int i=0;i<sList.size();i++){
            if(sem==sList.get(i).getSem())
                semStudent.add(sList.get(i));
        }
        return semStudent;
    }

    public List<Student> getStudentBySec(char sec){
        List<Student> secStudent = new ArrayList<>();
        for(int i=0;i<sList.size();i++){
            if(sec==sList.get(i).getSec())
                secStudent.add(sList.get(i));
        }
        return secStudent;
    }

    public Student saveStudent(Student s){
        Student newStudent = new Student();
        newStudent.setUSN(s.getUSN());
        newStudent.setfName(s.getfName());
        newStudent.setmName(s.getmName());
        newStudent.setlName(s.getlName());
        newStudent.setEmail(s.getEmail());
        newStudent.setPhNumber(s.getPhNumber());
        newStudent.setSem(s.getSem());
        newStudent.setSec(s.getSec());
        newStudent.setCGPA(s.getCGPA());
        newStudent.setBackLog(s.getBackLog());
        sList.add(newStudent);
        return newStudent;
    }
    public String deleteStudentByUsn(String usn){
        for (int i = 0; i < sList.size(); i++) {
            if(usn.equals(sList.get(i).getUSN())){
                sList.remove(sList.get(i));
                return "Succesfully removed";
            }
        }
        return "Student Not found";
    }
    public Student updateStudentByUsn(String usn){
        int idx=0;
        for(int i=0;i<sList.size();i++){
            if(usn.equals(sList.get(i).getUSN())){
                idx=i;
                break;
            }
        }
        Student updataStudent = new Student();
        updataStudent.setUSN(sList.get(idx).getUSN());
        updataStudent.setfName(sList.get(idx).getfName());
        updataStudent.setmName(sList.get(idx).getmName());
        updataStudent.setlName(sList.get(idx).getlName());
        updataStudent.setEmail(sList.get(idx).getEmail());
        updataStudent.setPhNumber(sList.get(idx).getPhNumber());
        updataStudent.setSem(sList.get(idx).getSem());
        updataStudent.setSec(sList.get(idx).getSec());
        updataStudent.setCGPA(sList.get(idx).getCGPA());
        updataStudent.setBackLog(sList.get(idx).getBackLog());
        sList.set(idx,updataStudent);
        return updataStudent;
    }

}
