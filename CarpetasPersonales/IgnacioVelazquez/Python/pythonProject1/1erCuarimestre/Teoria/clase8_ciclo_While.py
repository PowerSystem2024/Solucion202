# Ciclo While (mientras / durante)
# El ciclo while en Python permite repetir un bloque de código mientras una condición sea verdadera.
# Es útil cuando no se sabe de antemano cuántas veces se debe repetir el ciclo

#sintaxis del ciclo while

#declaramos una condición, como un contador
contador = 0
while contador < 10:
    print(f"el contador va {contador}")
    contador += 1
else:
    print(f"el contado termino con {contador -1} repeticiones")

# Es importante asegurarse de que la condición eventualmente se vuelva falsa,
# de lo contrario, el ciclo se ejecutará indefinidamente.


# Podemos usar la instrucción `break` para salir del ciclo antes de que la condición sea falsa.
# Ejemplo con `break`:

numero = 1

while numero <= 10:
    print(numero)
    if numero == 5:
        # Salimos del ciclo cuando `numero` es igual a 5
        break
    numero += 1

# También podemos usar `continue` para saltar el resto del bloque de código y continuar con la siguiente iteración.
# Ejemplo con `continue`:

numero = 0

while numero < 10:
    numero += 1
    if numero % 2 == 0:
        # Saltamos el resto del código si `numero` es par
        continue
    print(numero)

# Usando `else` con `while`:
# La parte `else` se ejecuta cuando la condición del ciclo se vuelve falsa.
# No se ejecuta si el ciclo se interrumpe con `break`.

numero = 1

while numero <= 5:
    print(numero)
    numero += 1
else:
    print("El ciclo while ha terminado")

# Resumen de conceptos:
# 1. El ciclo `while` se usa cuando no se sabe cuántas veces se debe repetir el bloque de código.
# 2. Asegúrate de que la condición eventualmente se vuelva falsa para evitar ciclos infinitos.
# 3. Usa `break` para salir del ciclo antes de tiempo.
# 4. Usa `continue` para saltar una iteración y continuar con la siguiente.
# 5. La cláusula `else` se ejecuta cuando la condición del ciclo se vuelve falsa, pero no si se usa `break`.
