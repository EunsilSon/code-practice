#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// ���� ����
	double x, y, z;
	double sum;
	double avg;

	// double�� �Ǽ� �Է� �ޱ�
	printf("ù ��° �Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &x);
	printf("�� ��° �Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &y);
	printf("�� ��° �Ǽ��� �Է��Ͻÿ�: ");
	scanf("%lf", &z);

	// ����
	sum = x + y + z;
	avg = sum / 3.0;

	// ���
	printf("���� %lf�̰� ����� %lf�Դϴ�.", sum, avg);

	return 0;
}