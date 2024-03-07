/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava.TH1;

/**
 *
 * @author khuon
 */

// Tính số Pi

import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        
        double c = new Scanner(System.in).nextDouble();
        double pi = 0;
        double n = 0;
        double x = 1.0/(n*2+1);
        
        while(c <= x){
            pi += Math.pow(-1, n)*x;
            n++;
            x = 1.0/(2*n+1);
        }
        pi *= 4;
        System.out.print("Pi = " + pi);
    }
}
