# Descomenta el bloque de código que desees ejecutar.
# Ejecuta el archivo para ver cómo funciona el código.
# Modifica el código según lo necesites para experimentar y entender mejor los conceptos.

# Escribir la siguiente expresión en forma de expresión algorítmica
# a3*(b2-2ac)/2b
# pedimos e valores a,b,c
# Mostramos resultado final

a = float(input("ingrese valor de a: "))
b = float(input("ingrese valor de b: "))
c = float(input("ingrese valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a *c))/(2*b)
print(f'el resultado es: {resultado}')