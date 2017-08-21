while True:
    try:
        word_number,lines_page,characters = map(int,raw_input().split())
        words = raw_input().split()
        lines = 0
        chars = 0
        page = 1
        for word in words:
            chars_word = len(word)
            if (chars + chars_word) > characters:
                lines += 1
                chars = chars_word + 1
            else:
                chars += chars_word + 1

            if lines >= lines_page:
                page += 1
                lines = 0

        print page
    except EOFError:
        break
