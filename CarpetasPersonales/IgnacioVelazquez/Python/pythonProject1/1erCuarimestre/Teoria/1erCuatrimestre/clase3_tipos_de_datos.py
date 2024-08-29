# Tipos de datos en Python

# En Python, hay varios tipos de datos integrados que se utilizan para almacenar diferentes tipos de información.
# Los tipos de datos más comunes incluyen: enteros, flotantes, cadenas de caracteres, listas, tuplas, conjuntos y diccionarios.

# 1. Números enteros (int)
# Los enteros son números sin punto decimal.

a = 10
b = -5
print(a)  # Imprime: 10
print(b)  # Imprime: -5
print(type(a))  # Imprime: <class 'int'>

# 2. Números de punto flotante (float)
# Los flotantes son números con punto decimal.

c = 3.14
d = -2.7
print(c)  # Imprime: 3.14
print(d)  # Imprime: -2.7
print(type(c))  # Imprime: <class 'float'>

# 3. Cadenas de caracteres (str)
# Las cadenas son secuencias de caracteres encerradas entre comillas simples o dobles.

nombre = "Juan"
saludo = 'Hola, ¿cómo estás?'
print(nombre)  # Imprime: Juan
print(saludo)  # Imprime: Hola, ¿cómo estás?
print(type(nombre))  # Imprime: <class 'str'>

# 4. Listas (list)
# Las listas son colecciones ordenadas de elementos que pueden cambiar (son mutables).

numeros = [1, 2, 3, 4, 5]
mixta = [1, "dos", 3.0, [4, 5]]
print(numeros)  # Imprime: [1, 2, 3, 4, 5]
print(mixta)  # Imprime: [1, 'dos', 3.0, [4, 5]]
print(type(numeros))  # Imprime: <class 'list'>

# 5. Tuplas (tuple)
# Las tuplas son colecciones ordenadas de elementos que no pueden cambiar (son inmutables).

coordenadas = (10.0, 20.0)
colores = ('rojo', 'verde', 'azul')
print(coordenadas)  # Imprime: (10.0, 20.0)
print(colores)  # Imprime: ('rojo', 'verde', 'azul')
print(type(coordenadas))  # Imprime: <class 'tuple'>

# 6. Conjuntos (set)
# Los conjuntos son colecciones desordenadas de elementos únicos.

numeros_unicos = {1, 2, 3, 4, 5, 5, 4}
print(numeros_unicos)  # Imprime: {1, 2, 3, 4, 5}
print(type(numeros_unicos))  # Imprime: <class 'set'>

# 7. Diccionarios (dict)
# Los diccionarios son colecciones desordenadas de pares clave-valor.

persona = {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"}
print(persona)  # Imprime: {'nombre': 'Ana', 'edad': 25, 'ciudad': 'Madrid'}
print(type(persona))  # Imprime: <class 'dict'>

# 8. Booleanos (bool)
# Los booleanos representan uno de dos valores: True o False.

es_mayor = True
es_menor = False
print(es_mayor)  # Imprime: True
print(es_menor)  # Imprime: False
print(type(es_mayor))  # Imprime: <class 'bool'>

# Conversión de tipos de datos:
# Python permite convertir un tipo de dato a otro usando funciones integradas como int(), float(), str(), list(), tuple(), set(), dict().

# Ejemplos de conversión:
e = 10
f = 3.5
g = "123"
h = [1, 2, 3]
i = (4, 5, 6)
j = {7, 8, 9}
k = {"nombre": "Carlos", "edad": 30}

# Convertir int a float
e_flotante = float(e)
print(e_flotante)  # Imprime: 10.0

# Convertir float a int
f_entero = int(f)
print(f_entero)  # Imprime: 3

# Convertir str a int
g_entero = int(g)
print(g_entero)  # Imprime: 123

# Convertir list a tuple
h_tupla = tuple(h)
print(h_tupla)  # Imprime: (1, 2, 3)

# Convertir tuple a list
i_lista = list(i)
print(i_lista)  # Imprime: [4, 5, 6]

# Convertir set a list
j_lista = list(j)
print(j_lista)  # Imprime: [7, 8, 9]

# Convertir dict a list (de claves)
k_lista_claves = list(k)
print(k_lista_claves)  # Imprime: ['nombre', 'edad']

# Resumen de conceptos:
# 1. Python tiene varios tipos de datos integrados, como int, float, str, list, tuple, set, dict, y bool.
# 2. Las listas son mutables, mientras que las tuplas son inmutables.
# 3. Los conjuntos contienen elementos únicos y no están ordenados.
# 4. Los diccionarios almacenan pares clave-valor.
# 5. Los booleanos representan valores de verdad (True o False).
# 6. Python permite convertir entre tipos de datos usando funciones integradas.

