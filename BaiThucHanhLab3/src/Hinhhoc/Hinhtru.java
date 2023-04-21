package Hinhhoc;
import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    private float h;
    Scanner sc = new Scanner(System.in); 
    public Hinhtru(){
        super.setTen("Hinh Tru");
    }   
    public float getChieuCao(){
        return h;
    }
    public void setChieuCao(float h){
        this.h= h;
    }  
    public void NhapChieuCao(){           
            System.out.print("Nhap chieu cao h=");
            setChieuCao(sc.nextFloat());
            }          
    public void tinhchuvi(){
                float chuvi=2*super.getBanKinh()*super.getPi()*h;
                super.setChuVi(chuvi);
            }    
    public void tinhdientich(){
                float dientich=2*(float) Math.pow(super.getBanKinh(), 2)*super.getPi() + 2*super.getPi()*super.getBanKinh()*h;
                super.setDienTich(dientich);
            } 
    public void tinhthetich(){
                float thetich= (float) Math.pow(super.getBanKinh(), 2) * super.getPi()*h;
                super.setTheTich(thetich);
            }        
    
}
