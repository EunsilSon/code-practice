# ������ ������ ����

# �¾� ������Ʈ�� ���̼� �ڵ�

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


# ���� ������Ʈ�� ���̼� �ڵ�

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



# ���� ������ ����

# �� ������Ʈ�� ���̼� �ڵ�

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
        Entry.set_x((Entry.value_of_object("�¾�� - ����1", "x") + (30 * math.cos(moon))))
        Entry.set_y((Entry.value_of_object("�¾�� - ����1", "y") + (30 * math.sin(moon))))


# �¾�� �༺�� ������ ����

# �¾�� - ���� ������Ʈ�� ���̼� �ڵ�

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


# �¾�� - �ݼ� ������Ʈ�� ���̼� �ڵ�

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


# �¾�� - ȭ�� ������Ʈ�� ���̼� �ڵ�

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


# �¾�� - �� ������Ʈ�� ���̼� �ڵ�

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