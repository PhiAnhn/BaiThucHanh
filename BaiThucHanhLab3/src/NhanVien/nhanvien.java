package NhanVien;
import java.util.Scanner;

public class nhanvien {
    String mnv;
    String hoten;
    int tuoi;
    float hsluong , luongcoban = 1490000, luong;
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);           
        System.out.print("Nhap ma nhan vien =");
        mnv=sc.nextLine();
        System.out.print("Nhap ho va ten nhan vien =");
        hoten=sc.nextLine();
        System.out.print("Nhap tuoi cua nhan vien =");
        tuoi=sc.nextInt();
        System.out.print("Nhap he so luong =");
        hsluong=sc.nextFloat();
        sc.close();
    }
    public void tinhluong(){
        luong=hsluong*luongcoban;
    }
    public void inthongtin(){
        System.out.printf("Nhan vien tren co thong tin la: \nMa nhan vien:%s \nHo va ten:%s \nTuoi:%d \nHe so luong:%f \nLuong chinh thuc:%f",mnv, hoten, tuoi,hsluong, luong);
    }    

    
}
