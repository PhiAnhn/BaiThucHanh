import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;
        float tbc;
     
            System.out.print("Nhap vao kich thuoc cua mang: ");
            n = sc.nextInt();
        int A[] =new int [n];
        for(int i = 0; i< n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i+1);
            A[i] = sc.nextInt();
            tong += A[i];
            }
    
            tbc =(float) tong / n;
        System.out.printf("Trung binh cong cua day so la: %d ", tbc );
        sc.close();
        }
}

