# Ejercicio 3: Función Recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 2
# En caso de ser el número 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada
def imprimir_numeros_recursivos(numero):
    if numero >= 1: # Caso Base
        print(numero)
        imprimir_numeros_recursivos(numero-1) # Case recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("Valor ingresado incorrecto...")

imprimir_numeros_recursivos(5)

# TAREA: Que el número lo ingrese el usuario

# Solicitamos al usuario que ingrese un número
numero_usuario = int(input("Ingresa un número para comenzar a contar hacia atrás: "))

# Llamamos a la función con el número ingresado por el usuario
imprimir_numeros_recursivos(numero_usuario)