# Ejercicio 5: Convertidor  de temperaturas
# Realizar dos funciones para convertir de grados celsius
# a fahrenheit y viseversa.
# Investigar las formulas

# Función para convertir de Celsius a Fahrenheit
def celsius_a_fahrenheit(celsius):
    return (celsius * 9/5) + 32

# Función para convertir de Fahrenheit a Celsius
def fahrenheit_a_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

# Solicitamos al usuario que ingrese la temperatura
opcion = input("Elige la conversión: \n1. Celsius a Fahrenheit \n2. Fahrenheit a Celsius \n")

if opcion == "1":
    celsius = float(input("Ingresa la temperatura en grados Celsius: "))
    print(f"{celsius}°C es igual a {celsius_a_fahrenheit(celsius)}°F")
elif opcion == "2":
    fahrenheit = float(input("Ingresa la temperatura en grados Fahrenheit: "))
    print(f"{fahrenheit}°F es igual a {fahrenheit_a_celsius(fahrenheit)}°C")
else:
    print("Opción no válida")
