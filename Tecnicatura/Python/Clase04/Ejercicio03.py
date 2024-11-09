# Ejercicio 3: Interserta elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introdusca un número 0, nuestro programa dejaria de inserta.
# Por último, mostrar los número ordenado de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input("Digite un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() # LA lsita esta ordenada con esta función
print(f"Lista ordenada: {lista}")