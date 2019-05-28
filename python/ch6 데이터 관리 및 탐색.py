#버킷 리스트 관리 프로그램

# insert (내용 삽입)의 파이선 코드

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("삽입할 내용을 입력하세요.")
    bucketlist.append(Entry.answer())

# delete (내용 삭제)의 파이선 코드

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("몇 번째 목록을 삭제할까요? (숫자만 입력)")
    bucketlist.append(Entry.answer() - 1)

# change (내용 변경)의 파이선 코드

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("몇 번째 목록을 수정할까요?(숫자만 입력)")
    index = Entry.answer()
    Entry.input("바꿀 내용을 입력하세요.")
    bucketlist[index - 1] = Entry.answer()

# reset (내용 전체 삭제)의 파이선 코드

import Entry

index = 0
bucketlist = []

def when_click_object_on():
    Entry.input("정말 모두 지우시겠습니까? (y/n)")
    if (Entry.answer() == "y"):
        for i in range(len(bucketlist)):
            bucketlist.pop(0)

# 데이터 탐색 프로그램

# Search (내용 찾기)의 파이선 코드

import Entry

index = "0"
bucketlist = [11, 9, 15, 5, 2]

def when_click_object_on():
    index = 1    # 리스트의 첫 번째 항목 부터 찾아보기 위해서 1을 대입함
    Entry.input("찾고 싶은 데이터를 입력하세요.")
    for i in range(len(bucketlist)):
        if (bucketlist[index - 1] == Entry.answer()):    # 1이 저장된 index에 -1을 해 0번째, 즉 첫 번째 항목부터 엔트리 답과 비교함
            Entry.print((index + "번 목록에 있습니다."))
            Entry.stop_code("all")
        Entry.print("찾지 못했습니다.")
        index += 1    # index에 1씩 더해가면서 내림차순으로 항목을 찾음

# 데이터 정렬 프로그램

# insert1 (내용 삽입)의 파이선 코드

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    Entry.input("입력 개수를 입력하세요.")
    input = Entry.answer()
    for i in range(input):
        array.append(random.randint(1, 100))

# sort (내용 정렬)의 파이선 코드

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    index = 1
    dsize = (len(array) - 1)    # 첫 번째 항목부터 찾기 위함
    for i in range(dsize):
        for j in range(dsize):
            if (array[index - 1] > array[index]):    # 첫 번째 항목이 두 번째 항목보다 크다면
                temp = array[index - 1]    # 변수 temp에 첫 번째 항목을 저장하고
                array[index - 1] = array[index]    # 두 번째 항목을 첫 번째 항목에 대입
                array[index] = temp    # temp에 저장된 값을 두 번째 항목에 대입
            index += 1    # 다음 순서로 넘어가기 위해 +1
        index = 1
        dsize += -1    # 첫 번째 항목과 두 번째 항목이 내림차순으로 있다면 반복 횟수를 -1하고 다음 순서로 넘어감

# search (내용 탐색)의 파이선 코드

import Entry

index = 0
input = 0
temp = 0
dsize = 0
bucketlist = [11, 9, 15, 5, 2]
array = []

def when_click_object_on():
    index = 1
    Entry.input("찾고 싶은 데이터를 입력하세요.")
    for i in range(len(array)):
        if (array[index - 1] == Entry.answer()):
            Entry.print((index + "번 목록에 있습니다."))
            Entry.stop_code("all")
        Entry.print("찾지 못했습니다.")
        index += 1