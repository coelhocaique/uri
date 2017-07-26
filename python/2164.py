import math
N = input()
sqrt = math.sqrt(5)
x = (1 + sqrt) / 2.0
y = (1 - sqrt) / 2.0
fib = (math.pow(x,N) - math.pow(y,N) ) / sqrt
print '%.1f' % fib
