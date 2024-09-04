
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
#print(planetas) # Al eliminar nos muestra un error porque ya esta vacio el set

#Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set() # Si lo definimos como set, vamos a poder agregar mas eleemntos despues de diferente tipo
conjunto1 = {'Hola', }
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
# conjunto1.add(1, 'Hola') no se le puede agregar nada porque ya a sido inicializado de forma vacia
conjunto1.add('bye')
print(conjunto1)
print(3 not in conjunto1)

# Hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)
print("")

#Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 # La linea une los dos conjuntos
print(f"Unificando conjuntos: {conjunto3}") # Si cambio 'hola' por 'Hola' me unifica de los dos conjuntos

conjunto3 = conjunto1 & conjunto2 # Que elementos tienen en comun
print(f"Estoy mostrando que elementos tienen en comun: {conjunto3}")

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(f"Estoy mostrando el valor que esta en el conjunto 1 y no en el 2: {conjunto3}")
conjunto3 = conjunto2 - conjunto1
print(f"Estoy mostrando el valor que esta en el conjunto 2 y no en el 1: {conjunto3}")

conjunto3 = conjunto1 ^ conjunto2 # Elementos que NO comparten
print(f"Estoy mostrando que elementos NO comparten: {conjunto3}")
conjunto3 = conjunto1.symmetric_difference(conjunto2)
print(f"Estoy mostrando que elementos NO comparten con libreria: {conjunto3}")

print("")
conjunto3 = conjunto1 | conjunto2 # Aqui preguntamos si un conjunto es un subconjunto de otro
print(f"Vamos a imprimir si el conjunto 1 es un subconjunto del 3: {conjunto1.issubset(conjunto3)}")
print(f"Vamos a imprimir si el conjunto 2 es un subconjunto del 3: {conjunto2.issubset(conjunto3)}")
print(f"Vamos a imprimir si el conjunto 3 es un subconjunto del 1: {conjunto3.issubset(conjunto1)}")
print(f"Vamos a imprimir si el conjunto 3 es un subconjunto del 2: {conjunto3.issubset(conjunto2)}")

print("")
# Si nos da verdadero, quiere decir que el conjunto 3 es un superconjunto
print(f"Vamos a preguntar si los elementos del conjunto 1 estan en el 3: {conjunto3.issuperset(conjunto1)}")
print(f"Vamos a preguntar si los elementos del conjunto 2 estan en el 3: {conjunto3.issuperset(conjunto2)}")
print(f"Ahora vamos a hacer al reves: {conjunto1.issuperset(conjunto3)}")
print(f"Ahora vamos a hacer al reves: {conjunto2.issuperset(conjunto3)}")

print("")
# Como saber si ambos conjuntos son disjuntos, esto es si no comparten elementos en comun
print(f"Ver si son disconexos conj 1 del conj 2 {conjunto1.isdisjoint(conjunto2)}")
print(f"Ver si son disconexos conj 2 del conj 1 {conjunto2.isdisjoint(conjunto1)}")

print("")
#Convertir un conjunto totalmente en inmutable
# No se puede agregar, modificar ni eliminar elementos del conjunto 
conjunto1 = frozenset # Esto hace que el conjunto sea totalmente inmutable

