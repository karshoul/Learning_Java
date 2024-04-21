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
public class th1_bai7_ham {
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
        
        sapXepGiamDan(mang);
        inraMH(mang);
    }
    
    public static void sapXepGiamDan(int[] mang) {
        for (int i = 0; i < mang.length - 1; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] < mang[j]) {
                    // Hoán đổi vị trí hai phần tử
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }
    
    public static void inraMH(int[] mang){
        for (int number : mang) {
            System.out.println(number);
        }
    }
}
