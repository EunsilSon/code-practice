# ������ ��� �̿��� ��ũ ���� ����

# ���� ������Ʈ�� ���̼� �ڵ�

import Entry

time = 0.1
drawx = 0    # x���� ������ ����
drawy = 0    # y���� ������ ����
g = 9.8
vx = 0    # x���� ������ �̵�����
vy = 0    # y���� ������ �̵�����
velocity = 0    # ��ź �ӵ�
angle = 0    # ��ź ����
heart = 1    # ���� Ƚ��

def when_start():
    for i in range(3):    # ��ź ���� Ƚ���� 3��
        Entry.input("��ź�� �ӵ��� �Է��ϼ���.")
        velocity = Entry.answer()
        Entry.input("��ź�� ������ �Է��ϼ���.")
        angle = Entry.answer()
        if (heart == 2):    # ���� Ƚ��
            Entry.send_signal("heart2")
        if (heart == 3):
            Entry.send_signal("heart3")
        heart += 1
        Entry.send_signal("throw")    # ������ ��ȣ
        Entry.send_signal("heart1")
    Entry.send_signal("fail")

# ��ź ������Ʈ�� ���̼� �ڵ�

import Entry

def when_get_signal("throw"):    # ������ ��ȣ �޾�����
    Entry.clear_drawing()    # ������ �����
    Entry.set_xy(-133.2, -76)    # ��ź ��ġ
    vx = (velocity * math.cos(angle))    # ��ź ���ư� x��
    vy = (velocity * math.sin(angle))    # ��ź ���ư� y��
    Entry.start_drawing()    # ������ �׸���
    while True:
        vy += ((-1 * g) * time)
        drawy = (Entry.value_of_object("��ź", "y") + (vy * time))    # ������ �׸� y��
        drawx = (Entry.value_of_object("��ź", "x") + (vx * time))    # ������ �׸� x��
        Entry.set_xy(drawx, drawy)
        if (drawy < -125):    # ȭ�� ���� ������ ������ �׸��� ���߱�
            Entry.stop_code("this")
        if Entry.is_touched("��ũ(2)"):    # ��ź�� ��ũ�� ������
            Entry.send_signal("success")    # ���� ��ȣ ������

# ��ũ ������Ʈ�� ���̼� �ڵ�

import Entry

def when_start():
    while True:    # ���ѹݺ�
        Entry.set_xy(175, -90)    # ��ũ ��ġ
        while not Entry.is_touched("edge"):    #���� ������ ����
            Entry.move_to_direction(5)    # 5�� �����̱�

def when_get_signal("success"):    # ���� ��ȣ ������
    while True:
        Entry.add_rotation_for_sec(180, 1)    # ��ũ ȸ��

# SUCCESS ������Ʈ�� ���̼� �ڵ�

import Entry

def when_start():
    Entry.hide()

def when_get_signal("success"):
    Entry.show()

# FAIL ������Ʈ�� ���̼� �ڵ�

import Entry

def when_get_signal("fail"):
    Entry.wait_for_sec(0.3)
    Entry.show()

def when_start():
    Entry.hide()

# ���� Ƚ��(1) ������Ʈ�� ���̼� �ڵ�

import Entry

def when_get_signal("heart1"):
    Entry.hide()

# ���� Ƚ��(2) ������Ʈ�� ���̼� �ڵ�

import Entry

def when_get_signal("heart2"):
    Entry.hide()

# ���� Ƚ��(3) ������Ʈ�� ���̼� �ڵ�

import Entry

def when_get_signal("heart3"):
    Entry.hide()