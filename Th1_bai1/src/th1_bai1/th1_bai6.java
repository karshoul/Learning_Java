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
public class th1_bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        
        int[] mang = new int[n];
        
        System.out.print("Nhap cac gia tri cua mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        int tong_chan = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0){
                tong_chan += mang[i];
            }
        }
        int tong_le = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] %2 != 0){
                tong_le += mang[i];
            }
        }
        System.out.println("Tong cac so chan trong mang: " + tong_chan);
        System.out.println("Tong cac so le trong mang: " + tong_le);
    }
}
