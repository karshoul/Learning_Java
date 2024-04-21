/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1_bai1;

/**
 *
 * @author khuon
 */
import java.util.Scanner;
public class th1_bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi ban nhap chieu dai: ");
        int a = sc.nextInt();
        
        System.out.print("Moi ban nhap chieu rong: ");
        int b = sc.nextInt();
        
        int dtHv = a * b;
        System.out.println("Dien tich hinh vuong: " + dtHv);
        
        System.out.print("Moi ban nhap ban kinh: ");
        int r = sc.nextInt();
        float pi = (float) 3.14;
        float S = pi * r * r;
        System.out.println("Dien tich hinh tron: " + S);
         
        System.out.print("Moi ban nhap chieu dai: ");
        int c = sc.nextInt();
        
        System.out.print("Moi ban nhap chieu cao: ");
        int d = sc.nextInt();
        
        int dtHcn = c * d;
        System.out.println("Dien tich hinh chu nhat: " + dtHcn);
    }
}
