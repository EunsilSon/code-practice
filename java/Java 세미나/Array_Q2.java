/*
1차원 배열을 생성하고 값을 입력한 뒤 내림차순으로 정렬하여 출력하세요.
(배열의 크기는 최소 5, 값 입력 방식은 제한을 두지 않습니다.)
*/
import java.util.Arrays;

public class Array_Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 7, 2, 9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] > arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
