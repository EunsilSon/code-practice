# 엔트리봇 오브젝트

import Entry

n1 = 0
n2 = 0
n3 = 0

def when_click_object_on():
    Entry.send_signal("random")
    if (((n1 == n2) or (n1 == n3)) or (n2 == n3)):
        Entry.send_signal("random")

def when_press_key("space"):
    if ((n1 < n2) or (n1 < n3)):
        Entry.send_signal("n1")
    if ((n2 < n1) or (n2 < n3)):
        Entry.send_signal("n2")
    if ((n3 < n1) or (n3 < n2)):
        Entry.send_signal("n3")

# 숫자1 오브젝트

def when_get_signal("random"):
    n1 = random.randint(1, 99)
    Entry.write_text(n1)

def when_get_signal("n1"):
    Entry.clear_text()

# 숫자2 오브젝트

def when_get_signal("random"):
    n2 = random.randint(1, 99)
    Entry.write_text(n2)

def when_get_signal("n2"):
    Entry.clear_text()

# 숫자3 오브젝트

def when_get_signal("random"):
    n3 = random.randint(1, 99)
    Entry.write_text(n3)

def when_get_signal("n3"):
    Entry.clear_text()
