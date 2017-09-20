escales = {
          'si':  [0, 2,4 ,5, 7 ,9, 11],
          'la#': [11,1,3 ,4 ,6 ,8 ,10],
          'la':  [10,0,2 ,3 ,5 ,7 ,9 ],
          'sol#':[9, 11,1 ,2 ,4 ,6 ,8 ],
          'sol': [8, 10,0 ,1 ,3 ,5 ,7 ],
          'fa#': [7, 9 ,11,0,2 ,4 ,6 ],
          'fa':  [6, 8 ,10,11,1 ,3 ,5 ],
          'mi':  [5, 7 ,9 ,10,0 ,2 ,4 ],
          're#': [4, 6 ,8 ,9 ,11,1 ,3 ],
          're':  [3, 5 ,7 ,8 ,10,0 ,2 ],
          'do#': [2, 4 ,6 ,7 ,9 ,11,1 ],
          'do':  [1, 3 ,5 ,6 ,8 ,10,0 ]
    }
notes_out = ['do','do#','re','re#','mi','fa','fa#','sol','sol','sol#','la','la#','si']

n = int(input())

notes = []
while n > 0:
    notes.append(int(input()) % 12)
    n -= 1

tone = 'desafinado'
last_tone = 20
for e in escales.keys():
    is_in = False
    for n in notes:
        if n in escales[e]:
            is_in = True
        else:
            is_in = False
            break
    if is_in:
        index = notes_out.index(e)
        if last_tone and last_tone > index:
            tone = e
            last_tone = index
print tone
