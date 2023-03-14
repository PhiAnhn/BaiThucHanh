import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,a = 1;
        long giaithua = 1;
        do {
            System.out.println("Nhap vao mot so nguyen duong: ");
            n = sc.nextInt();
        } while ((n <= 0) || (n > 10));
        while (a <= n) {
            giaithua *= a;
            a++;
        }
         
        System.out.println(n + "! = " + giaithua);
        sc.close();
    }
    
}
