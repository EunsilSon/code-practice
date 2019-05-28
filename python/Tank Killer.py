# 포물선 운동을 이용한 탱크 격파 게임

# 군인 오브젝트의 파이선 코드

import Entry

time = 0.1
drawx = 0    # x축의 포물선 각도
drawy = 0    # y축의 포물선 각도
g = 9.8
vx = 0    # x축의 포물선 이동각도
vy = 0    # y축의 포물선 이동각도
velocity = 0    # 폭탄 속도
angle = 0    # 폭탄 각도
heart = 1    # 제한 횟수

def when_start():
    for i in range(3):    # 폭탄 제한 횟수는 3번
        Entry.input("폭탄의 속도를 입력하세요.")
        velocity = Entry.answer()
        Entry.input("폭탄의 각도를 입력하세요.")
        angle = Entry.answer()
        if (heart == 2):    # 제한 횟수
            Entry.send_signal("heart2")
        if (heart == 3):
            Entry.send_signal("heart3")
        heart += 1
        Entry.send_signal("throw")    # 던지기 신호
        Entry.send_signal("heart1")
    Entry.send_signal("fail")

# 폭탄 오브젝트의 파이선 코드

import Entry

def when_get_signal("throw"):    # 던지기 신호 받았을때
    Entry.clear_drawing()    # 포물선 지우기
    Entry.set_xy(-133.2, -76)    # 폭탄 위치
    vx = (velocity * math.cos(angle))    # 폭탄 날아갈 x축
    vy = (velocity * math.sin(angle))    # 폭탄 날아갈 y축
    Entry.start_drawing()    # 포물선 그리기
    while True:
        vy += ((-1 * g) * time)
        drawy = (Entry.value_of_object("폭탄", "y") + (vy * time))    # 포물선 그릴 y축
        drawx = (Entry.value_of_object("폭탄", "x") + (vx * time))    # 포물선 그릴 x축
        Entry.set_xy(drawx, drawy)
        if (drawy < -125):    # 화면 끝에 닿으면 포물선 그리기 멈추기
            Entry.stop_code("this")
        if Entry.is_touched("탱크(2)"):    # 폭탄이 탱크에 닿으면
            Entry.send_signal("success")    # 성공 신호 보내기

# 탱크 오브젝트의 파이선 코드

import Entry

def when_start():
    while True:    # 무한반복
        Entry.set_xy(175, -90)    # 탱크 위치
        while not Entry.is_touched("edge"):    #벽에 닿을때 까지
            Entry.move_to_direction(5)    # 5씩 움직이기

def when_get_signal("success"):    # 성공 신호 받으면
    while True:
        Entry.add_rotation_for_sec(180, 1)    # 탱크 회전

# SUCCESS 오브젝트의 파이선 코드

import Entry

def when_start():
    Entry.hide()

def when_get_signal("success"):
    Entry.show()

# FAIL 오브젝트의 파이선 코드

import Entry

def when_get_signal("fail"):
    Entry.wait_for_sec(0.3)
    Entry.show()

def when_start():
    Entry.hide()

# 제한 횟수(1) 오브젝트의 파이선 코드

import Entry

def when_get_signal("heart1"):
    Entry.hide()

# 제한 횟수(2) 오브젝트의 파이선 코드

import Entry

def when_get_signal("heart2"):
    Entry.hide()

# 제한 횟수(3) 오브젝트의 파이선 코드

import Entry

def when_get_signal("heart3"):
    Entry.hide()