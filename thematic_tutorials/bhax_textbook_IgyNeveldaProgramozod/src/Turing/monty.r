kiserletek_szama = 10000
kiserlet = sample(1:3, kiserletek_szama, replace = T) 
jatekos = sample(1:3, kiserletek_szama, replace = T) 
musorvezeto = vector(length = kiserletek_szama)
for (i in 1:kiserletek_szama) {
if (kiserlet[i]==jatekos[i]){
ajtok = setdiff(c(1,2,3), kiserlet[i])
}else{
ajtok = setdiff(c(1,2,3), c(kiserlet[i], jatekos[i]))
}
musorvezeto[i] = ajtok[sample(1:length(ajtok),1)]
}
nemvaltoztatesnyer = which(kiserlet == jatekos) 
valtoztat = vector(length = kiserletek_szama)

for (i in 1:kiserletek_szama) {
	holvaltoztat = setdiff(c(1,2,3), c(musorvezeto[i], jatekos[i])) 
	valtoztat[i] = holvaltoztat[sample(1:length(holvaltoztat),1)]
}

valtoztatesnyer = which(kiserlet == valtoztat)
sprintf("Kiserletek szama: %i", kiserletek_szama) 
length(nemvaltoztatesnyer) 
length(valtoztatesnyer) 
length(nemvaltoztatesnyer) / length(valtoztatesnyer) 
length(nemvaltoztatesnyer) + length(valtoztatesnyer)
