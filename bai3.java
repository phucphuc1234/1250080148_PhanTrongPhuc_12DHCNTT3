/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi2;
import java.util.Scanner;
 class sinhvien {
    private int mssv;
    private String hoten;
    private float diemlt;
    private float diemth;
public sinhvien(){
    this.mssv=0;
    this.hoten="";
    this.diemlt=0.0f;
    this.diemth=0.0f;
}
public sinhvien(int mssv,String hoten,float diemlt,float diemth){
    this.mssv=mssv;
    this.hoten=hoten;
    this.diemlt=diemlt;
    this.diemth=diemth;
}
public void setmssv(int mssv){
    this.mssv=mssv;
}
public void sethoten(String hoten){
    this.hoten=hoten;
}
public void setdiemlt(float diemlt){
    this.diemlt=diemlt;
}
public void setdiemth(float diemlt){
    this.diemlt=diemlt;
}
public int mssv(){
    return mssv;
}
public String hoten(){
    return hoten;
}
public float diemlt(){
    return diemlt;
}
public float diemth(){
    return diemth;
}
public double tinhdiem(){
    return (diemlt + diemth)/2;
}
@Override
    public String toString() {
        return
              mssv+hoten+diemlt+diemth+"diem trung binh: "+tinhdiem();
    }
}
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sinhvien sv1=new sinhvien(1250080148," Phan Trong Phuc",9.0f,8.0f);
        sinhvien sv2=new sinhvien(1250080149," Tran Duong Phuc",5.0f,6.0f);
        sinhvien sv3 = new sinhvien();
        System.out.print("mssv: ");
        sv3.setmssv(scanner.nextInt());
        scanner.nextLine();
        System.out.print("ho ten sv: ");
        sv3.sethoten(scanner.nextLine());
        System.out.print("diem lt: ");
        sv3.setdiemlt(scanner.nextFloat());
        System.out.print("diemth: ");
        sv3.setdiemth(scanner.nextFloat());
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        
}
}
