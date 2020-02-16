/*
2차원 배열을 생성하고 값을 입력한 뒤 각 열의 합계와 평균을 출력하세요.
(크기는 최소 3 X 3, 값 입력 방식은 제한을 두지 않습니다.)
*/
public class Array_Q1 {
    public static void main(String[] args) {
        int num = 0;
        int[][] arr = {{1, 2, 3},{1, 2, 3},{1, 2, 3}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                num += arr[i][j];
            }
        }
        int average = num / arr.length;

        System.out.println("열의 합계: " + num + "\n" + "열의 평균: " + average);
    }
}