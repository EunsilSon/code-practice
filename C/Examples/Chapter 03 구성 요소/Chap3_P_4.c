#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	// 변수 선언, 초기화
	float f;
	float c = 0;

	// double형 실수 입력 받기
	printf("화씨 값을 입력하시오:");
	scanf("%f", &f);

	// 연산
	c = (5.0 / 9.0) * (f - 32.0);

	// 출력
	printf("섭씨 값은 %f도입니다.", c);
	
	return 0;
}