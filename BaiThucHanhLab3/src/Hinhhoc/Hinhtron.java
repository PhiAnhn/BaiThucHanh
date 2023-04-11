package Hinhhoc;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc {

    float r;
    public Hinhtron(){
        ten = "Hinh Tron";
    }
    public void nhapbankinh(){
            Scanner sc = new Scanner(System.in);           
            System.out.print("Nhap ban kinh r=");
            r=sc.nextFloat();
        sc.close();
        }
    public void tinhchuvi(){
        chuvi=2*r*Pi;
    } 
    public void tinhdientich(){
        dientich=r * r *Pi ;
    }
    public void inthongso(){
    System.out.printf("Chu vi cua hinh tron ban kinh %f = %f",r ,chuvi);
    System.out.printf("\nDien tich cua hinh tron ban kinh %f = %f",r, dientich);
    }
}
