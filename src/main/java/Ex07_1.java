import java.util.Scanner;

public class Ex07_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇단 : ");
        int dan = s.nextInt();
        System.out.println(dan+"단");
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + "X" + i + "=" + (dan*i));
        }
    }
}
