"""
Ejercicio 01: Crear una funcion para sumar los valores recibidos de tipo numericos,
utilizando argumentos variables *args como parametro de la funcion y agregar como 
resultado la suma de todos los valores pasados como argumentos. 
"""

def sumar(*args):
    
    resultado = 0
    for i in args:
        
        resultado += i
                
    return resultado # Si hago un print() me retorna un valor "None"
    
print(f"El resultado de la suma es: {sumar(1, 2, 77)}")


        