#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	// 변수 선언
	double mile, meter;

	// double형 실수 입력 받기
	printf("마일을 입력하시오: ");
	scanf("%lf", &mile);

	// 연산
	meter = mile * 1609.0;

	//출력 
	printf("%lf마일은 %lf미터입니다.", mile, meter);

	return 0;
}