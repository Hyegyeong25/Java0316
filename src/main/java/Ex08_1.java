public class Ex08_1 {
    public static void main(String[] args) {
        for(int dan = 1; dan <= 9; dan++){
            System.out.println(dan+"단");
            for(int i = 1; i <= 9; i++){
                System.out.println(dan+"X"+i+"="+(dan*i));
            }
        }
    }
}
