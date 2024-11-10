"""
Ejercicio 1: Iterar en un rango de 0 a 10 e imprimir numeros divisibles entre tres
Ejemplo de ejecucion = 0, 3, 6, 9    
"""
multiplo3 = []

for i in range(0,11):
    if i %3 == 0:
        multiplo3.append(i)
    
print(multiplo3)