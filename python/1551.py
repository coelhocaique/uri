import re

n = int(input())

while n > 0:
    word = input()
    letters = set()
    word = re.sub('[^A-Za-z]+', '', word)
    for w in word:
        letters.add(w)

    output = ''

    if len(letters) == 26:
        output = 'frase completa'
    elif len(letters) >= 13:
        output = 'frase quase completa'
    else:
        output = 'frase mal elaborada'

    print (output)
    n -= 1