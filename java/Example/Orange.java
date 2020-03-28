import java.util.Scanner;

public class Orange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		int orange = sc.nextInt(); // 변수에 오렌지의 개수 저장
		
		int box = orange / 10; // 필요한 박스
		int over = orange % 10; // 남는 오렌지
		
		System.out.println(box + "개의 박스가 필요하고 " + over + "개가 남습니다.");
	}
}