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
public class th1_bai10_ham {
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
        
        int Tongbehonm = tongbehonm(m, n, mang);
        int TonglonhonM = tonglonhonm(m, n, mang);
        inraMH(m, TonglonhonM, Tongbehonm);
    }
    
    // Tính tổng các số bé hơn m
    public static int tongbehonm(int m, int n, int[] mang){
        int tongBeHonM = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < m) {
                tongBeHonM += mang[i];
            }
        }
        return tongBeHonM;
    }
    
    // Tính tổng các số lớn hơn m
    public static int tonglonhonm(int m, int n, int[] mang){
        int tongLonHonM = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] > m) {
                tongLonHonM += mang[i];
            }
        }
        return tongLonHonM;
    }
    
    public static void inraMH(int m, int tongLonHonM, int tongBeHonM){
        System.out.println("Tong cac so lon hon " + m + " : " + tongLonHonM);
        System.out.println("Tong cac so be hon " + m + " : " + tongBeHonM);
    }
}
