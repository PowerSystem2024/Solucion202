# Ejercicios con tuplas y listas

import math # Importamos la clase math para hacer uso de la funcion sqrt (raiz cuadrada)

# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)

# Crear una lista que solo incluya los números menores a 5 e imprima por conosola [1, 3, 2]

lista10 = []
# Filtrar los elementos menores a 5

for elemento in tupla:
    if elemento < 5:
        lista10.append(elemento)
print(lista10)

# Ejercicio de matematica para sacar la raiz cuadrada de un número positivo

numero = int(input("Ingrese un número positivo"))

while numero < 0:
    print('Error -> Deberia ser un número positivo')
    numero = int(input("Ingrese un número positivo"))
print(f'Su raiz cuadrada es: {math.sqrt(numero):.2f}')



# Diccionario con datos de la seleccion Argentina

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posicion': 'Extremo derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.78, 'Precio': '12 millones', 'Posicion': 'Extremo izquierdo'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.74, 'Precio': '35 millones', 'Posicion': 'Delantero'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.84, 'Precio': '3.5 millones', 'Posicion': 'Defensa central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posicion': 'Portero'}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)


# Ejercicio 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostrar la lista con el bucle for
# Los elementos deben mostrarse de la siguiente forma: 1-2-3-4-5...-50

# lista20 = []
# i = 1
# while i <= 50:
#    lista.append(i)
#    i +=1

lista = list(range(1, 51))
for i in lista:
    print(i, end='-')


# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modificar los elementos multiplicandolos
# por un valor ingresado por el usuario

lista30 = [list(range(1, 11))]
print('Lista original')

for i in lista:
    print(i, end='-')

valor = int(input('Ingrese un valor a multiplicar: '))

for indice, i in enumerate(lista):
    lista[indice] *= valor

print(f'Lista final con elementos multiplicados por {valor}')
for i in lista:
    print(i, end='-')


# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando el usuario introduzca un numero 0, nuestro programa
# dejaria de insertar
# Por ultimo, mostrar los numeros ordenados menor a mayor

lista40 = []
salir = False

while not salir:
    numero = int(input("Ingrese un numero"))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

lista.sort()
print(f'Lista ordenada: {lista}')