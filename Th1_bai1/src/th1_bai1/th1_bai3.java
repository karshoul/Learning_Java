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
import java.lang.Math;
public class th1_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        System.out.print("Moi ban nhap so a = ");
        a = sc.nextInt();
        System.out.print("Moi ban nhap so b = ");
        b = sc.nextInt();
        System.out.print("Moi ban nhap so c = ");
        c = sc.nextInt();
        
        float delta = (b * b) - (4 * a * c);
        
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.print("Phuong trinh co vo so nghiem");
                }
                if (c != 0){
                    System.out.print("Phuong trinh v0 nghiem");
                }
            }
            if (b != 0 ){
                System.out.print("Phuong trinh co nghiem x = " + (float)-c/b);
            }
        }
        if (a != 0){
            if (delta > 0){
                float x1 = (float) (-b + Math.sqrt(delta) / (2 * a));
                float x2 = (float) (-b - Math.sqrt(delta) / (2 * a));
                System.out.print("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
            }
            if (delta == 0){
                float nghiemkep = (float)(-b/2*a);
                System.out.print("Phuong trinh co nghiem kep x1 = x2 = " + nghiemkep);
            }
            if (delta < 0){
                System.out.print("Phuong trinh vo nghiem");
            }
        }
    }
}
