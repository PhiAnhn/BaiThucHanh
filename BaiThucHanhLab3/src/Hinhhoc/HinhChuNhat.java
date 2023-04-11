package Hinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc {
    float dai;
    float rong;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat(){
        ten = "HÌnh Chữ Nhật";
    }    
    public void nhapChieuDai(){     
            System.out.print("Nhap chieu dai =");
            dai=sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Nhap chieu dai =");
            rong=sc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi = 2* (dai + rong);
    }
    public void tinhDienTich(){
        dientich = dai * rong;
    }
}
