/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th1_bai1;

/**
 *
 * @author khuon
 */
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
public class th1_bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        
        int[] mang = new int[n];
        
        int dodai = mang.length;
        System.out.print("Nhap cac gia tri cua mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
    
        // Sắp xếp mảng theo thứ tự giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] < mang[j]) {
                    double temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = (int) temp;
                }
            }
        }
        // In kết quả
        System.out.println("Mảng sau khi sắp xếp:");
        for (int number : mang) {
            System.out.println(number);
        }
    }
}
