# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
    # suma de números pares del 2 al 30
    # suma = 240


a = int(input("Ingrese de donde va a comenzar la suma: "))
b = int(input("Ingrese hasta donde va a llegar la suma: "))

suma = 0
for i in range(a, b+1):
    if i % 2 == 0:
        suma += 1
print(f'La suma de números pares dentro del rango es: {suma}')


# Ejercicio 5 Factorial de un número positivo

numero = int(input("Ingrese un numero: "))
while numero < 0:
    print('Error -> el número debe ser positivo')
    numero = int(input("Ingrese un número: "))
factorial = 1
for i in range(1, numero+1):
    factorial *= i

print(f'El factorial del numero {numero} positivo ingresado es: {factorial}')