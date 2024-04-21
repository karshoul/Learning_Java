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
public class th1_bai4_ham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khởi tạo số lượng mảng
        System.out.print("Moi ban nhap vao so luong mang: ");
        int n = sc.nextInt();
        
        // Khời tạo giá trị cần tìm
        System.out.print("Moi ban nhap gia tri can tim: ");
        int m = sc.nextInt();
        
        // Khai báo và khởi tạo mảng
        int[] mang = new int[n];
        
        // Nhập giá trị cho mảng
        System.out.print("Nhap gia tri cho mang: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        // Tìm kiếm giá trị
        boolean ktso = timso(n, m, mang);
    
        // In ra kết quả
        inraMH(ktso, m);
    }
    
    
    
    public static boolean timso(int n, int m, int[] mang) {
    boolean ktso = false;
    for (int i = 0; i < n; i++) {
      if (mang[i] == m) {
        ktso = true;
        break;
      }
    }
    return ktso;
  }

    
    public static void inraMH(boolean ktso, int m) {
    if (ktso == true) {
      System.out.println("Đã tồn tại");
    } else {
      System.out.println(m + " không tồn tại");
    }
  }
}
