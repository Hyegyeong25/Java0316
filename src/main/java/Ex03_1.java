import java.util.Scanner;

public class Ex03_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;

        System.out.print("몇단? : ");
        int dan = s.nextInt();
        System.out.println(dan+"단");
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);
        System.out.println(dan + "X" + ++cnt + "=" + dan * cnt);


    }
}
