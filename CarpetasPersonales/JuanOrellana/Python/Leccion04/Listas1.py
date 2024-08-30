# Listas = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
# Son colecciones en Python

# Las listas es lo que se conoce en otros lenguajes como arreglos o vectores

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[1])
print(nombres[2])
print(nombres[-1]) # Utilizamos el -1 para acceder al ultimo indice de la lista

print(nombres[0:3]) #Seleccionamos un conjunto de indices a imprimir
print(nombres[ :3]) #Hacemos un recorrido desde el principio hasta la posicion 3
print(nombres[1:]) #Ahora incluimos desde el principio hasta el final desconocido
nombres[2] = 'Liliana' # Modificamos en el indice asignado
nombres[0] = 'Natalia'
print(nombres)
print('--------------------')

#Iteramos en la lista
for nombre in nombres: 
    print(nombre)
else:
    print('Se acabaron los nombres')
    
# Preguntamos cuantos elementos tiene una lista
#print(nombres)
print(len(nombres)) # Le pasamos como parametro el nombre de la lista

# Agregamos un elemento
nombres.append("Marcelo") # Se agrega al final
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.5)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# insertar un indice especifico
nombres.insert(1, "Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)

#eliminamos un elemento de nuestra lista
nombres.remove("Alberto")
print(nombres)

# Eliminar el ultimo elemento de la lista
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2]
print(nombres)
del nombres[-1]
print(nombres)

# Concatenamos listas
print("----------- Concatenamos listas -----------------")
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9, 1]) # Funcion para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Es para saber donde esta el elemento n° 5
# print(lista3.index(0)) # Esto nos daria un error por no ser el elemento parte de la lista

# Como saber cuantos elementos repetidos hay una lista
print(f"Hay {lista3.count(1)} elementos 1 repetidos en la lista") # Cuenta cuantos valores iguales hay en una lista

# Para poner una lista al reves
print(lista3)
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

# Metodos de ordenamiento 
lista3.sort() # Ordena los elementos de forma ascendente
print(lista3)
lista3.sort(reverse=True) # Ordena los elementos de forma descendente
print(lista3)

# Eliminar, borrar o limpiar todos los elementos 
nombres.clear()
print(nombres)

# Eliminar la lista 
# del nombres
# print(nombres)