# Las tuplas no se pueden modificar

# Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)
print(len(cocina))

# Acceder a un elemento
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango 
print(cocina[0:2])

# Ejemplo
verdura = ('verduras') # Tipo string cadena. Una tupla necesita aunque sea un elemento la coma.

# Recorremos los elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") # Print esta usando \n para saltos de linea.
    # Con end= lo metemos todo en una misma linea, con " " separamos en cada salida por un espacio 
    
# Esto se puede hacer pero no es de buena practica hacerlo
cocinaLista = list(cocina)
#cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n',cocina)
    
# Eliminar la tupla
# del cocina
# print(cocina)

# Repaso de tuplas
tupla = (4, 'hola', 6.78, [1, 2, 78], 4, 'Hola') # Pueden tener diferentes tipos de datos
print(tupla)

print(4 in tupla) # Accion booleana, su respuesta es de tipo booleana

# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla