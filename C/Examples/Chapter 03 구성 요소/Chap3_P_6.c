#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// ���� ����, �ʱ�ȭ
	double weight_on_earth;
	double weight_on_moon = 0;

	// double�� �Ǽ� �Է� �ޱ�
	printf("�����Ը� �Է��ϼ���(����: kg): ");
	scanf("%lf", &weight_on_earth);

	// ����
	weight_on_moon = weight_on_earth * 0.17;

	// ���
	printf("�޿����� �����Դ� %lfkg�Դϴ�.", weight_on_moon);

	return 0;
}