while True:
    n = input()

    if n == 0:
        break

    st = {}
    for i in range(n):
        n,s = map(str,raw_input().split())
        st[n] = s

    m = input()
    false_sign = 0
    for j in range(m):
      n,s = map(str,raw_input().split())
      os = st[n]
      diffs = 0
      for i in range(len(os)):
          if not os[i] == s[i]:
              diffs += 1

      if diffs > 1:
          false_sign += 1

    print false_sign
