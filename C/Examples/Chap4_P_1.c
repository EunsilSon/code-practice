/*사용자로부터 하나의 실수를 입력받아서 소수점 표기 방법과
  지수 표기 방법으로 동시에 출력하는 프로그램을 작성하라.*/

#include <stdio.h>

int main(void)
{
	float f;

	printf("실수를 입력하시오: ");
	scanf_s("%f", &f);
	printf("실수 형식으로는 %f입니다.\n", f); // 실수
	printf("지수 형식으로는 %e입니다.", f); // 지수

	return 0;
}