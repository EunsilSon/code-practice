#��Ŷ ����Ʈ ���� ���α׷�

# insert ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("������ ������ �Է��ϼ���.")
    bucketlist.append(Entry.answer())

# delete ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("�� ��° ����� �����ұ��? (���ڸ� �Է�)")
    bucketlist.append(Entry.answer() - 1)

# change ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("�� ��° ����� �����ұ��?(���ڸ� �Է�)")
    index = Entry.answer()
    Entry.input("�ٲ� ������ �Է��ϼ���.")
    bucketlist[index - 1] = Entry.answer()

# reset ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("���� ��� ����ðڽ��ϱ�? (y/n)")
    if (Entry.answer() == "y"):
        for i in range(len(bucketlist)):
            bucketlist.pop(0)

# ������ Ž�� ���α׷�

# Search ������Ʈ�� ���̼� �ڵ�

import Entry

index = "0"
bucketlist = [11, 9, 15, 5, 2]

def when_click_object_on():
    index = 1    // ����Ʈ�� ù ��° �׸� ���� ã�ƺ��� ���ؼ� 1�� ������
    Entry.input("ã�� ���� �����͸� �Է��ϼ���.")
    for i in range(len(bucketlist)):
        if (bucketlist[index - 1] == Entry.answer()):    // 1�� ����� index�� -1�� �� 0��°, �� ù ��° �׸���� ��Ʈ�� ��� ����
            Entry.print((index + "�� ��Ͽ� �ֽ��ϴ�."))
            Entry.stop_code("all")
        Entry.print("ã�� ���߽��ϴ�.")
        index += 1    // index�� 1�� ���ذ��鼭 ������������ �׸��� ã��

# ������ ���� ���α׷�

# insert1 ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    Entry.input("�Է� ������ �Է��ϼ���.")
    input = Entry.answer()
    for i in range(input):
        array.append(random.randint(1, 100))

# sort ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    index = 1
    dsize = (len(array) - 1)    // ù ��° �׸���� ã�� ����
    for i in range(dsize):
        for j in range(dsize):
            if (array[index - 1] > array[index]):    // ù ��° �׸��� �� ��° �׸񺸴� ũ�ٸ�
                temp = array[index - 1]    // ���� temp�� ù ��° �׸��� �����ϰ�
                array[index - 1] = array[index]    // �� ��° �׸��� ù ��° �׸� ����
                array[index] = temp    // temp�� ����� ���� �� ��° �׸� ����
            index += 1    // ���� ������ �Ѿ�� ���� +1
        index = 1
        dsize += -1    // ù ��° �׸�� �� ��° �׸��� ������������ �ִٸ� �ݺ� Ƚ���� -1�ϰ� ���� ������ �Ѿ

# search ������Ʈ�� ���̼� �ڵ�

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    index = 1
    Entry.input("ã�� ���� �����͸� �Է��ϼ���.")
    for i in range(len(array)):
        if (array[index - 1] == Entry.answer()):
            Entry.print((index + "�� ��Ͽ� �ֽ��ϴ�."))
            Entry.stop_code("all")
        Entry.print("ã�� ���߽��ϴ�.")
        index += 1