import math # Importamos la clase math para hacer uso de la funcion sqrt(raiz cuadrada)
#Eejrcicio de matematicas
#Para sacar la raiz cuadrada de un número positivi
numero = int(input("Digite un número positivi: "))
while numero < 0:
    print("Error -> Deberia ser un número positivo")
    numero = int(input("Digite un número positivo: "))
print(f"Su raiz cuadrada es: {math.sqrt(numero):.2f}")