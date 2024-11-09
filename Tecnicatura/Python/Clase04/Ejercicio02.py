# Ejercicio 2: Modifcar los elementos de una lista
# Llenar una lista con los números del 1 al 10, luego modiifcar los
# elementos de la lista multiplicandolos por un valor ingresado pr el usuario

lista = list(range(1, 11))
print("Lista original")
for i in lista:
    print(i, end="-")
valor = int(input("Digite un valor a multiplicar: "))
# Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista): # Funcion para modificar los indices de la lista
    lista[indice] *= valor # El interador solo recorre los indice, en esta línea se multiplica

print(f"Lista final con los elementos multiplicados por {valor}")
for i in lista:
    print(i, end="-")