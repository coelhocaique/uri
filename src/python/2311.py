N = int(input())

while N > 0:
    competitor = raw_input()
    degree = float(raw_input())
    inp = raw_input().split()
    dives = [float(dive) for dive in inp]
    dives.sort()

    highest = len(dives) - 1
    lowest = 0
    dives[lowest] = 0.0
    dives[highest] = 0.0

    total_dives = sum(dives)

    print '%s %.2f' % (competitor,(total_dives * degree))
    N-=1
