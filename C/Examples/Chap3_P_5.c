#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// ���� ����, �ʱ�ȭ
	double x;
	double result = 0;

	// double�� �Ǽ� �Է� �ޱ�
	printf("�Ǽ��� �Է��ϼ���: ");
	scanf("%lf", &x);

	// ����
	result = ((3 * x * x) + (7 * x) + 11);

	// ���
	printf("���׽��� ���� %lf", result);

	return 0;
}