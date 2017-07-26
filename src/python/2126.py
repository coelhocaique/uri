index = 1
while(True):
    try:
        sub = raw_input()

        sentence = raw_input()

        count = sentence.count(sub)

        if count > 0:
            last_index = sentence.rfind(sub)
            print ("Caso #%d:\nQtd.Subsequencias: %d\nPos: %d\n" % (index,count,last_index + 1))
        else:
            print ("Caso #%d:\nNao existe subsequencia\n" % (index))
        index+=1
    except EOFError:
        break
