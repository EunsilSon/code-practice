# 중절모를 쓴 사람(1) 오브젝트의 파이선 코드
# 사칙연산 하기

import Entry

n = 0
result = 0
i = 0

def when_start():
    Entry.print_for_sec("사칙연산 버튼을 클릭하세요!", 5)


# 더하기 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("첫 번째 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("두 번째 숫자를 입력하세요.")
    n = Entry.answer()
    result = (i + n)
    Entry.print_for_sec(("덧셈: " + result), 2)


# 빼기 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("첫 번째 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("두 번째 숫자를 입력하세요.")
    n = Entry.answer()
    result = (i - n)
    Entry.print_for_sec(("뺄셈: " + result), 2)


# 곱하기 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("첫 번째 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("두 번째 숫자를 입력하세요.")
    n = Entry.answer()
    result = (i * n)
    Entry.print_for_sec(("곱셈: " + result), 2)


# 나누기 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("첫 번째 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("두 번째 숫자를 입력하세요.")
    n = Entry.answer()
    result = (i / n)
    Entry.print_for_sec(("나눗셈: " + result), 2)


# 중절모를 쓴 사람(1)1 오브젝트의 파이선 코드
# 이어지는 숫자 계산하기

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_start():
    Entry.print_for_sec("구하고 싶은 값을 클릭하세요!", 2)


# 합계 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_click_object_on():
    result = 0
    Entry.input("시작 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("마지막 숫자를 입력하세요.")
    n = Entry.answer()
    while (i <= n):
        result = (result + i)
        i += 1
    Entry.print_for_sec(("합계: " + result), 4)


# 평균 오브젝트의 파이선 코드

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_click_object_on():
    sxoc = 0
    result = 0
    Entry.input("시작 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("마지막 숫자를 입력하세요.")
    n = Entry.answer()
    while (i <= n):
        result = (result + i)
        i += 1
        sxoc += 1
    Entry.print_for_sec(("평균: " + (result / sxoc)), 4)


# 중절모를 쓴 사람(1)2 오브젝트의 파이선 코드
# 연산자 선택해서 계산하기

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_start():
    result = 0
    Entry.input("시작 숫자를 입력하세요.")
    i = Entry.answer()
    Entry.input("마지막 숫자를 입력하세요.")
    n = Entry.answer()
    Entry.input("계산할 연산자(+ 또는 *)를 입력하세요.")
    if (Entry.answer() == "+"):
        while (i <= n):
            result = (result + i)
            i += 1
    if (Entry.answer() == "*"):
        result = 1
        while (i <= n):
            result = (result * 1)
            i += 1
    Entry.print_for_sec(("결과: " + result), 4)