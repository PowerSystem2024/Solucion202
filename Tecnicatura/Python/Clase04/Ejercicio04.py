# Ejercicio 04: Sumar numeros pares dentro de un rango
# Hacer un programa apra sumar núemros pares dentro
# de un rango, por ejemplo:
#                         Suma de número pares del 2 al 30
#                         suma = 420

a = int(input("Digite de donde va a comenzar la suma: "))
b = int(input("Digite hasta donde quiero llegar a sumar: "))
suma = 0
for i in range(a, b+1):
    if i % 2 == 0: # Esto es si el número es par
        suma += i
print(f"La suma de núemro pares dentro del rango es: {suma}")