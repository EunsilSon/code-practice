import java.util.Scanner;

public class Market {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		int consumer = sc.nextInt(); // ������ �մԿ��� ���� �ݾ� ����
		
		System.out.print("��ǰ�� �Ѿ�: ");
		int total = sc.nextInt(); // ������ ��ǰ�� �Ѿ� ����
		
		int charge = consumer - total; // �Ž����� ���
		int surtax = total / 10; // �ΰ��� ���
		
		System.out.println("�ΰ���: " + surtax);
		System.out.println("�ܵ�: " + charge);
	}
}