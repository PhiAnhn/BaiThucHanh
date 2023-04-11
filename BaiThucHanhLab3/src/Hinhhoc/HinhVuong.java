package Hinhhoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public HinhVuong(){
        ten = "Hình vuông";
    }   
    public void nhapCanh(){
        System.out.print("Nhap canh =");
        dai = rong =sc.nextFloat();
    }
    
}
