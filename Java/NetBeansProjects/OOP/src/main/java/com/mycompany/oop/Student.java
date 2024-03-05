/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author khuon
 */
public class Student extends Person implements IStudy, ISpeak{
        public String universityName;   
        
        public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }
        
    @Override
    public void study() {
    System.out.println(this.name + " is studing");
    }
    
    @Override
    public void speak() {
    System.out.print(this.name + " is speaking");
    }
}