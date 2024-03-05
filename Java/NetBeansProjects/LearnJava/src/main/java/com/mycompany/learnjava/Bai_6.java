/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava;

/**
 *
 * @author khuon
 */
import java.util.Random;
import java.util.Scanner;
public class Bai_6 {
    public static void main(String[] args) {
        int input;
        //int count = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        
        Random random = new Random();
//        while(true){
            int ranNumb = random.nextInt(100); //[0,00]
//            count++;
//            System.out.println("Random Number: "+ranNumb + ", input"+input);
            if (ranNumb == input){
                //System.out.println("Thuc hien "+ count +" lan");
                System.out.println("Chuc mung ban da tim ra so dung");
                //break;
            } else {
                System.out.print("Ban chua tim ra so dung");
        }
    }
}
