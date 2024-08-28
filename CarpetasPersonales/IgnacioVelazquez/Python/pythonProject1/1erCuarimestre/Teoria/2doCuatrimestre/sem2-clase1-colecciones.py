# Listas en Python
# ----------------

# Una lista es una colección ordenada y mutable de elementos en Python.
# Se define utilizando corchetes [] y los elementos están separados por comas.

# Creación de una lista vacía
mi_lista_vacia = []  # Una lista vacía, sin elementos

# Creación de una lista con elementos
mi_lista = [1, 2, 3, 4, 5]  # Lista de enteros
otra_lista = ["a", "b", "c"]  # Lista de cadenas de texto (strings)
mixta_lista = [1, "dos", 3.0, True]  # Lista con diferentes tipos de datos

# Las listas pueden contener cualquier tipo de datos, incluyendo otras listas (listas anidadas)
lista_anidada = [1, [2, 3], [4, 5, 6]]

# Acceso a los elementos de una lista
# Los elementos en una lista se pueden acceder usando índices.
# Los índices comienzan en 0 para el primer elemento.
primer_elemento = mi_lista[0]  # Esto retorna 1, el primer elemento
ultimo_elemento = mi_lista[-1]  # Esto retorna 5, el último elemento

#Acceso a un rango de la lista
mi_lista_de_rango = mi_lista[0:2] #Esto devolveria [1, 2] el "2" es excluyente
mi_lista_de_rango1 = mi_lista[ :3] #Esto devolveria [1, 2, 3] el compilador entiende que el espacio en blanco hace referencia al primer elemento
mi_lista_de_rango2 = mi_lista[1: ] #Esto devolveria [2, 3,4,5] el compilador entiende que el espacio en blanco hace referencia hasta el ultimo elemento
print(mi_lista_de_rango , mi_lista_de_rango1 , mi_lista_de_rango2)
# Modificación de elementos en una lista
# Las listas son mutables, lo que significa que puedes cambiar sus elementos.
mi_lista[2] = 10  # Cambia el tercer elemento de 3 a 10

# Agregar elementos a una lista
mi_lista.append(6)  # Agrega el número 6 al final de la lista

# Insertar elementos en una posición específica
mi_lista.insert(1, 1.5)  # Inserta 1.5 en la posición 1 (segundo lugar)

# Eliminar elementos de una lista
mi_lista.remove(10)  # Elimina el primer elemento con valor 10

# Eliminar un elemento por su índice y retornar su valor
elemento_eliminado = mi_lista.pop(2)  # Elimina y retorna el tercer elemento si dejo .pop() sin argumento por default elimina el último

#Eliminar un indice especifico
del mi_lista[0] #del significa delete
#Para borrar todos los elementos de la lista
mi_lista.clear()
#Para eliminar directamente la lista se hace
# del mi_lista

# Para saber cuantos elementos tiene una lista se hace con el metodo len
longitud = len(mi_lista)  # Retorna la longitud de la lista

# para Inviertir el orden de los elementos en la lista
mi_lista.reverse()

#Para ordenar la lista (si los elementos son comparables)
mi_lista.sort()

nombres = ["Carlos", "Ana", "Pedro", "Beatriz", "Juan"]
nombres.sort()
print( nombres)

# Iterar sobre una lista
for elemento in mi_lista:
    print(elemento)  # Imprime cada elemento de la lista
else:
    print("termino de recorrer la lista")

# List comprehension (comprensión de listas)
# Es una forma concisa de crear listas.
nueva_lista = [x**2 for x in range(10)]  # Crea una lista de cuadrados de números del 0 al 9

# Nota: Las listas en Python son muy flexibles y se utilizan ampliamente en la programación
# para almacenar, manipular y procesar colecciones de datos.
