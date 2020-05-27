/* 사용자로부터 정수를 16진수로 입력받아서 8진수, 10진수, 16진수 형태로 출력하는 프로그램을 작성하라 */
#include <stdio.h>

int main(void) {
	int data;

	printf("16진수 정수를 입력하시오: ");
	scanf_s("%x", &data);
	printf("8진수로는 %#o입니다\n", data);
	printf("10진수로는 %d입니다\n", data);
	printf("16진수로는 %#x입니다\n", data);

	return 0;
}