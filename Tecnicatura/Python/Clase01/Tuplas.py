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
verdura = ('papa') # Tipo string cadena. Una tupla necesita aunque sea un elemento la coma.

# Recorremos los elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") # Print esta usando \n para saltos de linea.
    # Con end= lo metemos todo en una misma linea, con " " separamos en cada salida por un espacio 
    
# Esto se puede hacer pero no es de buena practica hacerlo
cocinaLista = list(cocina)
#cocinaLista[0] = 'Plato' # Nos marca error porque no es de buena practica hacerlo
cocina = tuple(cocinaLista)
print('\n', cocina)

# Eleminamos la tupla 
# del cocina
# print(cocina)