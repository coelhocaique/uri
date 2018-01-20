a,b,c,d = map(int,input().split())

hours = 0
minutes = 0

if a == c and b == d:
    hours = 24
else:
    m = d - b
    h = c - a
    if m < 0:
        m += 60
        if h == 0:
            h = 23
        else:
            h -= 1

    if h < 0:
        h += 24

    hours = h
    minutes = m
print('O JOGO DUROU %g HORA(S) E %g MINUTO(S)' % (hours,minutes))