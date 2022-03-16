public class Ex01 {
    public static void main(String[] args) {
        int hap = 2+3;
        System.out.printf("hap ==> %d \n", hap);

        int a = 3;
        int b = 2;
        int c = a + b;
        System.out.printf("C ==> %d \n", c);

        int daeIp = 1;
        daeIp += 4;
        System.out.printf("더함 = %d \n", daeIp); // 5
        daeIp -= 4;
        System.out.printf("뺌 = %d \n", daeIp); //1
        daeIp *= 8;
        System.out.printf("곱함 = %d \n", daeIp); //8
        daeIp /= 4;
        System.out.printf("나눔 = %d \n", daeIp); //2
        daeIp /= 3;
        System.out.printf("나눔 = %d \n", daeIp); //2


        float newDaeIp;
        newDaeIp = daeIp % 3;
        System.out.printf("나머지 = %f \n", newDaeIp); //1

        double num=2;
        System.out.printf("빡추를 위한 계산(나눔) = %f \n", num/=3);
        System.out.printf("빡추를 위한 계산(나머지) = %f \n", num%=3);
    }
}

/*
* 산술 연산자 vs 산술 대입 연산자
*
*
*
* */