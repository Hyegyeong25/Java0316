import java.util.Scanner;

public class Ex06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇번 출력? : ");
        int num = sc.nextInt();
        for(int i=1; i <= num; i++){
            System.out.println(i+"번째 출력");
        }

    }
}
