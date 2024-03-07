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
public class Bai_11 {
    public static void main(String[] args) {
        System.out.print("Moi ban nhap so bat ki: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        int x = 2;
        while(true){
            if(IsNgTo(x)){
                System.out.print(x + " ");
                count++;
            }
            if(count == n){
                break;
            }
            if(x == 2){
                x++;
            }else {
                x+=2;
            }
        }
    }
    
    public static boolean IsNgTo(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    } 
}
