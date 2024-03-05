/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop;

/**
 *
 * @author khuon
 */
public class OOP {

    public static void main(String[] args) {
        Person a = new Person("Khuong", 18, 1.7f);
        
        System.out.println("Toi ten " +a.name);
        System.out.println("Toi "+a.age + " tuoi");
        System.out.println("Toi cao "+a.height + " m");
        
        a.eat("pizza");
        
        int age = a.getAge();
        System.out.println("Tuoi anh ay: "+age);
        
        a.getInfo();
        
        Student b = new Student("Phong", 20, 1.8f, "CTUT");
        System.out.println(b.universityName);
        b.study();
        
        Student c = new Student("Mai", 23, 1.6f, "CTU");
        c.speak();


    }
}
