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
public class th1_bai2 {
    public static void main(String[] args){
        
        // Tạo mảng
        String[] name = {"Khuong", "Nguyen", "Hao", "Kiet", "Duong"};

        // In mảng
        System.out.println("Nội dung của mảng: ");
        xuatMang(name);

        // Tạo biến nhận giá trị
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập 1 số bất kỳ: ");
        int n = sc.nextInt();

        // In nội dung ra màn hình
        if (n > name.length) {
            System.out.println("Bạn nhập sai!");
        } else {
            System.out.println("Xin chào " + name[n]);
        }
    }

    // Hàm in mảng
    public static void xuatMang(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
