"""
Ejercicio 3: Funcion recursiva
Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor de 5, debe imprimir:
5
4
3
2
1
En caso de ser el numero 3:
3
2
1
Si se ingresan numeros negativos no pasa nada
"""

def numeroRecursivo(numero):
    
    if numero >= 1:
        print(numero)
        numeroRecursivo(numero - 1)
    elif numero == 0:
        return
    elif numero < 0:
        print("Valor ingresado incorrecto... ")
    
        
numero = int(input("Ingrese un numero positivo: "))
numeroRecursivo(numero)