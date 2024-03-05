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
public class Bai_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d\n", i, j, (i*j));
            }
            System.out.println();
        }
                
    }
}
