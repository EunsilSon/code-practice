#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// ���� ����
	double mile, meter;

	// double�� �Ǽ� �Է� �ޱ�
	printf("������ �Է��Ͻÿ�: ");
	scanf("%lf", &mile);

	// ����
	meter = mile * 1609.0;

	//��� 
	printf("%lf������ %lf�����Դϴ�.", mile, meter);

	return 0;
}