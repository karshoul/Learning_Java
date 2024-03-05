/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author khuon
 */
import java.util.Scanner;
public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a:");
        int a = sc.nextInt();
        System.out.println("Nhập giá trị b:");
        int b = sc.nextInt();
        if (a > b){
            System.out.print(" a > b ");
        } else {
            System.out.print(" a < b");
        }
    }
}
