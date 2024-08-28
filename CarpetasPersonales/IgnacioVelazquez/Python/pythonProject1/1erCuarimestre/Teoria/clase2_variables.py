# Resumen de variables en Python

# Una variable en Python es un nombre que se refiere a un valor almacenado en la memoria.
# Se puede usar para almacenar datos como números, cadenas de caracteres, listas, etc.

# Declaración e inicialización de variables:
# Para declarar una variable, simplemente escribe su nombre seguido de un signo igual (=) y el valor que quieres asignar.

# Ejemplo de variables numéricas
a = 10  # Variable entera
b = 3.14  # Variable de punto flotante

# Imprimir el valor de las variables
print(a)  # Imprime: 10
print(b)  # Imprime: 3.14

# Variables de cadena de caracteres (strings)
nombre = "Juan"
saludo = 'Hola, ¿cómo estás?'

print(nombre)  # Imprime: Juan
print(saludo)  # Imprime: Hola, ¿cómo estás?

# Variables booleanas
es_mayor = True
es_menor = False

print(es_mayor)  # Imprime: True
print(es_menor)  # Imprime: False

# Variables de lista
numeros = [1, 2, 3, 4, 5]

print(numeros)  # Imprime: [1, 2, 3, 4, 5]

# Variables de tupla
coordenadas = (10.0, 20.0)

print(coordenadas)  # Imprime: (10.0, 20.0)

# Variables de diccionario
persona = {"nombre": "Ana", "edad": 25}

print(persona)  # Imprime: {'nombre': 'Ana', 'edad': 25}

# Reasignación de variables:
# Puedes cambiar el valor de una variable en cualquier momento asignándole un nuevo valor.

x = 5
print(x)  # Imprime: 5

x = 10  # Reasignación de la variable x
print(x)  # Imprime: 10

# Nombres de variables:
# Los nombres de las variables deben empezar con una letra (a-z, A-Z) o un guion bajo (_).
# Después pueden contener letras, números y guiones bajos.

# Ejemplos de nombres válidos de variables:
nombre_usuario = "Carlos"
_edad = 30
cantidad1 = 100

# Ejemplos de nombres inválidos de variables (descomentar para ver los errores):
# 1nombre = "Pedro"  # No puede empezar con un número
# nombre-usuario = "Carlos"  # No puede contener guiones

# Sensibilidad a mayúsculas y minúsculas:
# Python diferencia entre mayúsculas y minúsculas en los nombres de las variables.

Variable = 1
variable = 2

print(Variable)  # Imprime: 1
print(variable)  # Imprime: 2

# Resumen de conceptos:
# 1. Las variables se usan para almacenar datos.
# 2. Se pueden reasignar en cualquier momento.
# 3. Los nombres de las variables deben seguir ciertas reglas de sintaxis.
# 4. Python distingue entre mayúsculas y minúsculas en los nombres de las variables.

