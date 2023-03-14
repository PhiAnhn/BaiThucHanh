import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap vao so thu nhat");
        a = sc.nextFloat();
        System.out.println("Nhap vao so thu hai");
        b = sc.nextFloat();
        System.out.printf("Tong cua hai so la %.2f + %.2f = %.2f ",a ,b,a+b);
        System.out.printf("\nHieu cua hai so la %.2f - %.2f = %.2f ",a ,b,a-b);
        System.out.printf("\nTich cua hai so la %.2f * ́%.2f = %.2f ",a ,b,a*b);
        System.out.printf("\nThuong cua hai so la %.2f / %.2f = %.2f ",a ,b,a/b);
        System.out.printf("\nChia lay du cua hai so la  = %2f ", a % b);
        if(a==b){
            System.out.println("Hai so bang nhau");          
        }
        if(a>b){
            System.out.printf("So %.2f lon hon so %.2f",a,b);
        }       
        if(a<b){
            System.out.printf("So %.2f nho hon so %.2f",a,b);           
        }
sc.close();


    }
}
