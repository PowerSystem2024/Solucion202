# Diseñar un programa que ingresado un año, nos devuelva por consola si es un año bisiesto o no
# repetir la acción hasta que el usuario lo decida.

print("""
    Calculadora Año biciestos
""")

opcion= 1
while opcion != 0:
    num = int(input("Ingrese un año para comprobar si es biciesto: "))
    if (num % 4 == 0 and (num % 100 != 0)) or num % 400 == 0:
        print("el Año es biciesto")
    else:
        print("El año no es biciesto")
    opcion = int(input("tipee 0 para salir salir otro numero para continuar"))

