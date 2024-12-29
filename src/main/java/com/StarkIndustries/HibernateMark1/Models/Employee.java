package com.StarkIndustries.HibernateMark1.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee_Details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "EmployeeName")
    private String name;

    @Column(name="EmployeeEmail")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "JoiningDate")
    private Date joiningData;

    @Column(name = "Salery")
    private double salery;

    @Column(name = "AccountStatus")
    private boolean status;

    @Column(name = "Token")
    @Transient
    private String token;

    public Employee(int empId,String name,String email,Date joiningData,double salery,boolean status,String token){
        this.empId=empId;
        this.name=name;
        this.email=email;
        this.joiningData=joiningData;
        this.salery=salery;
        this.status=status;
        this.token=token;
    }

    public Employee(String name,String email,Date joiningData,double salery,boolean status){
        this.name=name;
        this.email=email;
        this.joiningData=joiningData;
        this.salery=salery;
        this.status=status;
    }

    public Employee(String name,String email,Date joiningData,double salery){
        this.name=name;
        this.email=email;
        this.joiningData=joiningData;
        this.salery=salery;
    }

    public Employee(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public Date getJoiningData() {
        return joiningData;
    }

    public void setJoiningData(Date joiningData) {
        this.joiningData = joiningData;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
