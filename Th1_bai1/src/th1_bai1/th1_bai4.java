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
public class th1_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập n (số lượng phần tử)
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Nhập m (giá trị cần tìm)
        System.out.print("Nhập giá trị cần tìm: ");
        int m = sc.nextInt();

        // Khai báo và khởi tạo mảng
        int[] mang = new int[n];

        // Nhập giá trị cho các phần tử mảng
        System.out.println("Nhập giá trị cho các phần tử mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        
        boolean ktso = false;
        
        for (int i = 0; i < n; i++) {
            if (mang[i] == m){
                ktso = true;
                break; // Thoát vòng lặp khi tìm thấy m
            }
        }
        if (ktso == true){
            System.out.print("Da ton tai");
        }else{
            System.out.print(m + " khong ton tai");
        }
    }
}
