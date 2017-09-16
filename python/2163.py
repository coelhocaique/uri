N,M = map(int,raw_input().split())
matrix = [[0 for x in range(M)] for y in range(N)]
i_map = dict()
for i in range(N):
    matrix[i] = map(int,raw_input().split())

for i in range(N):
    indexes = [j for j, x in enumerate(matrix[i]) if x == 42]
    for index in indexes:
        if i in i_map:
            i_map[i].append(index)
        else:
            values = [index]
            i_map[i] = values

r, w = 0,0
for key in i_map.keys():
    row = key
    for value in i_map[key]:
        column = value
        if not (row == 0 or row == (N - 1) or column == 0 or column == (M -1)):
            a = matrix[row + 1][column] == 7
            b = matrix[row - 1][column] == 7
            c = matrix[row][column + 1] == 7
            d = matrix[row][column -1] == 7
            e = matrix[row + 1][column + 1] == 7
            f = matrix[row + 1][column - 1] == 7
            g = matrix[row - 1][column + 1] == 7
            h = matrix[row - 1][column - 1] == 7
            if a and b and c and d and e and f and g and h:
              r,w = row + 1,column + 1
print r,w
