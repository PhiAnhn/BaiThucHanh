import java.util.Scanner;

public class Bai2 {
        public static void main(String[] args) throws Exception {
            Hinhtru htru = new Hinhtru();
            nhanvien nv = new nhanvien();
            int chon;
        Scanner sc = new Scanner(System.in);    
        System.out.print("1.Hinhtru \n2.nhanvien \nVui long chon: ");  
        chon = sc.nextInt();
        switch(chon){
            case 1:
            htru.nhapbankinh();
            htru.nhapchieucao();
            htru.tinhchuvi();
            htru.tinhdientich();
            htru.tinhthetich();
            htru.inthongtin();
            break;
            case 2:
            nv.nhapthongtin();
            nv.tinhluong();
            nv.inthongtin();
            break;
        default:
        System.out.println("Vui long chon lai");  
      }
      sc.close();
}
}