"""
1. Calcular el factorial de un numero mayor o igual a 0.
"""
# i = 1
# factorial = 1
# numero = int(input("Ingrese un numero: "))
# while i <= numero:
#     factorial *= i
#     i = i + 1

# print(f"El factorial es: {factorial}")

"""
2. Ingresar "N" enteros,visualizar la suma de los numeros pares de la lista,cuantos numeros pares existen,cual es el promedio de los numeros impares
"""
# elementos = int(input("Ingrese la cantidad de elementos a ingresar: "))
# i = 1
# totalPares = 0
# totalImpares = 0
# contadorPares = 0
# contadorImpares = 0

# while i <= elementos:
#     num = int(input("Ingrese un numero: "))
#     if num % 2 == 0:
#       totalPares = totalPares + num
#       contadorPares = contadorPares + 1
#     else:
#         totalImpares = totalImpares + num
#         contadorImpares = contadorImpares + 1
#     i = i + 1
# if contadorPares == 0:
#     print("No se ingresaron numeros pares")
# else:
#     print(f"La suma de los numeros pares es: {totalPares}, la cantidad de numeros pares ingresados es: {contadorPares}")

# promedioImpares = totalImpares / contadorImpares
# if contadorImpares == 0:
#     print("No se han digitado numeros impares")
# else:
#     print(f"El promedio de los numeros impares es: {promedioImpares}")

"""
3. Dadas las horas trabajadas de 5 personas y la tarifa de pago,calcular el salario,calcular la sumatoria de todos los salarios
"""

i = 1
suma = 0

while i <= 5:
    horas = float(input("Ingrese las horas trabajadas: "))
    tarifa = float(input("Ingrese la tarifa por hora: "))
    salario = horas * tarifa
    print(f"El salario es: ${salario}")
    suma = suma + salario
    i = i + 1

print(f"La suma de todos los salarios es: {suma}")