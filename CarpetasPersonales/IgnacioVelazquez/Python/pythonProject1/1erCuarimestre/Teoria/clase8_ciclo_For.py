# El ciclo for en Python se usa para iterar sobre una secuencia (como una lista, una tupla, un diccionario, un conjunto o una cadena de caracteres)
# o cualquier otro objeto iterable (como los generadores y las vistas de diccionario).

# Sintaxis básica:
# for variable in secuencia:
#     bloque de código

# Ejemplo simple:
# Iterar sobre una lista de números e imprimir cada número.

numeros = [1, 2, 3, 4, 5]

for numero in numeros:
    print(numero)

# Iterar sobre una cadena de caracteres
cadena = "Python"

for caracter in cadena:
    print(caracter)

# Usando la función range():
# La función range() se usa para generar una secuencia de números.
# Por defecto, empieza desde 0 y se incrementa en 1 (range(stop)).

# Ejemplo de range() con un argumento:
for i in range(5):
    print(i)  # Imprime del 0 al 4

# Ejemplo de range() con dos argumentos (start, stop):
for i in range(1, 6):
    print(i)  # Imprime del 1 al 5

# Ejemplo de range() con tres argumentos (start, stop, step):
for i in range(1, 10, 2):
    print(i)  # Imprime 1, 3, 5, 7, 9

# Usando `break` para salir del ciclo antes de que termine:
for numero in numeros:
    if numero == 3:
        break  # Sale del ciclo cuando numero es 3
    print(numero)

# Usando `continue` para saltar una iteración y continuar con la siguiente:
for numero in numeros:
    if numero % 2 == 0:
        continue  # Salta el resto del bloque de código si numero es par
    print(numero)

# Usando `else` con `for`:
# La parte `else` se ejecuta cuando el ciclo termina de iterar sobre la secuencia.
# No se ejecuta si el ciclo se interrumpe con `break`.

for numero in numeros:
    print(numero)
else:
    print("El ciclo for ha terminado")

# Iterar sobre un diccionario:
# Al iterar sobre un diccionario, se iteran las claves por defecto.

diccionario = {'a': 1, 'b': 2, 'c': 3}

for clave in diccionario:
    print(clave, diccionario[clave])  # Imprime la clave y su valor asociado

# Para iterar sobre claves y valores al mismo tiempo, usa el método items():
for clave, valor in diccionario.items():
    print(clave, valor)

# Resumen de conceptos:
# 1. El ciclo `for` se usa para iterar sobre secuencias y otros objetos iterables.
# 2. La función `range()` genera secuencias de números, útil para iteraciones basadas en conteo.
# 3. Usa `break` para salir del ciclo antes de tiempo.
# 4. Usa `continue` para saltar una iteración y continuar con la siguiente.
# 5. La cláusula `else` se ejecuta cuando el ciclo termina normalmente, pero no si se usa `break`.
# 6. Los diccionarios pueden iterarse por claves, valores, o ambos usando el método items().


