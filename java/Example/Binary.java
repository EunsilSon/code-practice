import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt(); // 변수에 이진수로 변환 할 정수 저장
		
		// 이진수로 변환하는 연산
		int a = num % 2;
		int b = (num / 2) % 2;
		int c = ((num / 2) / 2) % 2;
		int d = (((num / 2) / 2) / 2) % 2;
		int e = ((((num / 2) / 2) / 2) / 2) % 2;
		int f = ((((num / 2) / 2) / 2) / 2) / 2;
		
		System.out.print(num + ": " + f);
		System.out.print(e);
		System.out.print(d);
		System.out.print(c);
		System.out.print(b);
		System.out.print(a);
	}
}