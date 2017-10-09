while True:

    n_ball,time = map(int,raw_input().split())

    if n_ball == 0 and time == 0:
        break

    balls = map(int,raw_input().split())

    output = 'impossivel'
    result_div = []
    for b in balls:
        if not time % b == 0:
            break
        else:
            result_div.append(int(time / b))

    if not output:
        result_div.sort()
        while len(result_div) > 0:
            first = result_div[0]
            if first not in balls:
                output = first
                break
            else:
                result_div.remove(first)
    print output
