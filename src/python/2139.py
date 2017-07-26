import datetime

while(True):
    try:
        month,day = map(int,raw_input().split())
        output = ""
        date = datetime.date(2016,month,day)
        christimas = datetime.date(2016,12,25)
        days = (christimas - date).days

        if days == 0:
             output = "E natal!"
        elif days < 0:
            output = "Ja passou!"
        elif days == 1:
            output = "E vespera de natal!"
        else:
            output = "Faltam "+ str(days) +" dias para o natal!"

        print output
    except EOFError:
        break
