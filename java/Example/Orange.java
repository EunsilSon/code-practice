import java.util.Scanner;

public class Orange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		int orange = sc.nextInt(); // ������ �������� ���� ����
		
		int box = orange / 10; // �ʿ��� �ڽ�
		int over = orange % 10; // ���� ������
		
		System.out.println(box + "���� �ڽ��� �ʿ��ϰ� " + over + "���� �����ϴ�.");
	}
}