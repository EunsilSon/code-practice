import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt(); // ������ �������� ��ȯ �� ���� ����
		
		// �������� ��ȯ�ϴ� ����
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