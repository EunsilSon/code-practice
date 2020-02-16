/*
1차원 배열을 생성하고 값을 입력한 뒤 N보다 작은 모든 수를 출력하세요.
(N은 알아서 정의, 크기는 최소 5, 값 입력 방식은 제한을 두지 않습니다.)
*/
public class Array_Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 15};
        int N = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < N) {
                System.out.println(arr[i]);
            }
        }
    }
}
