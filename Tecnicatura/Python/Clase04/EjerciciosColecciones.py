# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuación elimine los elementos repetidos,
# por último mostarr la lista

# Creamos una lista

lista = [1,2,3,4, "Ariel", 5, 5, 5, "Ariel"]

# conjunto = set(lista) # Convertir la lista a un conjunto de tipo set
# lista = list(conjunto) # Convertimos el conjunto a una lista

lista = list(set(lista)) # La conversion hecha en una sola linea de codigo 
print(lista)


# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 lista y que a continuacion cree las siguientes listas (sin repeticion)
# 1 lista de palabras que aparecen en las listas
# 2 lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

lista1 = [1,2,3,4,5,4,3,2,2,1,5]
lista2 = [4,5,6,7,8,4,5,6,7,7,8]

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) # union de los dos conjuntos
solo1 = list(conjunto1 - conjunto2) # solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) # solo muestra el conjunto2 
interseccon = list(conjunto1 & conjunto2) # muestra ambas listas

print(f'Palabras que aparecen en las listas: {union}')
print(f'Palabras que aparecen en la primera lista, pero no en la segunda: {solo1}')
print(f'Palabras que aparecen en la segunda lista, pero no en la primera: {solo2}')
print(f'Palabras que aparecen en ambas listas: {interseccon}')

# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los sigientes personajes del señor de los anillos

# Nombre: Aragon
# Clase: guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = []

P = {'Nombre': 'Aragon', 'Clase': 'Guerrero', 'Raza': 'Dúnadan del norte'}
personajes.append(P)

P = {'Nombre': 'Gandalf', 'Clase': 'Mago', 'Raza': 'Istar'}
personajes.append(P)

P = {'Nombre': 'Legolas', 'Clase': 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(P)

print(personajes)