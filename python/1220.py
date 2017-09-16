while True:
    index = input()
    if index == 0:
        break

    student_amounts = []
    while index > 0:
        student_amounts.append(int(float(raw_input()) * 100))
        index -= 1

    total = str(float(sum(student_amounts) / len(student_amounts)))
    zeros = len(total) - total.index('.')
    multi = '1'
    for i in range(zeros):
        multi += '0'
    multi = int(multi)
    total_per_student = int(float(total) * multi)

    print 'total_per_student ',total_per_student
    exchanged_amount = 0

    for amount in student_amounts:
        print 'amount',amount
        if amount >= total_per_student:
            exchanged_amount += (amount - total_per_student)
        print 'exchanged_amount ',exchanged_amount

    print '$', (exchanged_amount / 100)
