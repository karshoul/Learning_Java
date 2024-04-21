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
public class th1_bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Moi ban nhap so luong mang: ");
        int n = sc.nextInt();
        
        int[] mang = new int[n];
        
        System.out.print("Nhap cac gia tri cho mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        
        // Tìm giá trị lớn nhất
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        
        // Tìm giá trị nhỏ nhất
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        
        System.out.println("Gia tri lon nhat trong mang: " + max);
        System.out.println("Gia tri nho nhat trong mang: " + min);
    }
}
