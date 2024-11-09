# Ejercicio 6: Tabal de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10, por ejmplo:
# si digita el 5 la lista tendra: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Digite un número: "))
lista = [] # Creamos una lista vacia
for i in range(1,11):
    lista.append(i*numero)

print(f"Tabla de multiplicar del {numero}: {lista}")
for idndice, i in enumerate(lista):
    print(f"{numero} x {i} = {lista[idndice]}") # Este ciclo es para ver el formato de uan tala de multiplicar
    