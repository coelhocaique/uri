def decimal_to_base(num, base):

    converted_string, modstring = "", ""
    currentnum = num
    while currentnum:
        mod = currentnum % base
        currentnum = currentnum // base
        converted_string = chr(48 + mod + 7*(mod > 10)) + converted_string
    return converted_string


T = int(input())
bases = [n for n in range(2, 17)]
while T > 0:

    n = int(input())
    bases_palin = []
    for b in bases:
        n_base = decimal_to_base(n, b)
        if n_base == str(n_base)[::-1]:
            bases_palin.append(b)

    if len(bases_palin) > 0:
        print (' '.join(str(p) for p in bases_palin))
    else:
        print('-1')

    T-=1