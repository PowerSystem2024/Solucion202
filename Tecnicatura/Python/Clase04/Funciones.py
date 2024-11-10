# Comenzamos con funciones

# Definimos una funcion
def mi_funcion():
    print('Saludos a todos')

mi_funcion() # Estamos llamando a la funcion


# Ejercicio 6: Tabla de multiplicar
# Pedir numero por teclado y guardar en una lista la tabla de multiplicar hasta el 10

numero2 = int(input("Ingrese un numero: "))
lista2 = []
for i in range(1, 11):
    lista2.append(i*numero2)

print(f'Tabla de multiplicar del {numero2}: ')
print(f'{lista2}')

for indice, i in enumerate(lista2):
    print(f'{numero2} x {i} = {lista2[indice]}')


# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar el número
# Generar un numero aleatorio entre 1 - 100 y luego ir pidiendo numeros indicando "es mayor" o "es menor"
# con respecto a N. El proceso termina cuando el usuario acierta y alli mostrar el numero de intentos

import random

aleatorio = random.randint(0, 100)
contador = 0
while True:
    numero = int(input("Ingrese un numero"))
    contador += 1
    if numero > aleatorio:
        print('No es el numero, ingrese un numero menor')
    elif numero < aleatorio:
        print('No es el numero, ingrese un numero mayor')
    else:
        print('FELICIDADES, acabas de adivinar el numero {aleatorio}')
        break
print(f'Número de intentos: {contador}')


# Ejercicio 8: Menú interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo inicial de $1000 y tendra el siguiente menu de acciones
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir

saldo = 1000

while True:
    print('MENÚ')
    print('1. Ingresar dinero en la cuenta')
    print('2. Retirar dinero de la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    opcion = int(input("Ingrese una opcion: "))
    print()
    if opcion == 1:
        extra = float(input("Digite el monto a ingresar: "))
        saldo += extra
        print(f'Dinero en la cuenta al momento: {saldo}')
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar -> "))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
            print(f"Dinero en la cuenta al momento: ${saldo}")

    elif opcion == 3:
        print(f"Dinero en la cuenta al momento: ${saldo}")

    elif opcion == 4:
        print("Gracias por utilizar su cajero automatico, hasta pronto")
        break
    else:
        print('Error, se equivoco de opcion de menu')



# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le
# devolverá la misma frase pero sin espacios en blanco, y
# además un contador de cuántos caracteres tiene la frase
# (sin contar los espacios en blanco)
# Ejemplo:
#   frase = vivir por siempre en paz
#   frase final = vivirporsiempreenpaz
#   N° de caracteres = 20

frase1 = input("Digite una frase: ")
frase2 = ""

for i in frase1:
    if i != " ":
        frase2 += i

frase1 = frase2
print(f'\nFrase final: {frase1}')
print(f'N° de caracteres: {len(frase1)}')