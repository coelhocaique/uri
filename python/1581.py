n = int(input())

while n > 0:
    m = int(input())
    last = None
    equal = True
    while m > 0:
        word = input()
        if last:
            if last != word:
                equal = False
            last == word
        else:
            last = word
        m -= 1

    out = last if equal else 'ingles'

    print (out)

    n -= 1