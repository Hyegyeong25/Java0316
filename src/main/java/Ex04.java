import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        String name = "주혜경";
        Scanner in = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String inputName = in.nextLine();
        if(name.equals(inputName)){
            System.out.print("몇단 : ");
            int num = in.nextInt();
            int num2 = 0;
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
            System.out.printf("%d x %d = %d\n", num, ++num2, num*num2);
        } else {
            System.out.println("로그인 실패");
        }

    }
}
