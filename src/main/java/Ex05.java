import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = s.nextInt();
        if(age >=20){
            System.out.println("성인 입니다.");
            if(age >= 30) System.out.println("성인이고, 30대 입니다. 중첩 if");
        } else if(age >= 30) {
            System.out.println("성인이고 30대 입니다. 바깥");
        } else {
            System.out.println("미성년자입니다.");
        }
        System.out.println("분기 종료");
    }
}
