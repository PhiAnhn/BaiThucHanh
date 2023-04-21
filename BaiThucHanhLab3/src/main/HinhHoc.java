package main;
import java.util.Scanner;

import Hinhhoc.HinhChuNhat;
import Hinhhoc.HinhVuong;
import Hinhhoc.Hinhtron;
import Hinhhoc.Hinhtru;

public class HinhHoc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuvi();
        hinhvuong.inDienTich();


        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.xuatTen();
        hinhchunhat.NhapChieuDai(sc);;
        hinhchunhat.NhapChieuRong(sc);
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuvi();
        hinhchunhat.inDienTich();

        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatTen();
        hinhtron.nhapbankinh(sc);
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuvi();
        hinhtron.inDienTich();


        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatTen();
        hinhtru.NhapChieuCao();;
        hinhtru.tinhChuVi();
        hinhtru.inChuvi();
        hinhtru.tinhDienTich();
        hinhtru.inDienTich();
        hinhtru.tinhthetich();
        hinhtru.inTheTich();
        
       
}
}
