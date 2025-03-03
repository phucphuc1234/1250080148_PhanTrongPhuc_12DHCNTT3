/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi2;
 import java.util.Scanner;
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    @Override
    public String toString() {
        return
               "dien tich: " + tinhDienTich() +
               "\nChu vi: " + tinhChuVi();
    }
}


public class bai2 {
     public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuDai(dai);
        hcn.setChieuRong(rong);
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println(hcn.toString());
    }
}
