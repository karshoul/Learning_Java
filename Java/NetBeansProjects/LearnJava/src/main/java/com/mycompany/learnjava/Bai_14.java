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
public class Bai_14 {
    public static void main(String[] args) {
        System.out.print("Moi ban nhap so m: ");
        int m = new Scanner(System.in).nextInt();
        
        System.out.print("Moi ban nhap so n: ");
        int n = new Scanner(System.in).nextInt();
        
        int count = 0;
        
        if(m >= 0 && n >= 0 || n >= 0){
            for (int i = m; i <= n; i++) {
                if(i >= 0){
                    int res = (int)Math.sqrt(i);
                    if(res * res == i){
                        count++;
                        System.out.printf("%2d", i);
                        if (count % 10 == 0){
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println(" So luong so chinh phuong thoa man " + count);
    }
}
