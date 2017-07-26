C = input()
while C > 0:
    word = str(raw_input())
    print '%.2f' % (float(len(word))/float(100))
    C-=1
