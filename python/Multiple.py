# ���� ������Ʈ�� ���̼� �ڵ�

import Entry

start = 0
finish = 0
multiple = 0
number = 0
plus1 = 0
plus2 = 0

def when_start():
    Entry.input("���� ���ڸ� �Է��ϼ���.")
    start = Entry.answer()
    Entry.write_text(start)
    Entry.send_signal("finish")

# �� ������Ʈ�� ���̼� �ڵ�

def when_get_signal("finish"):
    Entry.input("������ ���ڸ� �Է��ϼ���.")
    finish = Entry.answer()
    Entry.write_text(finish)
    Entry.send_signal("multiple")

# ��� ������Ʈ�� ���̼� �ڵ�

def when_get_signal("multiple"):
    Entry.input("ã�� ���� ����� �Է��ϼ���.")
    multiple = Entry.answer()
    Entry.write_text(multiple)
    Entry.input("������ �˰�ʹٸ� 1��, ���� �˰�ʹٸ� 2�� �Է��ϼ���.")
    if (Entry.answer() == 1):
        Entry.send_signal("number")
    else:
        Entry.send_signal("plus")

# ���� ������Ʈ�� ���̼� �ڵ�

def when_get_signal("number"):
    while not (start == finish):    # ���� ���ڿ� �� ���ڰ� ���� �� ���� �ݺ�
        if ((start % multiple) == 0):    # ���� ���� �� �� ������ �������� 0�̶��
            number += 1    # ���� number�� +1
        start += 1    # ���� ���� +1
    number = (number - 1)
    Entry.write_text(number)

# �� ������Ʈ�� ���̼� �ڵ�

def when_get_signal("plus"):
    while not (start == finish):
        if ((start % multiple) == 0):
            plus1 = start    # ���� ���ڸ� plus1�� ����
            plus2 += plus1    # plus1�� plus2�� ���ϱ�
        start += 1
    Entry.write_text(plus2)