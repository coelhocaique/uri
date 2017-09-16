N = input()
speeds = map(int,raw_input().split())
output = 0
for i in range(1,N):
    if speeds[i] < speeds[i - 1]:
        output = i + 1
        break
print output
