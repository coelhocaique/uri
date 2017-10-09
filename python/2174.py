amount = int(input())
pokemons = 151
poks = []
while amount > 0:
    pok = str(raw_input())
    if pok not in poks:
        pokemons -= 1
        poks.append(pok)
    amount -= 1

print 'Falta(m) %g pomekon(s).' % pokemons