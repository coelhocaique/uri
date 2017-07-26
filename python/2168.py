N = input()
matrix = [[0 for x in range(N + 1)] for y in range(N + 1)]
output = [['' for x in range(N)] for y in range(N)]
for i in range(N + 1):
    M = map(int,raw_input().split())
    matrix[i] = M

for i in range(N):
    for j in range(N):
        count = 0
        if matrix[i][j] == 1:
            count+=1
        if matrix[i][j + 1]:
            count+=1
        if matrix[i + 1][j]:
            count+=1
        if matrix[i + 1][j + 1]:
            count+=1
        if count >= 2:
            output[i][j] = 'S'
        else:
            output[i][j] = 'U'

for row in output:
    print ''.join(s for s in row)
