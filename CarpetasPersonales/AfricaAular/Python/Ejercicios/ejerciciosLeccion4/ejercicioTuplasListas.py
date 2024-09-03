'''
Dada la siguiente tupla: (13,1,8,3,2,5,8), crear una lista que incluya los num menores a 5 e imprima por consola[1,3,2]
'''

miTupla = (13, 1, 8, 3, 2, 5, 8)
miLista = []

for i in miTupla:
    if i < 5:
      miLista.append(i)
    print(miLista) 