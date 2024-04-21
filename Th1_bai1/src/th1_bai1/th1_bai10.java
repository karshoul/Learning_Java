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
public class th1_bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong mang: ");
        int n = sc.nextInt();
        
        int[] mang = new int[n];
        
        System.out.print("Nhap gia tri cho mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        
        System.out.print("Nhập giá trị m: ");
        int m = sc.nextInt();

        
        // Tính tổng các số bé hơn m
        int tongBeHonM = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < m) {
                tongBeHonM += mang[i];
            }
        }

        // Tính tổng các số lớn hơn m
        int tongLonHonM = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] > m) {
                tongLonHonM += mang[i];
            }
        }

        // In kết quả
        System.out.println("Tổng các số bé hơn " + m + ": " + tongBeHonM);
        System.out.println("Tổng các số lớn hơn " + m + ": " + tongLonHonM);
    }
}
