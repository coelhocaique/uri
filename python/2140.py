available_bills = [2,5,10,20,50,100]
while True:
    N,M = map(int,raw_input().split())

    if N == 0 and M == 0:
        break

    change = M - N
    possible = False
    i=0
    while i < len(available_bills):
        bill = available_bills[i]
        j=i+1
        while j < len(available_bills):
            curr_bill = available_bills[j]
            if (bill + curr_bill) == change:
                possible = True
            j+=1
        i+=1

    if possible:
        print 'possible'
    else:
        print 'impossible'
