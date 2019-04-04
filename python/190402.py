# 전투기 격추 게임

# 로켓 오브젝트의 파이선 코드

import Entry

발사각 = 0

def when_start():
    Entry.set_xy(0, -80)

def when_press_key("left"):
    Entry.set_rotation(-30)
    while not Entry.is_touched("edge_up"):
        if Entry.is_touched("전투기"):
            Entry.send_signal("격추")
        if Entry.is_touched("전투기(2)"):
            Entry.send_signal("격추(2)")
        Entry.move_to_direction(10)
    Entry.set_xy(0, -80)

def when_press_key("right"):
    Entry.set_rotation(30)
    while not Entry.is_touched("edge_up"):
        if Entry.is_touched("전투기"):
            Entry.send_signal("격추")
        if Entry.is_touched("전투기(2)"):
            Entry.send_signal("격추(2)")
        Entry.move_to_direction(10)
    Entry.set_xy(0, -80)

def when_press_key("space"):
    if (발사각 < 180):
        Entry.add_rotation(발사각)
        발사각 += 2


# 전투기 오브젝트의 파이선 코드

import Entry

발사각 = 0

def fly(param1, param2, param3):
    Entry.set_direction(param1)
    Entry.show()
    while True:
        Entry.set_xy(param2, 100)
        while not Entry.is_touched("edge"):
            Entry.move_to_direction(param3)

def when_start():
    fly(90, -180, 5)

def when_get_signal("격추"):
    Entry.hide()


# 전투기(2) 오브젝트의 파이선 코드

import Entry

발사각 = 0

def fly(param1, param2, param3):
    Entry.set_direction(param1)
    Entry.show()
    while True:
        Entry.set_xy(param2, 100)
        while not Entry.is_touched("edge"):
            Entry.move_to_direction(param3)

def when_start():
    fly(270, 180, 10)

def when_get_signal("격추(2)"):
    Entry.hide()
