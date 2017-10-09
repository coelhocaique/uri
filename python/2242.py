word = raw_input()

vowels = ['a','e','i','o','u']

word = [w for w in word if w in vowels]

if word == word[::-1]:
    print 'S'
else:
    print 'N'
