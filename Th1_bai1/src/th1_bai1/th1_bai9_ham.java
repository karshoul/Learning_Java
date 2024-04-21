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
public class th1_bai9_ham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------- Tinh hinh vuong------------");
        System.out.print("Moi ban nhap chieu dai: ");
        int a = sc.nextInt();
        
        System.out.print("Moi ban nhap chiu rong: ");
        int b = sc.nextInt();
        
        dthv(a,b);
        
        System.out.println("----------Tinh dien tich hinh tron------------");
        System.out.print("Moi ban nhap ban kinh: ");
        int r = sc.nextInt();
        
        dtht(r);
        
        
        System.out.println("-----------Tinh dien tich hinh chu nhat---------------");
        System.out.println("Moi ban nhap chieu dai: ");
        float c = sc.nextFloat();
        System.out.print("Moi ban nhap chieu rong: ");
        float d = sc.nextFloat();
        
        dthcn(c, d);
        
    }
    
    public static void dthv(int a, int b){
        int dthv = a * b;
        System.out.println("Dien tich hinh vuong: " + dthv);
    }
    
    public static void dtht(int r){
        float pi = 3.14f;
        float S = pi * r * r;
        System.out.println("Dien tich hinh tron: " + S);
    }
    
    public static void dthcn(float c, float d){
        float dthcn = c * d;
        System.out.println("Dien tich hinh chu nhat: " + dthcn);
    }
}
