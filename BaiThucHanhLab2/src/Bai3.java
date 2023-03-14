import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ten; 
        int nam ;
        System.out.print("Nhap ten :");
        ten=sc.next();
        System.out.print("Nhap nam sinh :");
        nam=sc.nextInt();
        int tuoi = 2023 - nam ;
        System.out.printf ("Tuoi cua ban %s = %d\n",ten, tuoi);
        if (tuoi<16){
            System.out.printf("Ban %s o do tuoi vi thanh nien",ten);
        }
        if (tuoi>= 16){
            System.out.printf("Ban %s o do tuoi truong thanh",ten);
        }
        else{
            System.out.printf("Ban %s da gia",ten);
        }
sc.close();
    }     
}
