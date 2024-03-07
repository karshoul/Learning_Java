/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.learnjava.TH1;

/**
 *
 * @author khuon
 */

// Viết chương trình liệt kê tất cả các số thuận nghịch có sáu chữ số

import java.util.Scanner;
public class Bai_13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i < 999999; i++) {
            int tmp = 0;
            int n = i;
            while(n > 0){
                tmp = tmp*10 + n%10;
                n/=10;
            }
            if( i == tmp){
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
}
