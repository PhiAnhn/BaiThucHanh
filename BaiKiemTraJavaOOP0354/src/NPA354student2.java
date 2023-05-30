import java.util.Scanner;

public class NPA354student2 extends NPA354STUDENT {
    Scanner sc = new Scanner(System.in);
    String ten;
    @Override
    public void EnterData(){
        System.out.println("Nhap ho va ten");
        ten =sc.nextLine();
        System.out.println("Nhap vao so hoc sinh");
        
    }
}
