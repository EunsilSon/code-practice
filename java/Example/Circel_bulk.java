import java.util.Scanner;

public class Circel_bulk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("���� �������� �Է��Ͻÿ�: ");
		double rad = sc.nextDouble(); // ������ ���� ������ ����
		
		double bulk = ((4 /3) * 3.14 * (rad * rad * rad)); // ���� ���� ���
		
		System.out.println("���� ���Ǵ�: " + bulk);
	}
}