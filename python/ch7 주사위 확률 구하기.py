# �ֻ��� ������ ���̼� �ڵ�

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

# �ֻ��� Ȯ�� ���ϱ��� ���̼� �ڵ�

import Entry

d = 0
d6 = 0
throw = 0
repet = 0
pros = []

def when_click_object_on():
    Entry.input("������ Ƚ���� �Է��ϼ���.")
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

# �ݺ��ؼ� Ȯ���� ���� �� Ȯ�� �� �����ϱ��� ���̼� �ڵ�

import Entry

d = 0
d6 = 0
throw = 0
repet = 0
pros = []

def when_click_object_on():
    Entry.input("������ Ƚ���� �Է��ϼ���.")
    throw = Entry.answer()
    Entry.input("�ݺ��� Ƚ���� �Է��ϼ���.")
    repet = Entry.answer()
    for i in range(repet):
        d6 = 0    # ����Ʈ�� Ȯ�� �� ���� �� �ٽ� ������ ���ο� ���� �����ؾ��ϱ� ������ 0���� �ʱ�ȭ
        for j in range(throw):
            for k in range(10):    # �ִϸ��̼� ����. ��� ���� ����
                Entry.change_shape(random.randint(1, 6))
            d = random.randint(1, 6)
        Entry.change_shape(d)
        Entry.wait_for_sec(0.5)    # ������ ����
        if (d == 6):
            d6 += 1    # 6�� 1�� ���Դٴ� ��
        pros.append((d6 / throw))