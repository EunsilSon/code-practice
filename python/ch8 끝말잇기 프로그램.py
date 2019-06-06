# 끝말잇기의 원리

import Entry

word = 0    # 끝말잇기 단어
words = []    # 끝말잇기 단어 저장

def when_start():
    Entry.input("첫 번째 단어를 입력해 주세요.")
    word = Entry.answer()
    while True:
        Entry.input((word[len(word) - 1] + " (으) 로 시작하는 말은?"))    # word에 저장된 값의 길이에서 -1한 값
        word = Entry.answer()

# 규칙에 맞는지 확인하고 단어 저장하기

def when_start():
    Entry.input("첫 번째 단어를 입력해 주세요.")
    word = Entry.answer()
    while True:
        Entry.input((word[len(word) - 1] + " (으) 로 시작하는 말은?"))
        if (Entry.answer()[0] == word[len(word) - 1]):
            word = Entry.answer()    # word에 새로운 값 저장
            words.append(word)    # words 리스트에 word 저장
        else:
            Entry.print_for_sec("다른 단어를 입력해 보세요!", 2)

# 끝말잇기를 완료하는 데 걸린 시간 출력하기

def when_start():
    Entry.print_for_sec("끝말잇기를 10번 완성해 봅시다.", 4)
    Entry.input("첫 번째 단어를 입력해 주세요.")
    word = Entry.answer()
    Entry.timer("start")    # 타이머 시작
    while True:
        Entry.input((word[len(word) - 1] + " (으) 로 시작하는 말은?"))
        if (Entry.answer()[0] == word[len(word) - 1]):    # 만약 대답이 word에 저장된 값의 길이 -1한 값과 같으면
            word = Entry.answer()
            words.append(word)
            if (len(words) == 10):    # 만약 words리스트 길이가 10이라면
                Entry.print_for_sec(Entry.value_of_timer(), 2)    # 지금까지 잰 타이머 시간 출력
                Entry.stop_code("all")
        else:
            Entry.print_for_sec("다른 단어를 입력해 보세요!", 2)