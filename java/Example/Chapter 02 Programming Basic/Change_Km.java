import java.util.Scanner;

public class Change_Km {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�:");
		double m = sc.nextInt(); // ������ ��ȯ �� ���� ����
		
		double km = m * 1.609; // ������ ������ ų�ι��ͷ� ��ȯ�� ����
		
		System.out.println(m + "������ " + km + "ų�ι����Դϴ�.");
	}
}