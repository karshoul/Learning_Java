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
public class Bai_2 {
    public static void main(String[] args) {
        int rong, cao;
        Scanner scanner = new Scanner(System.in);
        
        rong = scanner.nextInt();
        cao = scanner.nextInt();
        
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < cao; j++) {
                if( i == 0 || j == 0 || i == rong - 1 || j == cao - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
