/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsp;

/**
 *
 * @author khuon
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Qlsp {
    public static ArrayList <Sanpham> dssp = new ArrayList <Sanpham>();
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("*** CHUONG TRINH QLSP ***");
        System.out.println("-------------------------");
        System.out.println("1 - Them san pham");
        System.out.println("2 - Xoa san pham");
        System.out.println("3 - Sua san pham");
        System.out.println("4 - Xem danh sach san pham");
        System.out.println("5 - Tim kiem san pham");
        System.out.println("6 - Tim kiem san pham co gia lon nhat");
        System.out.println("7 - Tim kiem san pham co gia nho nhat");
        
        System.out.print("- Nhap chuc nang: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        switch (i){
            case 1:
                themsp();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp1 = sc.nextInt();
                if (temp1 == 1){
                    menu();
                }
                break;
            case 2:
                System.out.println("Danh sach san pham:");
                inds();
                xoasp();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp2 = sc.nextInt();
                if (temp2 == 1){
                    menu();
                }
                break;
            case 3:
                System.out.println("Danh sach san pham: ");
                inds();
                suasp();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp3 = sc.nextInt();
                if (temp3 == 1){
                    menu();
                }
                break;
            case 4:
                System.out.println("Danh sach san pham:");
                inds();
                System.out.print("ban co muon ve menu (1/0): ");
                int temp4 = sc.nextInt();
                if (temp4 == 1){
                    menu();
                }
                break;
            case 5:
                timkiem();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp5 = sc.nextInt();
                if (temp5 == 1){
                    menu();
                }
                break;
            case 6:
                timspcogialonnhat();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp6 = sc.nextInt();
                if (temp6 == 1){
                    menu();
                }
                break;
            case 7:
                timspcogianhonhat();
                System.out.print("Ban co muon ve menu (1/0): ");
                int temp7 = sc.nextInt();
                if (temp7 == 1){
                    menu();
                }
            default:
                System.out.print("Chon sai chuc nang !!!");
        }
    }
    
    public static void themsp(){
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        while(temp == 1){
            Sanpham sp = new Sanpham();
            sp.nhapthongtin();
            dssp.add(sp);
            System.out.print("Ban co muon nhap tiep (1/0): ");
            temp = sc.nextInt();
        }
    }
    
    public static void inds(){
        for (int i = 0; i < dssp.size(); i++) {
            System.out.print((i + 1) + "- ");
            dssp.get(i).inthongtin();
        }
    }
    
    public static void xoasp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri can xoa: ");
        int i = sc.nextInt();
        dssp.remove( i - 1);
    }
    
    public static void suasp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhap vi tri can sua: ");
        int i = sc.nextInt();
        Sanpham sp1 = new Sanpham();
        System.out.println("- Nhap thong tin can sua: ");
        sp1.nhapthongtin();
        
        dssp.set(i - 1, sp1);
    }
    
    public static void timkiem() {
    Scanner sc = new Scanner(System.in);
    int temp = 1;
    while (temp == 1) {
        System.out.print("- Nhập mã sản phẩm cần tìm: ");
        String keyword = sc.nextLine();
        boolean timthay = false; // Biến để kiểm tra xem sản phẩm đã được tìm thấy hay chưa

        for (int i = 0; i < dssp.size(); i++) {
            Sanpham sp = dssp.get(i); // Lấy sản phẩm tại vị trí i từ danh sách
            if (keyword.equals(sp.getmasanpham())) {
                sp.inthongtin();
                timthay = true; // Đánh dấu là sản phẩm đã được tìm thấy
                break; // Thoát khỏi vòng lặp khi đã tìm thấy sản phẩm
            }
        }
        
        // Kiểm tra nếu không tìm thấy sản phẩm
        if (!timthay) {
            System.out.println("Không tìm thấy sản phẩm với mã '" + keyword + "'.");
        }

        System.out.print("Bạn có muốn tiếp tục tìm kiếm? (1/0): ");
        temp = sc.nextInt();
        sc.nextLine(); // Loại bỏ ký tự xuống dòng từ bộ đệm
        }
    }
    
    public static void timspcogialonnhat(){
        Scanner sc = new Scanner(System.in);
//        int temp = 1;
//        while (temp == 1){
        int giaMax = 0;
        double giasp = dssp.get(0).getgia();
        
        for (int i = 0; i < dssp.size(); i++) {
            double giahientai = dssp.get(i).getgia();
            if(giahientai > giasp){
                giasp = giaMax;
                giaMax = i;
            }
        }
        System.out.println("Sản phẩm có giá lớn nhất:");
        dssp.get(giaMax).inthongtin();
        
//        System.out.print("Bạn có muốn tiếp tục tìm kiếm? (1/0): ");
//        temp = sc.nextInt();
//        }
    }
    
    public static void timspcogianhonhat(){
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        while (temp == 1){
            int giaMin = 0;
            double giasp = dssp.get(0).getgia();
            
            for (int i = 0; i < dssp.size(); i++) {
                double giahientai = dssp.get(i).getgia();
                if (giahientai < giasp){
                    giasp = giaMin;
                    giaMin = i;
                }
            }
            
            System.out.println("San pham co gia nho nhat:");
            dssp.get(giaMin).inthongtin();
        
            System.out.print("Bạn có muốn tiếp tục tìm kiếm? (1/0): ");
            temp = sc.nextInt();
        }
    }
}

