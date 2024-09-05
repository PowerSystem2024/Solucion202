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

# Repaso diccionarios
diccionarioNuevo = {
    'Azul': 'Blue', 
    'Rojo': 'Red', 
    'Verde': 'Green', 
    'Amarillo': 'Yellow'
    }
print(diccionarioNuevo)

# Como eliminar un valor del diccionario
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {
    'Ariel': {'Edad': 40, 'Altura': 1.83}, 
    'Osvlado': [45, 1.85], 
    'Natalia': [35, 1.67]
    }

# Ejercicio Diccionario
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '35 millones euros', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '6 millones euros', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '60 millones euros', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '15 millones euros', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3 millones euros', 'Posicion': 'Portero'},
    23: {'Nombre': 'Damián Emiliano Martínez', 'Edad': 32, 'Altura': 1.95, 'Precio': '28 millones euros', 'Posicion': 'Portero'},
    27: {'Nombre': 'Alejandro Garnacho', 'Edad': 20, 'Altura': 1.80, 'Precio': '16 millones euros', 'Posicion': 'Extremo Derecho'},
    9: {'Nombre': 'Julián Alvarez', 'Edad': 24, 'Altura': 1.70, 'Precio': '90 millones euros', 'Posicion': 'Extremo Derecho'},
    8: {'Nombre': 'Marcos Acuña', 'Edad': 32, 'Altura': 1.72, 'Precio': '2.5 millones euros', 'Posicion': 'Extremo Izquierdo'} 
}
print("")
print(seleccionArgentina)
print("")
print(seleccionArgentina[10])
print("")
print(seleccionArgentina.values())
print("")
print("-------------- Vamos a imprimir sus llaves -----------------")
print("")
for llave in seleccionArgentina:
    print(llave)

print("")
print("-------------- Vamos a imprimir sus valores -----------------")
print("")
for valores in seleccionArgentina.values():
    print(valores)
    
print("")
print("-------------- Vamos a imprimir sus valores y llaves-----------------")
print("")
for llave, valores in seleccionArgentina.items():
    print(llave, valores)
    
print("")
print(f"Tiene {len(seleccionArgentina)} elementos este diccionario")
print('Tenemos cargado en el diccionario la cantidad de jugadores:', end=' ')
print(len(seleccionArgentina))