import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Slide111
 {
    public static void main(String[] args) {
        DecimalFormat dcf = new DecimalFormat("#. ##");
        LinkedList<Integer> arrlist = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;
        int sum =0, count=0;
        double tbcong;
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrlist.addFirst(number);
        }

        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }
        
        for (int i = 0; i < n; i++ ){
            if( arrlist.get(i)  % 2 ==0){
                sum += arrlist.get(i);
                count ++;
            }

        }
        tbcong = (double)sum / count;
        System.out.println("\nTrung binh cong cua cac so chan trong mang la :" +dcf.format(tbcong));
    sc.close();    
}
}
