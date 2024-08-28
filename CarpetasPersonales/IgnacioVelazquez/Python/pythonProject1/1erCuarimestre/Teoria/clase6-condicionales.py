# Los condicionales en Python se utilizan para tomar decisiones en el código
# y ejecutar diferentes bloques de código basados en ciertas condiciones.

# Sintaxis básica:
# if condición:
#     bloque de código
# elif otra_condición:
#     otro bloque de código
# else:
#     bloque de código final

# Ejemplo simple:
x = 10

if x > 0:
    print("x es positivo")
elif x == 0:
    print("x es cero")
else:
    print("x es negativo")

# Podemos tener múltiples condiciones `elif` (else if):
y = 5

if y > 10:
    print("y es mayor que 10")
elif y > 5:
    print("y es mayor que 5 pero menor o igual a 10")
elif y == 5:
    print("y es igual a 5")
else:
    print("y es menor que 5")

# Los condicionales también pueden anidarse:
z = 7

if z > 0:
    if z < 10:
        print("z es positivo y menor que 10")
    else:
        print("z es positivo y mayor o igual a 10")
else:
    print("z es negativo")

# Uso de operadores lógicos con condicionales:
# Python soporta operadores lógicos como `and`, `or`, y `not` para combinar múltiples condiciones.

a = 4
b = 8

if a > 0 and b > 0:
    print("Ambos a y b son positivos")

if a > 0 or b > 0:
    print("Al menos uno de a o b es positivo")

if not a > 0:
    print("a no es positivo")

# Condicionales abreviados:
# En Python, se pueden usar condicionales abreviados para asignar valores en función de una condición.

# Sintaxis:
# valor = valor_si_verdadero if condición else valor_si_falso

c = 3
d = 5
# Queremos encontrar el mayor de los dos números y almacenarlo en la variable "mayor".
# Usamos una expresión ternaria para hacerlo de manera concisa.

mayor = c if c > d else d

# Esto se puede leer como:
# "Asignar el valor de 'c' a 'mayor' si 'c' es mayor que 'd', de lo contrario asignar el valor de 'd'."

print("El mayor es", mayor)
# Resultado esperado: El mayor es 5


# Comparaciones múltiples:
# Python permite hacer comparaciones múltiples de forma concisa.

n = 15

if 10 < n < 20:
    print("n está entre 10 y 20")

# Ejemplo :
edad = 18
tiene_licencia = True

if edad >= 18:
    if tiene_licencia:
        print("Puede conducir")
    else:
        print("Necesita una licencia para conducir")
else:
    print("No puede conducir, es menor de edad")

# Resumen de conceptos:
# 1. Los condicionales `if`, `elif`, y `else` permiten ejecutar bloques de código basados en condiciones.
# 2. Se pueden anidar condicionales para verificar sub-condiciones.
# 3. Los operadores lógicos `and`, `or`, y `not` permiten combinar condiciones.
# 4. Los condicionales abreviados permiten asignaciones concisas basadas en una condición.
# 5. Python permite comparaciones múltiples en una sola expresión.