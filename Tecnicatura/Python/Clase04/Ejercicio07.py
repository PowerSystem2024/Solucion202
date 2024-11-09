#Ejercicio 7: juego adivina el número
# Realizar un juego para adivinar el número. Para ello se debe
# generar un número aleatorio entre 1- 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El procediemiento termina cuando el usuario acierta
# y alli se debe mostrar el número de itnentos.
import random
print("'\t.:Juego adivina el número:.")
aleatorio = random.randint(0, 100) # tomo de 0 a 100 literal, generamos un número aleatorio
contador = 0
while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero > aleatorio:
        print("'\tNo es el número, digite un número menor")
    elif numero < aleatorio:
        print("'\tNo es el múmero digite un número mayor")
    else:
        print(f"FELICIDADES, cabas ade adivinar el número {aleatorio}")
        break # rompe el cilo y el bucle
print(f"'\tNúemro de intentos: {contador}")