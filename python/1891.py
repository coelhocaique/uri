# python3
def flip_coin(coin):
    return 'D' if coin == 'B' else 'B'


def go_backwards(coins, index_coin, index_seq):
    while index_coin >= 0 and coins[index_coin] != 'Z':
        coins[index_coin] = 'Z'
        index_seq.append(index_coin + 1)
        index_coin -= 1
    return index_seq


def check_coin(coins, index_coin, index_seq):
    while index_coin < len(coins):
        check_back = False
        if coins[index_coin] == 'D':
            if index_coin >= 1 and coins[index_coin - 1] != 'Z':
                coins[index_coin - 1] = flip_coin(coins[index_coin - 1])
                check_back = True

            if index_coin <= n_coins - 2 and coins[index_coin + 1] != 'Z':
                coins[index_coin + 1] = flip_coin(coins[index_coin + 1])

            index_seq.append(index_coin + 1)
            coins[index_coin] = 'Z'

            if check_back:
                index_seq = go_backwards(coins,index_coin - 1,index_seq)

        index_coin += 1
    return index_seq

T = int(input())

while T > 0:

    n_coins = int(input())
    coins = list(input())
    index_seq = []

    if 'D' in coins:
        index_seq = check_coin(coins, coins.index('D'), index_seq)

    if len(index_seq) == n_coins:
        print ('Y')
        print (' '.join(str(p) for p in index_seq))
    else:
        print ('N')

    T-=1