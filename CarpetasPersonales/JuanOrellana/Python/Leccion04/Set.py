
"""
En set, el orden es completamente aleatorio cuando mandamos a imprimir
No tiene indice el set
Es un tipo conjunto
Nos puede servir los conjuntos para evitar elementos duplicados puesto que no acepta elementos duplicados
"""

# Tipo set
planetas = {'Marte', 'Jupiter', 'Venus'}
print(planetas)
print(len(planetas)) # Usamos la funcion len

#Revisar si un elemento existe dentro de set
print('Marte' in planetas)

#Agregar un elemento 
planetas.add('Tierra') # add es una funcion
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Jupiter')
print(planetas)

# Otra forma de borrar que no arroja error
planetas.discard('tierra') #Aqui le pedimos con una palabra que no va a tomar que lo borre
print(planetas)
planetas.discard('Tierra') # Ahora si lo elimina
print(planetas)

# Limpiar set o conjunto 
planetas.clear()
print(planetas)

# Eliminar set o conjunto 
del planetas
#print(planetas) # Al eliminar nos muestra un error porque ya esta vacio el set