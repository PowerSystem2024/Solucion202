# Descomenta el bloque de código que desees ejecutar.
# Ejecuta el archivo para ver cómo funciona el código.
# Modifica el código según lo necesites para experimentar y entender mejor los conceptos.

# -------- CLASE  LECCION 4 --------

# -----LISTAS-----
# nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']

# print(nombres)
# print(nombres[3])
# print(nombres[2])
# print(nombres[-1])

##### Mostrar rango
# print(nombres[1:3])

##### Ir del inicio de la lista al indice x sin incluirlo
#print(nombres[ :3])

##### Ir desde el inidice indicado hasta el final
#print(nombres[2: ])

##### Modificar un valor
# nombres[2] = "Liliana"
# nombres[0] = "Natalia"
# print(nombres)

##### Iterar una lista
# for nombre in nombres:
#   print(nombre)
# else:
#   print('Se acabaron los elemontos de la lista')


####  LEN
# print(len(nombres)) #4

####  APEND
# nombres.append('Marcelo')
# print(nombres)

####  INSERT
# nombres.insert(1, "Debora") #['Naty', 'Debora','Osvaldo', 'Lily', 'Ariel', 'Marcelo']
# print(nombres)

#### REMOVE
# nombres.remove("Debora")
# print(nombres) #['Naty','Osvaldo', 'Lily', 'Ariel']

#### POP
# nombres.pop()
# print(nombres)  #['Naty','Osvaldo', 'Lily'], 

#### DEL 
# del nombres[2]
# print(nombres) #['Naty', 'Osvaldo', 'Ariel']

#### CLEAR
# nombres.clear()
# print(nombres) #[]


# ------- TUPLAS -------
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)

# #longitud
# print(len(cocina))   #3

# #acceder a un elemento
# print(cocina[2])  #tenedor
# print(cocina[-1]) #tenedor,

# #acceder a un rango
# print(cocina[0:1])  #('cuchara',)

#para eliminar el salto de linea de la funcion print:
# for cocinar in cocina:
#   print(cocinar, end=' ')

# Paso de tupla a lista:
# cocinaLista = list(cocina)
# cocinaLista[0] = 'plato'
# cocina = tuple(cocinaLista)
# print(cocina)
