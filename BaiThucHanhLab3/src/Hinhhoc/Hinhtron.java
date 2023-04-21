package Hinhhoc;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc {

    private float r;
    public Hinhtron(){
        super.setTen("Hinh Tron") ;
    }
    public float getBanKinh(){
        return r;
    }
    public void setBanKinh(float r){
        this.r = r;
    }
    public void nhapbankinh(Scanner sc ){         
            System.out.print("Nhap ban kinh r=");
            setBanKinh(sc.nextFloat());
        }
    public void tinhChuVi(){
        float chuvi=2*r*super.getPi();
        super.setChuVi(chuvi);
    } 
    public void tinhDienTich(){
        float dientich =r * r *super.getPi() ;
        super.setDienTich(dientich);
    }
}
