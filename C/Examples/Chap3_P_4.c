#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	// ���� ����, �ʱ�ȭ
	float f;
	float c = 0;

	// double�� �Ǽ� �Է� �ޱ�
	printf("ȭ�� ���� �Է��Ͻÿ�:");
	scanf("%f", &f);

	// ����
	c = (5.0 / 9.0) * (f - 32.0);

	// ���
	printf("���� ���� %f���Դϴ�.", c);
	
	return 0;
}