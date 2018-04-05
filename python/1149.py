l = list(map(int,input().split()))

a = l[0]
n = 0
i = 1
while n <= 0:
    n = l[i]
    i+=1

sum_n = a
n-=1
while n >= 1:
    sum_n += (a + n)
    n-=1

print(sum_n)
