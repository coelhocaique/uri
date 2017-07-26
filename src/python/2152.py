N = input()

while N > 0:
    H,M,Q = map(str,raw_input().split())
    door = "fechou!"
    if Q == "1":
        door = "abriu!"
    hour = ""
    if len(H) == 1:
        hour = "0"+H
    else:
        hour = H
    minute = ""
    if len(M) == 1:
        minute = "0"+M
    else:
        minute = M

    print '%s:%s - %s %s' % (hour,minute,"A porta",door)
    N-=1
