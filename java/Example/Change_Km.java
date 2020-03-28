import java.util.Scanner;

public class Change_Km {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오:");
		double m = sc.nextInt(); // 변수에 변환 할 마일 저장
		
		double km = m * 1.609; // 변수에 마일을 킬로미터로 변환해 저장
		
		System.out.println(m + "마일은 " + km + "킬로미터입니다.");
	}
}