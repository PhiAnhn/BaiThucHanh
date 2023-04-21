package Hinhhoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public HinhVuong(){
        super.setTen("Hinh vuong");
    }   
    public void nhapCanh(){
        System.out.print("Nhap canh =");
        super.setDai(sc.nextFloat());
        super.setRong(super.getDai());
    }
}
