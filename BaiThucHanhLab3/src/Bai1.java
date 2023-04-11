
import java.util.Scanner;

import Hinhhoc.Hinhtron;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        Student sv = new Student();
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.print("1.Hinh tron \n2.Student \nVui long chon: ");  
        chon = sc.nextInt();
        switch(chon){
            case 1:
                ht.nhapbankinh();
                ht.tinhchuvi();
                ht.tinhdientich();
                ht.inthongso();
                break;
            case 2:
                sv.nhapthongtin();
                sv.tinhtuoi();
                sv.inthongtin();
                break;
            default:
                System.out.println("Vui long lua chon dung!");
        }
    sc.close();
    }

}
