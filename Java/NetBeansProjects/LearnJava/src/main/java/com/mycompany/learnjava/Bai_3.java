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
public class Bai_3 {
    public static void main(String[] args) {
        int x, output, h;
        
        System.out.print("Mời bạn nhập vào một số bất kì: ");
        
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
       
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= 2*h; j++) {
                x = j-h;
                if (x < 0){
                    x *= -1;
                }
                output = i - x;
                
                if (output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
