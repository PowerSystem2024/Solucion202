################# Colecciones en Python ###############################
"""
En Python, las colecciones son estructuras de datos que permiten almacenar y organizar varios elementos 
de forma eficiente. Cada tipo de colección tiene características específicas que las hacen adecuadas 
para diferentes tipos de tareas. Las colecciones más comunes en Python son:
"""
nombres = []
nombres = [1, 'Naty', 'Osvaldo', 'Lily', 'Ariel']
# 'nombres' es una lista de Python, que en otros lenguajes se conocen como arreglos o vectores

# Agregamos elementos a la lista utilizando el método 'append'.
# Este método añade un nuevo elemento al final de la lista.

nombres.append([1, 2, 3])  # Agregamos una lista dentro de la lista principal.
nombres.append(True)        # Agregamos un valor booleano (True).
nombres.append(10.45)       # Agregamos un número decimal (float).
nombres.append([4, 5])      # Agregamos una lista dentro de la lista principal.
nombres.append(7)           # Agregamos un número entero (int).
nombres.append("Marcelo")   # Agregamos una cadena de texto (string).

# Imprimimos la lista completa para ver los elementos agregados.
print(nombres)

"""
    - Lista: Cuando necesitas una secuencia ordenada de elementos y es posible que desees modificarla.
    - Tupla: Cuando necesitas una secuencia inmutable (por ejemplo, coordenadas o datos constantes).
    - Conjunto: Cuando necesitas eliminar duplicados o realizar operaciones de conjuntos.
    - Diccionario: Cuando necesitas asociar claves únicas con valores (ejemplo: un directorio telefónico o una base de datos pequeña).
"""

# Concatenamos dos listas utilizando el operador +
print("----------- Concatenamos listas -----------------")
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2  # Concatenamos las dos listas en una nueva lista
print(lista3)

# Extendemos la lista 'lista3' agregando varios elementos al final
lista3.extend([7, 8, 9, 1])  # Añadimos múltiples elementos a 'lista3'
print(lista3)

# Usamos 'index' para encontrar la posición del elemento 5 en la lista
print(lista3.index(5))  # Retorna el índice del elemento 5

# Comentado porque esto causaría un error (el elemento 0 no está en la lista)
# print(lista3.index(0))  # Esto daría un error porque el 0 no está en la lista

# Contamos cuántas veces el valor '1' aparece en la lista
print(f"Hay {lista3.count(1)} elementos '1' repetidos en la lista")  # Cuenta los valores iguales a 1

# Invertimos el orden de los elementos de la lista
print(lista3)
lista3.reverse()  # Reversa el orden de los elementos en la lista
print(lista3)

# Multiplicamos una lista para repetir sus elementos
lista = [1, 2, 3] * 2  # Repite los elementos de la lista original dos veces
print(lista)  # Resultado: [1, 2, 3, 1, 2, 3]

# Ordenamos los elementos de 'lista3' en orden ascendente
lista3.sort()  # Ordena los elementos en forma ascendente
print(lista3)  # Resultado: [1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# Ordenamos los elementos de 'lista3' en orden descendente
lista3.sort(reverse=True)  # Ordena los elementos en forma descendente
print(lista3)  # Resultado: [9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 1, 1]

# Eliminamos todos los elementos de la lista 'nombres'
nombres.clear()  # Limpia la lista, eliminando todos los elementos
print(nombres)  # Resultado: []

# Eliminar la lista completa
# del nombres  # Elimina completamente la lista de la memoria
# print(nombres)  # Esto daría un error porque la lista 'nombres' ha sido eliminada