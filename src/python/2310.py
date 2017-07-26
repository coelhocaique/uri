N = int(input())
s,b,a,suc_s,suc_b,suc_a = [0 for _ in range(6)]

while N > 0:
    player_name = raw_input()
    in_s,in_b,in_a = map(int,raw_input().split())
    in_suc_s,in_suc_b,in_suc_a = map(int,raw_input().split())

    s+=in_s
    b+=in_b
    a+=in_a
    suc_s+=in_suc_s
    suc_b+=in_suc_b
    suc_a+=in_suc_a
    N-=1

print ("Pontos de Saque: %.2f %s" % (((float(suc_s) * 100)/float(s)),"%."))
print ("Pontos de Bloqueio: %.2f %s" % (((float(suc_b) * 100)/float(b)),"%."))
print ("Pontos de Ataque: %.2f %s" % (((float(suc_a) * 100)/float(a)),"%."))
