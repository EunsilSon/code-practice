#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// ���� ����, �ʱ�ȭ
	double base, height;
	double area = 0;

	// double�� �Ǽ� �Է� �ޱ�
	printf("�ﰢ���� �غ�:");
	scanf("%lf", &base);
	printf("�ﰢ���� ����:");
	scanf("%lf", &height);
	
	// ����
	area = 0.5 * height * base;

	//���
	printf("�ﰢ���� ����: %lf", area);

	return 0;
}