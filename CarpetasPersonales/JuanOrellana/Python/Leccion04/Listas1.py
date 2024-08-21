# Listas = ['Naty', 'Osvaldo', 'Lily', 'Ariel']

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

# Eliminar, borrar o limpiar todos los elementos 
nombres.clear()
print(nombres)

# Eliminar la lista 
del nombres
#print(nombres)