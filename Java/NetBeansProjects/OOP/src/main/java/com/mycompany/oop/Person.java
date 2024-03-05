/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author khuon
 */
public class Person {
    String name;
    int age;
    float height;
    
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;  
    }
    
    public void eat(String foodname) { // void không cần trả về
        System.out.println(name + " dang an " + foodname);
    }
    
    public int getAge() {
        return age;
    }
    
    public void getInfo() {
        System.out.println("Name: "+name);
        System.out.println("height: "+height);
        System.out.println("age "+age);
    }
}
