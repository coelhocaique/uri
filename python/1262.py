while True:
    try:
        seq = str(raw_input())
        procs = int(input())

        am_procs = 0
        am_clocks = 0
        for s in seq:
            if s == 'R':
                am_procs += 1

            if s == 'W':
                if am_procs > 0:
                    am_clocks += 1

                am_clocks += 1
                am_procs = 0

            if am_procs == procs:
                am_clocks += 1
                am_procs = 0

        if am_procs > 0:
            am_clocks += 1

        print (am_clocks)
    except EOFError:
        break