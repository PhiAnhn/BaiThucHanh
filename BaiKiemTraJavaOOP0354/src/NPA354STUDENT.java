import java.util.ArrayList;
import java.util.Scanner;

public class NPA354STUDENT{
    int number;
    ArrayList<Integer> arrlist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void EnterData (){
        System.out.println("Nhap so phan phan tu trong mang");
        int n = sc.nextInt();
        System.out.println("Nhap vao phan tu thu i[%d]");
        number = sc.nextInt();
        for(int i = 0; i <= n; i++){
            arrlist.add(number);
        } 

    }
    public void Insert(){
        System.out.println("Nhap them mot so vao mang ");
        number=sc.nextInt();
        arrlist.add(number);
    }
    public void Delete(){
        System.out.println("Nhap phan tu can xoa");
        int tim = sc.nextInt();
        for(int i = 0; i< arrlist.size();i++){
            if(arrlist.contains(tim)){
                arrlist.remove(tim);
            }
            else{
                System.out.println("Khong tim thay phan tu can xoa");
            }
        }
    }
    public void Display(){
        System.out.println("Danh sach cac phan tu la");
        for(int i =0; i < arrlist.size(); i++ ){
            arrlist.get(i);
        }
        System.out.println(arrlist.get(i));
    }
    public void SearchByName(){
        System.out.println("Nhap phan tu can tim");
        int tim = sc.nextInt();
        if(arrlist.contains(tim)){
            System.out.println(arrlist.get(tim));
        }
        else{
            System.out.println("Khong tim thay phan tu can tim");
        }
    }
}