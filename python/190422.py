# 지구의 자전과 공전

# 태양 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    while True:
        Entry.add_rotation(-5)


# 지구 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    earth = 0
    while True:
        Entry.add_rotation(-10)
        earth += 1
        Entry.set_x((100 * math.cos(earth)))
        Entry.set_y((100 * math.sin(earth)))



# 달의 자전과 공전

# 달 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    moon = 0
    while True:
        Entry.add_rotation(-30)
        moon += 13
        Entry.set_x((Entry.value_of_object("태양계 - 지구1", "x") + (30 * math.cos(moon))))
        Entry.set_y((Entry.value_of_object("태양계 - 지구1", "y") + (30 * math.sin(moon))))


# 태양계 행성의 자전과 공전

# 태양계 - 수성 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    mercury = 0
    while True:
        Entry.add_rotation(-10)
        mercury += 1
        Entry.set_x((50 * math.cos(mercury)))
        Entry.set_y((50 * math.sin(mercury)))


# 태양계 - 금성 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    venus = 0
    while True:
        Entry.add_rotation(-10)
        venus += 1
        Entry.set_x((70 * math.cos(venus)))
        Entry.set_y((70 * math.sin(venus)))


# 태양계 - 화성 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    mars = 0
    while True:
        Entry.add_rotation(-10)
        mars += 1
        Entry.set_x((160 * math.cos(mars)))
        Entry.set_y((160 * math.sin(mars)))


# 태양계 - 목성 오브젝트의 파이선 코드

import Entry

earth = 0
moon = 0
mercury = 0
venus = 0
mars = 0
jupiter = 0
jupitar = 0

def when_start():
    Entry.set_brush_color_to("#FFFFFF")
    Entry.start_drawing()
    jupitar = 0
    while True:
        Entry.add_rotation(-10)
        jupitar += 1
        Entry.set_x((200 * math.cos(jupitar)))
        Entry.set_y((200 * math.sin(jupitar)))