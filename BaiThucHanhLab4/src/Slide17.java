import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add (0);
        arrList.add (7);
        arrList.add (1);
        arrList.add (9);

        System.out.print("Cac phan tu co trong arrList la: ");
        for ( int number: arrList){
            System.out.print(number + "\t");
}
    }
}
