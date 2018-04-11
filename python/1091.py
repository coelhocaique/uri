while True:

    n = int(input())
    if n == 0: break

    x, y = map(int, input().split())

    while n > 0:
        px, py = map(int, input().split())
        out = None

        if px < x and py < y:
            out = 'SO'
        elif px > x and py < y:
            out = 'SE'
        elif px > x and py > y:
            out = 'NE'
        elif px < x and py > y:
            out = 'NO'
        else:
            out = 'divisa'

        print(out)
        n -= 1
