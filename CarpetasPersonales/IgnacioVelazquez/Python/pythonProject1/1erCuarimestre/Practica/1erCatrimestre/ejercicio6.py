#Ejercicio 7
# Ingresar "N" enteros,
# visualizar la suma de los números pares de la lista,
# cuántos números pares existen y cuál es el promedio de los números impares.

print("...::: Ejercicio 6 :::...")

n = int(input("Ingrese la cantidad de números que desea ingresar :"))
suma_pares =0
cuenta_pares =0
suma_impares =0
cuenta_impares =0

for i in range(1,n+1):
    num = int(input(f"Ingrese el {i}° número : "))
    if num % 2 == 0:
        suma_pares += num
        cuenta_pares += 1
    else:
        suma_impares += num
        cuenta_impares += 1

print(f"la suma de los Pares es igual a {suma_pares} siendo un total de {cuenta_pares} dando su promedio {suma_pares/cuenta_pares}")
print(f"La suma de los IMPARES es igual a {suma_impares} siendo un total de {cuenta_impares} dando su promedio {suma_impares/cuenta_impares}")