def factorial(n):
    if n == 0:
        return 1
    output = n
    n-=1
    while n > 0:
        output*= n
        n-=1
    return output

while True:
    try:
        m,n = map(int,raw_input().split())

        if m == n:
            print factorial(n) * 2
        else:
            print factorial(n) + factorial(m)
    except EOFError:
        break
