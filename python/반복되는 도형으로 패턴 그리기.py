# 정다각형 그리기

import Entry

len = 0
각형 = 0
회전각도 = 0
회전횟수 = 0
이동각도 = 0
반복횟수 = 0

def when_start():
    Entry.clear_drawing()
    Entry.input("몇 각형의 도형인가?")
    rh83 = Entry.answer()
    회전각도 = (360 / 각형)
    Entry.start_drawing()
    for i in range(rh83):
        Entry.move_to_direction(50)
        Entry.add_rotation(회전각도)


# 정삼각형으로 패턴 그리기

import Entry

len = 0
각형 = 0
회전각도 = 0
회전횟수 = 0
이동각도 = 0
반복횟수 = 0
rh83 = 0

def when_start():
    Entry.clear_drawing()
    각형 = 3
    회전각도 = (360 / 각형)
    Entry.input("도형의 이동 각도는?")
    이동각도 = Entry.answer()
    반복횟수 = (360 / 이동각도)
    Entry.start_drawing()
    for i in range(반복횟수):
        for j in range(각형):
            Entry.move_to_direction(50)
            Entry.add_rotation(회전각도)
        Entry.add_rotation(이동각도)


# 색과 크기가 다른 사각형으로 패턴 그리기

import Entry

len = 0
각형 = 0
회전각도 = 0
회전횟수 = 0
이동각도 = 0
반복횟수 = 0
rh83 = 0

def when_start():
    len = 10
    Entry.start_drawing()
    for i in range(125):
        Entry.set_brush_color_to_random()
        for j in range(4):
            Entry.move_to_direction(len)
            Entry.add_rotation(-90)
        len += 0.8
        Entry.add_rotation(-5)
    Entry.stop_drawing()

def when_start():
    Entry.hide()


# 원으로 패턴 그리기

import Entry

len = 0
각형 = 0
회전각도 = 0
회전횟수 = 0
이동각도 = 0
반복횟수 = 0
rh83 = 0

def when_start():
    len = 3
    Entry.set_xy(0, 0)
    Entry.start_drawing()
    for i in range(10):
        Entry.set_brush_color_to_random()
        for j in range(120):
            Entry.move_to_direction(len)
            Entry.add_rotation(3)
        Entry.add_rotation(36)
    Entry.stop_drawing()

def when_start():
    Entry.hide()