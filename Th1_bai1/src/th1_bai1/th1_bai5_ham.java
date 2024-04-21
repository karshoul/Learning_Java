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
public class th1_bai5_ham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số lượng mảng
        System.out.print("Nhap so luong phan tu cho mang: ");
        int n = sc.nextInt();
        
        // Kiểm tra n > 0
        if (n <= 0) {
            System.out.println("So luong phan tu khong hop le!");
            return;
        }
        
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
        
        // Tìm kiếm giá trị trong mảng
        int viTri = timKiem(mang, m);
         
         // in ra màn 
        inraMH(m, viTri);
    }
    
    
    public static int timKiem(int[] mang, int m) {
    for (int i = 0; i < mang.length; i++) {
        if (mang[i] == m) {
            return i; // Trả về vị trí khi tìm thấy m
        }
    }
    return 0; // Trả về -1 nếu không tìm thấy m
}
   
            
        
    public static void inraMH(int m, int viTri){
        if (viTri != 0){
            System.out.println(m + " o vi tri thu: " + viTri);
        }else{
            System.out.println(m + " khong ton tai");
        }
    }
}
