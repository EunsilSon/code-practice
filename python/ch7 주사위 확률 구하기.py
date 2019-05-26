# 주사위 굴리기 파이선 코드

import Entry

d = 0
d6 = 0
throw = 0
repet = 0
pros = []

def when_click_object_on():
    for i in range(10):
        Entry.change_shape(random.randint(1, 6))
    d = random.randint(1, 6)
    Entry.change_shape(d)

# 주사위 확률 구하기의 파이선 코드

import Entry

d = 0
d6 = 0
throw = 0
repet = 0
pros = []

def when_click_object_on():
    Entry.input("던지는 횟수를 입력하세요.")
    throw = Entry.answer()
    for i in range(throw):
        for j in range(10):
            Entry.change_shape(random.randint(1, 6))
        d = random.randint(1, 6)
        Entry.change_shape(d)
        Entry.wait_for_sec(0.5)
        if (d6 == 6):
            d6 += 1
    Entry.print((d6 / throw))

# 반복해서 확률을 구한 후 확률 값 저장하기의 파이선 코드

import Entry

d = 0
d6 = 0
throw = 0
repet = 0
pros = []

def when_click_object_on():
    Entry.input("던지는 횟수를 입력하세요.")
    throw = Entry.answer()
    Entry.input("반복할 횟수를 입력하세요.")
    repet = Entry.answer()
    for i in range(repet):
        d6 = 0    # 리스트에 확률 값 저장 후 다시 변수에 새로운 값을 저장해야하기 때문에 0으로 초기화
        for j in range(throw):
            for k in range(10):    # 애니메이션 길이. 결과 영향 없음
                Entry.change_shape(random.randint(1, 6))
            d = random.randint(1, 6)
        Entry.change_shape(d)
        Entry.wait_for_sec(0.5)    # 있으나 마나
        if (d == 6):
            d6 += 1    # 6이 1번 나왔다는 뜻
        pros.append((d6 / throw))