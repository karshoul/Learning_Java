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
public class th1_bai8_ham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so luong mang: ");
        int n = sc.nextInt();
        
        int[] mang = new int[n];
        
        System.out.println("Nhap gia tri cho mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        
        int timSLN = GTLN(mang, n);
        int timSBN = GTNN(mang, n);
        inraMH(timSBN, timSLN);
    }
    
    public static int GTLN(int[] mang, int n){
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max){
                max = mang[i];
            }
        }
        return max;
    }
    
    public static int GTNN(int[] mang, int n){
        int min = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] < min){
                min = mang[i];
            }
        }
        return min;
    }
    
    public static void inraMH(int min, int max){
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}
