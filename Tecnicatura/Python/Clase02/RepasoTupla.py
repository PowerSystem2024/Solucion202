# Repaso de tuplas
tupla = (4, 'hola', 6.78, [1, 2, 78], 4, 'Hola')  # Las tuplas pueden almacenar diferentes tipos de datos
# Las tuplas pueden contener números enteros, cadenas de texto, números flotantes, listas e incluso otros tipos de colecciones.
print(tupla)  # Imprime el contenido completo de la tupla

# Uso del operador 'in' para verificar si un valor está presente en la tupla
print(4 in tupla)  # Devuelve True si el valor 4 está presente en la tupla, de lo contrario devuelve False
# Esta es una acción booleana: devuelve un valor True o False dependiendo de si el elemento existe o no en la tupla

# Métodos que podemos usar con tuplas:
# 1. index() -> Retorna el índice de la primera aparición de un valor específico
print(tupla.index(6.78))  # Devuelve la posición en la que se encuentra el valor 6.78 en la tupla

# 2. count() -> Cuenta cuántas veces un elemento aparece en la tupla
print(tupla.count(4))  # Cuenta cuántas veces el valor 4 aparece en la tupla (en este caso, aparece 2 veces)

# 3. len() -> Devuelve el número de elementos en la tupla
print(len(tupla))  # Retorna la cantidad total de elementos en la tupla (en este caso, 6 elementos)

# Nota: Las tuplas son inmutables, es decir, no se pueden modificar después de ser creadas.
# Sin embargo, pueden contener elementos mutables como listas, que sí se pueden modificar.

# Conversión entre tuplas y listas:
# En Python, puedes convertir una tupla en una lista (para hacerla modificable) y viceversa.

# Convertir una tupla en una lista
lista_desde_tupla = list(tupla)  # Esto crea una lista basada en los elementos de la tupla
print(lista_desde_tupla)  # Imprimimos la lista resultante, ahora los elementos son modificables

# Convertir una lista en una tupla
nueva_tupla = tuple(lista_desde_tupla)  # Convierte de nuevo la lista en una tupla
print(nueva_tupla)  # Imprimimos la nueva tupla creada a partir de la lista

# Recordemos que las tuplas son más eficientes en cuanto a velocidad y uso de memoria cuando no necesitamos modificar los elementos.

# Las tuplas son útiles cuando quieres asegurarte de que una secuencia de datos no sea modificada accidentalmente, por lo que son más rápidas y eficientes en memoria que las listas.