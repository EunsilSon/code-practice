# ������ �� ���(1) ������Ʈ�� ���̼� �ڵ�
# ��Ģ���� �ϱ�

import Entry

n = 0
result = 0
i = 0

def when_start():
    Entry.print_for_sec("��Ģ���� ��ư�� Ŭ���ϼ���!", 5)


# ���ϱ� ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("ù ��° ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("�� ��° ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    result = (i + n)
    Entry.print_for_sec(("����: " + result), 2)


# ���� ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("ù ��° ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("�� ��° ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    result = (i - n)
    Entry.print_for_sec(("����: " + result), 2)


# ���ϱ� ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("ù ��° ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("�� ��° ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    result = (i * n)
    Entry.print_for_sec(("����: " + result), 2)


# ������ ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0

def when_click_object_on():
    result = 0
    Entry.input("ù ��° ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("�� ��° ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    result = (i / n)
    Entry.print_for_sec(("������: " + result), 2)


# ������ �� ���(1)1 ������Ʈ�� ���̼� �ڵ�
# �̾����� ���� ����ϱ�

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_start():
    Entry.print_for_sec("���ϰ� ���� ���� Ŭ���ϼ���!", 2)


# �հ� ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_click_object_on():
    result = 0
    Entry.input("���� ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("������ ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    while (i <= n):
        result = (result + i)
        i += 1
    Entry.print_for_sec(("�հ�: " + result), 4)


# ��� ������Ʈ�� ���̼� �ڵ�

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_click_object_on():
    sxoc = 0
    result = 0
    Entry.input("���� ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("������ ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    while (i <= n):
        result = (result + i)
        i += 1
        sxoc += 1
    Entry.print_for_sec(("���: " + (result / sxoc)), 4)


# ������ �� ���(1)2 ������Ʈ�� ���̼� �ڵ�
# ������ �����ؼ� ����ϱ�

import Entry

n = 0
result = 0
i = 0
sxoc = 0

def when_start():
    result = 0
    Entry.input("���� ���ڸ� �Է��ϼ���.")
    i = Entry.answer()
    Entry.input("������ ���ڸ� �Է��ϼ���.")
    n = Entry.answer()
    Entry.input("����� ������(+ �Ǵ� *)�� �Է��ϼ���.")
    if (Entry.answer() == "+"):
        while (i <= n):
            result = (result + i)
            i += 1
    if (Entry.answer() == "*"):
        result = 1
        while (i <= n):
            result = (result * 1)
            i += 1
    Entry.print_for_sec(("���: " + result), 4)