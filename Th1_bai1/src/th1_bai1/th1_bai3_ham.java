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
public class th1_bai3_ham {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        // Nhập các hệ số
        System.out.print("Mời bạn nhập số a = ");
        a = sc.nextInt();
        System.out.print("Mời bạn nhập số b = ");
        b = sc.nextInt();
        System.out.print("Mời bạn nhập số c = ");
        c = sc.nextInt();

        // Giải và in kết quả
        giaiPhuongTrinhBac2(a, b, c);
    }

    // Hàm giải phương trình bậc 2
    public static void giaiPhuongTrinhBac2(int a, int b, int c) {
        float delta = (b * b) - (4 * a * c);

        if (a == 0) {
            giaiPhuongTrinhBacNhat(b, c);
        } else {
            giaiPhuongTrinhBac2ThucSu(a, b, delta);
        }
    }

    // Hàm giải phương trình bậc nhất (a = 0)
    public static void giaiPhuongTrinhBacNhat(int b, int c) {
        if (b == 0) {
            if (c == 0) {
                System.out.print("Phương trình có vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        } else {
            System.out.print("Phương trình có nghiệm x = " + (float) -c / b);
        }
    }

    // Hàm giải phương trình bậc 2 thực sự (a != 0)
    public static void giaiPhuongTrinhBac2ThucSu(int a, int b, float delta) {
        if (delta > 0) {
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            System.out.print("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            float nghiemkep = (float) (-b / (2 * a));
            System.out.print("Phương trình có nghiệm kép x1 = x2 = " + nghiemkep);
        } else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}

