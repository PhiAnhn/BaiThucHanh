package main;
import Hinhhoc.HinhChuNhat;
import Hinhhoc.HinhVuong;
import Hinhhoc.Hinhtron;
import Hinhhoc.Hinhtru;

public class Main {
    public static void main(String[] args) throws Exception {

        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuvi();
        hinhvuong.inDienTich();


        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.xuatTen();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuvi();
        hinhchunhat.inDienTich();

        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatTen();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inChuvi();
        hinhtron.inDienTich();


        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatTen();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inTheTich();
        
       
}
}
