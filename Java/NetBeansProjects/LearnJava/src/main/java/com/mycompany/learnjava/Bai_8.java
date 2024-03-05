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
public class Bai_8 {
    public static void main(String[] args) {
        
    System.out.print("Moi ban nhap mot so: ");
    
    int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    
    int count = 0;
    if (n > 0){
        for (int i = 1; i <= n; i++){ // ước là số dương
            if(n % i == 0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nn co " + count + " uoc so" );
    }
    }
}
