N = int(input())
xs = raw_input().split()
farms = [int(x) for x in xs]
total_sheeps = sum(farms)
stars = [0 for _ in range(N)]

index = 0
stolen_sheeps = 0
while True:
    if index >= len(farms) or index < 0:
        break

    if farms[index] % 2 == 0:
        if farms[index] > 0:
            stolen_sheeps+=1
            farms[index]-=1
        stars[index] = 1
        index-=1
    else:
        if farms[index] > 0:
            stolen_sheeps+=1
            farms[index]-=1
        stars[index] = 1
        index+=1

print sum(stars),(total_sheeps-stolen_sheeps)
