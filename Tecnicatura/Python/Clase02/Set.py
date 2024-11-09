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

#Revisar si un elemento existe dentro de set. Esto se puede hacer en tuplas y listas
print('Marte' in planetas) # True
print('Júpiter' in planetas) # False

#Agregar un elemento 
planetas.add('Tierra') # add es una funcion
planetas.add('Tierra') # No va a mostrar nada porque no se pueden ingresar elementos repetidos
print(planetas) # {'Venus', 'Jupiter', 'Marte', 'Tierra'}

# Eliminar elementos, puede arrojar un error si el elemento no existe
#planetas.remove('Jupiter')
#print(planetas)