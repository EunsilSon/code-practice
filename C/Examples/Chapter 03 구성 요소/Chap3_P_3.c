#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// 변수 선언, 초기화
	double base, height;
	double area = 0;

	// double형 실수 입력 받기
	printf("삼각형의 밑변:");
	scanf("%lf", &base);
	printf("삼각형의 높이:");
	scanf("%lf", &height);
	
	// 연산
	area = 0.5 * height * base;

	//출력
	printf("삼각형의 넓이: %lf", area);

	return 0;
}