n = input()

while n > 0:
    kgs = float(raw_input())
    days = 0
    while kgs > 1:
        kgs = kgs / 2
        days += 1

    print days,'dias'
    n -= 1
