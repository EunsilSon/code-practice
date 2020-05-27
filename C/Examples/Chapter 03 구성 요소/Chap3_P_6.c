#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// 변수 선언, 초기화
	double weight_on_earth;
	double weight_on_moon = 0;

	// double형 실수 입력 받기
	printf("몸무게를 입력하세요(단위: kg): ");
	scanf("%lf", &weight_on_earth);

	// 연산
	weight_on_moon = weight_on_earth * 0.17;

	// 출력
	printf("달에서의 몸무게는 %lfkg입니다.", weight_on_moon);

	return 0;
}