#lista = Ariel, Liliana, Natalia, Osvaldo

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
# Mostrando el primer elemento de la lista
print(nombres[0])
# Mostramos el segundo elemento de la lista
print(nombres[1])
# Accedemos al ultimo elemento de la lista
print(nombres[3]) # Opcion 1 si sabemos cuantos elementos tenemos
print(nombres[-1]) # opcion 2 si no sabemos cuantos elementos tenemos en la lista
# Accedemos al penultimo elemento de la lista
print(nombres[-2])

# Solo muestra el indice 0, 1 pero no el indice 2
print(nombres[0:2])
# ir al inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) # Indices a mostrar: 0, 1, 2
# Desde el indice indicado hasta el final 
print(nombres[1:])
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

print('--------------------')
print(len(nombres)) # Le pasamos como parametro el nombre de la lista

nombres.append("Marcelo") # Se agrega al final
print(nombres)

# Inssertar un leemento en el indice especifico
nombres.insert(1, 'Alberto')
print(nombres) # ['Natalia', 'Alberto', 'Osvaldo', 'Liliana', 'Ariel', 'Marcelo']
nombres.insert(3, 'Debora')
print(nombres) # ['Natalia', 'Alberto', 'Osvaldo', 'Debora', 'Liliana', 'Ariel', 'Marcelo']

# Eliminamos un elemento 
nombres.remove('Alberto')
print(nombres) # ['Natalia', 'Osvaldo', 'Debora', 'Liliana', 'Ariel', 'Marcelo']

# Eliminar el ultimo elemento de la lista
nombres.pop()
print(nombres) # ['Natalia', 'Osvaldo', 'Debora', 'Liliana', 'Ariel']

# Eliminar unb indice especifico
del nombres[2]
print(nombres) # ['Natalia', 'Osvaldo', 'Liliana', 'Ariel']

# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres) # []

# Eliminar la lista
#del nombres
#print(nombres)