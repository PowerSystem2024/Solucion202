# Tuplas en Python
# ----------------

# Una tupla es una colección ordenada e **inmutable** de elementos en Python.
# A diferencia de las listas, las tuplas no pueden ser modificadas después de su creación.
# Se definen utilizando paréntesis () y los elementos están separados por comas.

# Creación de una tupla vacía
mi_tupla_vacia = ()  # Una tupla vacía, sin elementos

# Creación de una tupla con elementos
mi_tupla = (1, 2, 3, 4, 5)  # Tupla de enteros
otra_tupla = ("a", "b", "c")  # Tupla de cadenas de texto (strings)
mixta_tupla = (1, "dos", 3.0, True)  # Tupla con diferentes tipos de datos

# Las tuplas también pueden contener cualquier tipo de datos, incluyendo otras tuplas (tuplas anidadas)
tupla_anidada = (1, (2, 3), (4, 5, 6))

# Acceso a los elementos de una tupla
# Los elementos en una tupla se pueden acceder usando índices, igual que con las listas.
# Los índices comienzan en 0 para el primer elemento.
primer_elemento = mi_tupla[0]  # Esto retorna 1, el primer elemento
ultimo_elemento = mi_tupla[-1]  # Esto retorna 5, el último elemento

# Acceso a un rango de la tupla
mi_tupla_de_rango = mi_tupla[0:2]  # Esto devolvería (1, 2), el "2" es excluyente
mi_tupla_de_rango1 = mi_tupla[:3]  # Esto devolvería (1, 2, 3)
mi_tupla_de_rango2 = mi_tupla[1:]  # Esto devolvería (2, 3, 4, 5)
print(mi_tupla_de_rango, mi_tupla_de_rango1, mi_tupla_de_rango2)

# Importante: A diferencia de las listas, las tuplas son inmutables, lo que significa
# que no puedes modificar, agregar ni eliminar elementos de una tupla después de su creación.

# Intentar modificar un elemento de la tupla resultará en un error
# mi_tupla[2] = 10  # Esto lanzará un TypeError

# Puedes, sin embargo, crear una nueva tupla combinando tuplas existentes
nueva_tupla = mi_tupla + otra_tupla  # Esto crea una nueva tupla combinando ambas

# Para eliminar completamente una tupla, puedes usar 'del'
del mi_tupla_vacia  # Esto elimina la tupla mi_tupla_vacia de la memoria

# Para saber cuántos elementos tiene una tupla, se usa el método len
longitud = len(mi_tupla)  # Retorna la longitud de la tupla

# Iterar sobre una tupla
for elemento in mi_tupla:
    print(elemento)  # Imprime cada elemento de la tupla
else:
    print("termino de recorrer la tupla")

# Las tuplas también pueden ser utilizadas como claves en diccionarios
# debido a su inmutabilidad, algo que no es posible con las listas.
mi_diccionario = {("nombre", "apellido"): "Carlos Pérez"}

# Conversión de una lista a una tupla
mi_lista = [1, 2, 3]
mi_tupla_convertida = tuple(mi_lista)  # Convierte la lista en una tupla

# Nota: Las tuplas son útiles cuando necesitas una colección ordenada de elementos
# que no cambiarán a lo largo del tiempo. Son más eficientes en términos de memoria
# y rendimiento comparadas con las listas cuando la inmutabilidad es deseada.
