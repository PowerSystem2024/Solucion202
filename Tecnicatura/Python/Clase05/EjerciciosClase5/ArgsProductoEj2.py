"""
Ejercicio 02: Funcion con *args para multiplicar.
Crear una funcion para multiplicar los valores recibidos de tipo numérico, 
utilizando argumentos variables *args como parametro de la funcion 
y regresar como resultado la multiplicacion de todos los valores pasados como argumentos. 
"""

def multiplicar(*args):
    
    resultado = 1
    for i in args:
        
        resultado *= i
                
    return resultado

print(f"La multiplicacion de los numeros es: {multiplicar(2, 3, 2)}")