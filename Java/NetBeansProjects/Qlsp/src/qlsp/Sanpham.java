/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsp;

/**
 *
 * @author khuon
 */
import java.util.Scanner;
public class Sanpham {
    private String masanpham;
    private String tensanpham;
    private int namsanxuat;
    private double gia;
    
    public Sanpham(){};
    public Sanpham(String masanpham, String tensanpham, int namsanxuat, double gia){
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.namsanxuat = namsanxuat;
        this.gia = gia;
    }
    
    // Hàm get
    public String getmasanpham(){
        return this.masanpham;
    } 
    public String gettensanpham(){
        return this.tensanpham;
    }
    public int getnamsanxuat(){
        return this.namsanxuat;
    }
    public double getgia(){
        return this.gia;
    }
    
    // Hàm set
    public void setmasanpham(String msp){
        this.masanpham = msp;
    }
    public void settensanpham(String tsp){
        this.tensanpham = tsp;
    }
    public void setnamsanxuat(int nsx){
        this.namsanxuat = nsx;
    }
    public void setgia(double g){
        this.gia = g;
    }
    
    public void inthongtin(){
        System.out.println("Ma san pham: " + this.masanpham);
        System.out.println("Ten san pham: " + this.tensanpham);
        System.out.println("Nam san xuat: " + this.namsanxuat);
        System.out.println("Gia: " + this.gia);
    }
    
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        this.masanpham = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        this.tensanpham = sc.nextLine();
        System.out.print("Nhap nam san xuat: ");
        this.namsanxuat = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gia: ");
        this.gia = sc.nextDouble();
    }
}
