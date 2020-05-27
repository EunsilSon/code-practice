#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// 변수 선언
	double x, y, z;
	double sum;
	double avg;

	// double형 실수 입력 받기
	printf("첫 번째 실수를 입력하시오: ");
	scanf("%lf", &x);
	printf("두 번째 실수를 입력하시오: ");
	scanf("%lf", &y);
	printf("세 번째 실수를 입력하시오: ");
	scanf("%lf", &z);

	// 연산
	sum = x + y + z;
	avg = sum / 3.0;

	// 출력
	printf("합은 %lf이고 평균은 %lf입니다.", sum, avg);

	return 0;
}