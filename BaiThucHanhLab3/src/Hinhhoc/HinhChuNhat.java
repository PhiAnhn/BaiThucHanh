package Hinhhoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc {
    private float dai;
    private float rong;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat(){
        super.setTen ("Hinh Chu Nhat");
    }    

    public float getDai(){
        return dai;
    }
    public void setDai (float dai){
        this.dai = dai;
    }
    public void NhapChieuDai(Scanner sc){
        System.out.print("Nhap chieu dai =");
        setDai(sc.nextFloat());
    }
    public float getRong(){
        return rong;
    }
    public void setRong(float rong){
        this.rong = rong;
    }
    public void NhapChieuRong( Scanner sc){
        System.out.print("Nhap chieu rong =");
        setRong(sc.nextFloat());
    }
    public void tinhChuVi(){
        float chuvi = 2* (dai + rong);
        setChuVi(chuvi);
    }
    public void tinhDienTich(){
        float dientich = dai * rong;
        setDienTich(dientich);
    }
}
