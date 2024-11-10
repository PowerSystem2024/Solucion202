"""
'Maradona':10 - Un diccionario esta compuesto por dos elementos
Un diccionario esta compuesto por una LLAVE y un VALOR
dict(key,value)
"""

diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programacion Orientada a objetos',
    'SABD': 'Sistema de Administracion de Bases de Datos'
}

# Verificar la cantidad de elementos dentro de un diccionario
print(diccionario) # {'IDE': 'Integrate...', 'POO': 'Programacion Orienta...', 'SABD': 'Sistema ...'}
print(len(diccionario)) # Nos dice que hay 3 elementos dentro de nuestro diccionario

# Acceder a un diccionario con la llave (key)
print(diccionario['IDE']) # Integrated Development Environment

# Otra forma de recuperar un elemento 
print(diccionario.get('POO')) # Programacion Orientada a objetos
print(diccionario.get('SABD')) # Sistema de Administracion de Bases de Datos

# Modificamos los elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario) # 'IDE': 'Entorno de Desarrollo Integrado', 'POO': 'Programa...', 'SABD': 'Sistem...'}

# Como recorrer los elementos 
for termino in diccionario:
    print(termino) # Nos va a mostrar las llaves
    
# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():# Con la funcion (.items())si podemos acceder al valor de la llave
    print(termino, valor) 
    
# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Muestra solo las llaves
    print(termino) 
    
for valor in diccionario.values(): # Accedemos solo a los valores
    print(valor) 
    
# Comprobar la existencia de algun elemento
print('IDE' in diccionario) # True
print('IDLE' not in diccionario) # True

# Agregar un elemento 
diccionario['PK'] = 'Primary key'
print(diccionario) #{'IDE': 'Entorno de Desarrollo Integrado', 'POO': 'Programacion Orientada a objetos', 'SABD': 'Sistema de Administracion de Bases de Datos', 'PK': 'Primary key'}

# Eliminamos un elemento 
diccionario.pop('SABD') 
print(diccionario)  # {'IDE': 'Entorno de Desarrollo Integrado', 'POO': 'Programacion Orientada a objetos', 'PK': 'Primary key'}


# Vaciar un diccionario 
diccionario.clear()
print(diccionario) # {}

# Eliminar el diccionario
del diccionario # el diccionario se borro