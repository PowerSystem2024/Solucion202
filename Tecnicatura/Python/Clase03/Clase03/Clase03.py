# 3.1 Repaso del tipo set o conjunto
# Para definir un conjunto
conjunto2 = set()  # Con set si se puede inicializar vacío el parentesis
conjunto1 = {"bye", }  # Con llaves no se puede inicializar vacío porque sale error al usar la función .add

# Con el .add se agregan de a un solo elemento
conjunto2.add(7)
conjunto2.add("hola")
print(conjunto2)

conjunto1.add("Hola")
print(conjunto1)

print(3 not in conjunto1)  # Preguntamos si el 3 no está en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)  # Nos devuelve un boolean

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2  # La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2  # Que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2  # Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1  # Asigna el valor que esta en el conjunto2 y no en el conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2  # Elementos que NO comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3))  # Aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1))  # Aqui preguntamos si los elementos del conjunto1 estan dentro del 3
print(conjunto3.issuperset(conjunto2))  # Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2))  # Al cambiar un Hola por un hola No hay cosas en comun e imprime True

# Convertir un conjunto en inmutable - No se puede agregar, modificar ni eliminar elementos del conjunto
conjunto1 = frozenset

# 3.2 Repaso de Diccionarios
diccionarioNuevo = {"Azul": "Blue", "Rojo": "Red", "Verde": "Green", "Amarillo": "Yellow"}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferente tipos de datos
diccionario2 = {"Ariel": {"Edad": 40, "Altura": 1.83}, "Osvaldo": [45, 1.85], "Natalia": [35, 1.67]}
print(diccionario2)

# 3.3 Ejercicio con Diccionario y tarea
seleccionArgentina = {
    10: {"Nombre": "Lionel Messi", "Edad": 35, "Altura": 1.60, "Precio": "50 millones", "Posicion": "Extremo derecho"},
    11: {"Nombre": "Angel Di Maria", "Edad": 34, "Altura": 1.80, "Precio": "12 millones", "Posicion": "Extremo derecho"},
    24: {"Nombre": "Paulo Dybala", "Edad": 28, "Altura": 1.77, "Precio": "35 millones", "Posicion": "Media Punto"},
    19: {"Nombre": "Nicolas Otamendi", "Edad": 34, "Altura": 1.83, "Precio": "3.5 millones", "Posicion": "Defensa central"},
    1: {"Nombre": "Franco Armani", "Edad": 35, "Altura": 1.89, "Precio": "12 millones", "Posicion": "Portero"}
}
print(seleccionArgentina[10])
print(seleccionArgentina.values())

for llave in seleccionArgentina:
    print(llave)
for valor in seleccionArgentina.values():
    print(valor)

for llave,valor in seleccionArgentina.items():
    print(llave, valor)

print("Tenemos cargados en el diccionario la cantidad de jugadores:", end=" ")
print(len(seleccionArgentina))

# Como tarea:
# Agregar por lo menos  4 jugadores mas al diccionario: seleccionArgentina
seleccionArgentina[23] = {"Nombre": "Emiliano Martinez", "Edad": 30, "Altura": 1.95, "Precio": "28 millones", "Posicion": "Arquero"}
seleccionArgentina[3] = {"Nombre": "Nicolas Tagliafico", "Edad": 30, "Altura": 1.72, "Precio": "27 millones", "Posicion": "Lateral izquierdo"}
seleccionArgentina[5] = {"Nombre": "Leandro Paredes", "Edad": 28, "Altura": 1.82, "Precio": "27 millones", "Posicion": "Volante central"}
seleccionArgentina[22] = {"Nombre": "Lautaro Martinez", "Edad": 25, "Altura": 1.74, "Precio": "24 millones", "Posicion": "Delantero"}
seleccionArgentina[24] = {"Nombre": "Lisandro Martinez", "Edad": 24, "Altura": 1.75, "Precio": "20 millones", "Posicion": "Defensa central"}

for llave,valor in seleccionArgentina.items():
    print(llave, valor)

# 3.4 Método con listas llamado PILAS
pila = [1, 2, 3]  # Siempre se trabaja con el último elemento, no se puede sacar el primer elemento

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
pila.pop()
print(pila)

elementoBorrado = pila.pop()  # Quita el ultimo elemento y lo guarda en la variable
print(f"Sacamos el elemento: {elementoBorrado}")
print(f"La pila ahora quedo asi: {pila}")

# 3.5  Método con listas llamado COLA
# Esctructura de datos de tipo fifo (first input / first output)
cola = ["Ariel", "Osvaldo", "Liliana", "Pilar"]

# Agregamos elementos al final de la cola
cola.append("Natalia")
cola.append("Jose")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)
