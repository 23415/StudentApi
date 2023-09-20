package com.example.demo.model;

public class Student {
    String USN;
    String fName;
    String mName;
    String lName;
    String email;
    String phNumber;

    int sem;
    char sec;
    double CGPA;
    int backLog;

    public Student() {
    }

    public Student(String USN, String fName, String mName, String lName, String email, String phNumber, int sem, char sec, double CGPA, int backLog) {
        this.USN = USN;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.email = email;
        this.phNumber = phNumber;
        this.sem = sem;
        this.sec = sec;
        this.CGPA = CGPA;
        this.backLog = backLog;
    }

    public String getUSN() {
        return USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public char getSec() {
        return sec;
    }

    public void setSec(char sec) {
        this.sec = sec;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public int getBackLog() {
        return backLog;
    }

    public void setBackLog(int backLog) {
        this.backLog = backLog;
    }
}
