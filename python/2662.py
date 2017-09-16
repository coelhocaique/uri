n = int(input())

notes = []
while n > 0:
    notes.append(int(input()) % 12)
    n -= 1

notes.sort()
print notes
