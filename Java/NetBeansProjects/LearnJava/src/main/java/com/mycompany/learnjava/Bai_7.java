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
public class Bai_7 {
    public static void main(String[] args) {
        
        System.out.print("Moi ban nhap mot so: ");
        
        int n;
        
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        float S = 0;
        for (int i = 1; i <= n; i++) {
            S += (float)1/i; // chú ý ép kiểu cho chính xác
            System.out.print("1/" + i + " + ");
        }
        System.out.println("= " + S);
    }
}
