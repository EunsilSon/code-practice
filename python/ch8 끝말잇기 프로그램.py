# �����ձ��� ����

import Entry

word = 0    # �����ձ� �ܾ�
words = []    # �����ձ� �ܾ� ����

def when_start():
    Entry.input("ù ��° �ܾ �Է��� �ּ���.")
    word = Entry.answer()
    while True:
        Entry.input((word[len(word) - 1] + " (��) �� �����ϴ� ����?"))    # word�� ����� ���� ���̿��� -1�� ��
        word = Entry.answer()

# ��Ģ�� �´��� Ȯ���ϰ� �ܾ� �����ϱ�

def when_start():
    Entry.input("ù ��° �ܾ �Է��� �ּ���.")
    word = Entry.answer()
    while True:
        Entry.input((word[len(word) - 1] + " (��) �� �����ϴ� ����?"))
        if (Entry.answer()[0] == word[len(word) - 1]):
            word = Entry.answer()    # word�� ���ο� �� ����
            words.append(word)    # words ����Ʈ�� word ����
        else:
            Entry.print_for_sec("�ٸ� �ܾ �Է��� ������!", 2)

# �����ձ⸦ �Ϸ��ϴ� �� �ɸ� �ð� ����ϱ�

def when_start():
    Entry.print_for_sec("�����ձ⸦ 10�� �ϼ��� ���ô�.", 4)
    Entry.input("ù ��° �ܾ �Է��� �ּ���.")
    word = Entry.answer()
    Entry.timer("start")    # Ÿ�̸� ����
    while True:
        Entry.input((word[len(word) - 1] + " (��) �� �����ϴ� ����?"))
        if (Entry.answer()[0] == word[len(word) - 1]):    # ���� ����� word�� ����� ���� ���� -1�� ���� ������
            word = Entry.answer()
            words.append(word)
            if (len(words) == 10):    # ���� words����Ʈ ���̰� 10�̶��
                Entry.print_for_sec(Entry.value_of_timer(), 2)    # ���ݱ��� �� Ÿ�̸� �ð� ���
                Entry.stop_code("all")
        else:
            Entry.print_for_sec("�ٸ� �ܾ �Է��� ������!", 2)