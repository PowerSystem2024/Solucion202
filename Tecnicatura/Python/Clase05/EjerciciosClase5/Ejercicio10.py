"""
Ejercicio 10: No repetir caracteres
Hacer un programa que pida una cadena por teclado,
luego meter los caracteres en una lista sin repetir caracteres
"""

palabra = input("Ingrese palabras: ")
lista = []

for i in palabra:
    if i not in lista and i != " ":
        lista.append(i)
        
print(f"Las palabras ingresadas son: {palabra}\nLos caracteres sin repetir son: {lista}")