# 시작 오브젝트의 파이선 코드

import Entry

start = 0
finish = 0
multiple = 0
number = 0
plus1 = 0
plus2 = 0

def when_start():
    Entry.input("시작 숫자를 입력하세요.")
    start = Entry.answer()
    Entry.write_text(start)
    Entry.send_signal("finish")

# 끝 오브젝트의 파이선 코드

def when_get_signal("finish"):
    Entry.input("마지막 숫자를 입력하세요.")
    finish = Entry.answer()
    Entry.write_text(finish)
    Entry.send_signal("multiple")

# 배수 오브젝트의 파이선 코드

def when_get_signal("multiple"):
    Entry.input("찾고 싶은 배수를 입력하세요.")
    multiple = Entry.answer()
    Entry.write_text(multiple)
    Entry.input("갯수를 알고싶다면 1을, 합을 알고싶다면 2를 입력하세요.")
    if (Entry.answer() == 1):
        Entry.send_signal("number")
    else:
        Entry.send_signal("plus")

# 갯수 오브젝트의 파이선 코드

def when_get_signal("number"):
    while not (start == finish):    # 시작 숫자와 끝 숫자가 같을 때 까지 반복
        if ((start % multiple) == 0):    # 시작 숫자 ÷ 끝 숫자의 나머지가 0이라면
            number += 1    # 변수 number에 +1
        start += 1    # 시작 숫자 +1
    number = (number - 1)
    Entry.write_text(number)

# 합 오브젝트의 파이선 코드

def when_get_signal("plus"):
    while not (start == finish):
        if ((start % multiple) == 0):
            plus1 = start    # 시작 숫자를 plus1에 대입
            plus2 += plus1    # plus1을 plus2에 더하기
        start += 1
    Entry.write_text(plus2)