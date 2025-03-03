/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thbuoi2;
 class student{
     private String id;
     private String name;
     private String classs;
 public student(String id,String name,String classs){    
       this.id=id;
       this.name=name;
       this.classs=classs;
 }
 public void setid(String id){
     this.id=id;
 }
 public void setname(String name){
     this.name=name;
 }
 public void setclasss(String classs){
     this.classs=classs;
 }
 public String getid(){
  return id;
 }
 public String getname(){
     return name;
 }
 public String getclasss(){
     return classs;
 }
 @Override
    public String toString() {
        return
              "ten"+name+"classs"+classs;
    }
 }
class book{
    private String code;
    private String title;
    private String author;
public book(String code,String title,String author){
    this.code=code;
    this.title=title;
    this.author=author;
}
public void setcode(String code){
    this.code=code;
}
public void settitle(String title){
    this.title=title;
}
public void setauthor(String author){
    this.author=author;
}
public String getcode(){
    return code;
}
public String gettitle(){
    return title;
}
public String getauthor(){
    return author;
}
@Override
    public String toString() {
        return "Book" +
                "Code='" + code + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' ;
                
    }
}
class sanpham{
    public String tensp;
    public double dongia;
    public double giamgia;
    public sanpham(String tensp,double dongia,double giamgia){
        this.tensp=tensp;
        this.dongia=dongia;
        this.giamgia=giamgia;
    }
    public double getthuenhapkhau(){
        return dongia*0.1;
    }
    public void xuat(){
        System.out.println("thue nhap khau bang: "+getthuenhapkhau());
    }
}
/**
 *
 * @author admin
 */
public class bai4 {
       public static void main(String[] args) {
           student hs1 =new student("001","Phan Trong Phuc","cntt3");
           System.out.println(hs1);
           book sach1=new book("002","java java","phuc phuc");
           System.out.println(sach1);
           sanpham sp1=new sanpham("dienthoai",15000,1000);
           sp1.xuat();
}
}
