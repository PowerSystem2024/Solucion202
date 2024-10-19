# Funciones recursivas
"""
Es una funcion recursiva cuando se llama a si mismo para cumplir una tarea
"""

def factorial(numero):
    
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero - 1) # Caso recursivo
    
numero = int(input("Ingrese un nunmero entero: "))
resultado = factorial(numero)

print(f"El factorial del numero 5 es: {resultado}")