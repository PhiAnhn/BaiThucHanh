import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong =0;
        do {
            System.out.println("nhap vao so:");
            n = sc.nextInt();
            tong += n;
                 
            if (tong > 100)
                break;
        } while (n > 0);
             
        System.out.println("Tong cac so = " + tong );
        sc.close();
    }
    
}
