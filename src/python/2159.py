import math

n = input()

P = n / math.log(n)

M =  1.25506 * (n / math.log(n))

print '%.1f %.1f' % (P,M)
