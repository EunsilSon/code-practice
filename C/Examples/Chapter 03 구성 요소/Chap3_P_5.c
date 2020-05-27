#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// 변수 선언, 초기화
	double x;
	double result = 0;

	// double형 실수 입력 받기
	printf("실수를 입력하세요: ");
	scanf("%lf", &x);

	// 연산
	result = ((3 * x * x) + (7 * x) + 11);

	// 출력
	printf("다항식의 값은 %lf", result);

	return 0;
}