# ���ٰ��� �׸���

import Entry

len = 0
���� = 0
ȸ������ = 0
ȸ��Ƚ�� = 0
�̵����� = 0
�ݺ�Ƚ�� = 0

def when_start():
    Entry.clear_drawing()
    Entry.input("�� ������ �����ΰ�?")
    rh83 = Entry.answer()
    ȸ������ = (360 / ����)
    Entry.start_drawing()
    for i in range(rh83):
        Entry.move_to_direction(50)
        Entry.add_rotation(ȸ������)


# ���ﰢ������ ���� �׸���

import Entry

len = 0
���� = 0
ȸ������ = 0
ȸ��Ƚ�� = 0
�̵����� = 0
�ݺ�Ƚ�� = 0
rh83 = 0

def when_start():
    Entry.clear_drawing()
    ���� = 3
    ȸ������ = (360 / ����)
    Entry.input("������ �̵� ������?")
    �̵����� = Entry.answer()
    �ݺ�Ƚ�� = (360 / �̵�����)
    Entry.start_drawing()
    for i in range(�ݺ�Ƚ��):
        for j in range(����):
            Entry.move_to_direction(50)
            Entry.add_rotation(ȸ������)
        Entry.add_rotation(�̵�����)


# ���� ũ�Ⱑ �ٸ� �簢������ ���� �׸���

import Entry

len = 0
���� = 0
ȸ������ = 0
ȸ��Ƚ�� = 0
�̵����� = 0
�ݺ�Ƚ�� = 0
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


# ������ ���� �׸���

import Entry

len = 0
���� = 0
ȸ������ = 0
ȸ��Ƚ�� = 0
�̵����� = 0
�ݺ�Ƚ�� = 0
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