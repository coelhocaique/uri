count = 1
while True:

    n = int(input())
    if n == 0: break

    mp = dict()
    keys = []
    xs,ys = 0,0
    while n > 0:
        x, y = map(int,input().split())
        key = y // x
        if key in mp:
            mp[key] = mp[key] + x
        else:
            mp[key] = x
            keys.append(key)
        xs += x
        ys += y
        n-= 1

    keys.sort()

    if count > 1: print()

    print('Cidade# %g:' % count)
    for k in range(len(keys)):
        key = keys[k]
        if k == len(keys) -1:
            print('%g-%g' % (mp[key],key),end = '')
        else:
            print('%g-%g ' % (mp[key],key),end = '')
    print()
    div = str(ys/xs)
    if '.' in div:
        div = div[0:div.index('.') + 3]
    print('Consumo medio: %.2f m3.' % float(div))
    count+=1

