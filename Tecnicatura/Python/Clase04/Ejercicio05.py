# Ejercicio 5: Facotrial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Digite un número: "))
while numero < 0: # Mientras el númeor sea negativo
    print("Error -> El número tiene que ser positivo")
    numero = int(input("Digite un número: "))
factorial = 1 # la variable apra aclacular el factorial
for i in range(1,numero+1):
    factorial *= i
print(f"El facotiral del numero {numero} positivo ingresado es: {factorial}")