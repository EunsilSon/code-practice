/*int형 변수 x와 y의 값을 서로 교환하는 프로그램을 작성하라.
    별도의 변수가 필요하면 정의하여 사용하라.
    변수 x와 y는 10, 20의 값으로 초기화하라. */
#include <stdio.h>

int main(void)
{
	int x = 10;
	int y = 20;
	int tmp; // 변수의 값을 임시로 저장 할 변수

	printf("x=%d y=%d \n", x, y); // 교환 전 변수

	tmp = x;
	x = y;
	y = tmp;

	printf("x=%d y=%d", x, y); // 교환 후 변수
	return 0;
}