"""
Un diccionario esta compuesto por una LLAVE y un VALOR
dict(key,value)
"""

diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programacion Orientada a objetos',
    'SABD': 'Sistema de Administracion de Bases de Datos'
}

# Verificar la cantidad de elementos dentro de un diccionario
print(len(diccionario)) # Nos dice que hay tres elementos dentro de nuestro diccionario
print(diccionario)

# Acceder a un diccionario con la llave (key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento 
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos los elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos 
for termino in diccionario:
    print(termino) # Nos va a mostrar las llaves
    
# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor) # Con esta funcion si podemos acceder al valor de la llave
    
# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) # Muestra solo las llaves
    
for valor in diccionario.values():
    print(valor) # Accedemos solo a los valores
    
# Comprobar la existencia de algun elemento
print('IDE' in diccionario) # Devuelve un booleano 
print('IDLE' not in diccionario)

# Agregar un elemento 
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminamos un elemento 
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario 
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
del diccionario # el diccionario se borro
