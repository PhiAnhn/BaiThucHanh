import java.util.Scanner;
public class App {
    private static Scanner scanner = new Scanner(System.in);

     
   
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac chu so "
                + "cua %d la: %d", n, totalDigitsOfNumber(n));
    }

    public static int totalDigitsOfNumber(int n) {
        int tong = 0;
        do {
            tong = tong + n % 10;
            n = n / 10;
        } while (n > 0);
        return tong;
    }
}