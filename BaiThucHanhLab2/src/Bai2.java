import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so n: ");
        n= sc.nextInt();
        if (n%2 == 0){
            System.out.print("So n la so chan");}
            else {
            System.out.print("So n la so le");
        }
    sc.close();    
    } 
}
