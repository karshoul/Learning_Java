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
public class Bai_9 {
    public static void main(String[] args) {
        
        System.out.print("Moi ban nhap mot so bat ki: ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        int sum = 0;
        int x;
        while(n>0){
            x = n % 10;
            n /= 10;
            sum += x;
        }
        System.out.print(sum);
    }
}
