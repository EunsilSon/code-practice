public class variable_calculation {
    public static void main(String[] args) {

        float a = (float)7.7;
        float b = (float)9.4;
        String sc = "손은실";
        int n1 = 22;
        int n2 = 55;

        System.out.println("자신의 성명 입력: " + sc);
        System.out.println("n1 값 입력: " + n1);
        System.out.println("n2 값 입력: " + n2);
        System.out.println("a + b한 후 정수값으로 변환 = " + (int)(a + b));
        System.out.println("a와 b를 정수 변환 후 + 연산 한 값 = " + ((int)a + (int)b));
        System.out.println("n1 + n2 = " + (n1 + n2));
        System.out.println("a x b = " + a * b);
        System.out.printf("a x b한 후 소수 한 자리로 출력 : " + "%.1f" , a * b);
    }
}