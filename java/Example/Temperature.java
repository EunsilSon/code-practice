import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ�� �µ��� �Է��ϼ���: ");
		double f = sc.nextDouble(); // ������ ȭ�� �µ� ����
		
		double c = ((5.0 / 9.0) * (f - 32.0)); // ȭ�� �µ��� ���� �µ��� ȯ��
		
		System.out.println("���� ���� " + c + "���Դϴ�.");
	}
}