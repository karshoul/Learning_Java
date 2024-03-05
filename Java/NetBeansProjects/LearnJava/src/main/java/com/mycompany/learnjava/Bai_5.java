/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava;

/**
 *
 * @author khuon
 */
import java.util.Scanner;
public class Bai_5 {
    public static void main(String[] args) {
        int n, i;
        
        System.out.print("Moi ban nhap so bat ki: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner. nextInt();
        
        if (n%2==0){
            i = 2;
        } else {
            i = 1;
        }
        long S = 0;
        for (; i <= n; i+=2) {
            S+=i;
        }
        System.out.println("S = " + S);
    }
}

