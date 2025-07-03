/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private double gpa;
    private String address;

    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getGPA() {
        return gpa;
    } // gpa getter

    public void setGPA(double gpa) {
        this.gpa = gpa;
    } // gpa setter

    @Override
    public String toString() {
        return String.format("name: %s\n age: %d\n address: %s\n gpa: %f", getName(), getAge(), getAddress(), getGPA());
    }
}
