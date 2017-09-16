n = int(input())
k = int(input())

players = []
while n > 0:
    players.append(int(input()))
    n-= 1

players.sort(reverse=True)
output = 0
for i in range(len(players)):
    if k == 0 :
        if players[i] == players[i - 1]:
            output += 1
        else:
            break
    else:
        output+=1
        k-= 1
print output
