/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava.TH1;

/**
 *
 * @author khuon
 */
import java.util.Scanner;
public class Bai_12 {
    public static void main(String[] args) {
        
        System.out.print("Moi ban nhap so n: ");
        int n = new Scanner(System.in).nextInt();
        
        long f0 = 0, f1 = 1, fn = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i < 2){
                System.out.print(i);
            }else{
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
        }
    }
}
