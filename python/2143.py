while True:
    T = input()
    if T == 0:
        break

    i=0
    while i < T:
        N = input()
        if N % 2 == 0:
            print (N * 2) - 2
        else:
            print (N * 2) - 1
        i+=1
