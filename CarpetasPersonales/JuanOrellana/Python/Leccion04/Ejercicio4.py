"""
Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8) # Definimos la tupla
Crear una lista que incluya los numeros menores a 5
Que imprima los numeros por consola [1, 3, 2]
"""
tupla = (13, 1, 8, 3, 2, 5, 8)
numMenores = []

for i in tupla:
    if i < 5:
        numMenores.append(i)
        
print(numMenores)