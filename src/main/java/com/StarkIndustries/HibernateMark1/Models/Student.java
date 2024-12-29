package com.StarkIndustries.HibernateMark1.Models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String sid;

    private String name;

    private String email;

    private int rollNo;

    private String department;

    public Student(String sid,String name,String email,int rollNo,String department){
        this.sid=sid;
        this.name=name;
        this.email=email;
        this.rollNo=rollNo;
        this.department=department;
    }

    public Student(String name,String email,int rollNo,String department){
        this.name=name;
        this.email=email;
        this.rollNo=rollNo;
        this.department=department;
    }

    public Student(){

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
