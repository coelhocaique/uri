while True:
    x,y = map(int,raw_input().split())

    if x == 0 and y == 0:
        break

    if len(str(x)) >= len(str(y)):
        x,y = str(x),str(y)
    else:
        x,y = str(y),str(x)

    carries = 0
    last_carry = 0
    index = len(x) - 1
    index_y = len(y) - 1

    while(index >= 0):
        w = x[index]
        if index_y >= 0:
            z = y[index_y]
            sum_num = int(w) + int(z) + int(last_carry)
        else:
            sum_num = int(w) + int(last_carry)

        if sum_num >= 10:
            sum_num_str = str(sum_num)
            last_carry = sum_num_str[0]
            carries += 1
        else:
            last_carry = 0
        index -= 1
        index_y -= 1

    if carries > 1:
        print '%g carry operations.' % carries
    elif carries == 1:
        print '%g carry operation.' % carries
    else:
        print 'No carry operation.'
