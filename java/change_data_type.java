public class change_data_type {
    public static void main(String[] args) {

        float a = (float) 8.9;
        float b = (float) 4.2;

        System.out.println("a를 b로 나눈 나머지 값 = " + (a % b));
        System.out.println("a + b한 후 정수값으로 변환 = " + (int)(a + b));
        System.out.println("a와 b를 정수 변환 후 + 연산 한 값 = " + ((int)a + (int)b));
        System.out.println("따옴표 5개 출력 " + "\"" + "\"" + "\"" + "\"" + "\"");
        System.out.println("백슬러쉬 5개 출력 " + "\\" + "\\" + "\\" + "\\" + "\\");
        System.out.println("a < 0 결과 출력: " + (a < 0));
        System.out.println("b > 3 결과 출력: " + (b > 3));

    }
}