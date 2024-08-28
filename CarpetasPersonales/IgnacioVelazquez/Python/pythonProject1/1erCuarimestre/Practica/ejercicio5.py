# Ejercicio 5 : Calacular el factorial de un número mayor o igual a cero

print("...::: Factorial :::...")

num = int(input("Ingrese un numero: "))
factorial =1

while num < 0:
    num = int(input("Debe ingresar un numero mayor que cero : "))

for i in range(1, num+1):
    factorial *= i

print(f"El factorial de {num} es {factorial} ")
