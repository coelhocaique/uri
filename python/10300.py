def josephus(n,k):
      if n == 1:
          return 1
      else:
        return (josephus(n-1,k)+k-1) % n+1

m = input()
index = 1

while index <= m:
    n,k = map(int,raw_input().split())
    print 'CASE %g: %g' % (index,josephus(n,k))
    index += 1
