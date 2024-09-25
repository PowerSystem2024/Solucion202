# ================================================
# Resumen de Tuplas en Python
# ================================================

# Una tupla es una colección ordenada e inmutable de elementos.
# A diferencia de las listas, las tuplas no se pueden modificar (son inmutables).
# Se definen usando paréntesis ().

# Creación de una tupla vacía y una tupla con elementos
tupla_vacia = ()  # Tupla vacía
tupla_nombres = ("nacho", "emma", "afri", "juan", "gime", "marianela")  # Tupla con nombres

# Las tuplas pueden contener diferentes tipos de datos, igual que las listas
tupla_mixta = (1, "Python", 3.14, False)

# ================================================
# Acceso a elementos de una tupla
# ================================================
# Los elementos de una tupla se pueden acceder usando su índice (comenzando en 0).
# La indexación negativa también funciona desde el final de la tupla.

print(tupla_nombres[0])  # Primer elemento: "nacho"
print(tupla_nombres[-1])  # Último elemento: "marianela"

# ================================================
# Inmutabilidad de las tuplas
# ================================================
# A diferencia de las listas, las tuplas no pueden modificarse después de ser creadas.
# No es posible agregar, modificar o eliminar elementos de una tupla.

# Esto generaría un error:
# tupla_nombres[2] = "sofia"  # Error: las tuplas no son modificables

# ================================================
# Métodos comunes de tuplas
# ================================================
# Aunque no se pueden modificar, las tuplas tienen algunos métodos útiles.

# Contar cuántas veces aparece un elemento
print(tupla_nombres.count("juan"))  # 1

# Obtener el índice de un elemento
print(tupla_nombres.index("gime"))  # 4

# ================================================
# Desempaquetado de tuplas
# ================================================
# Puedes "desempaquetar" los elementos de una tupla en variables individuales.

nombre1, nombre2, nombre3, nombre4, nombre5, nombre6 = tupla_nombres
print(nombre1)  # "nacho"
print(nombre6)  # "marianela"

# Si hay más elementos en la tupla de los que estás desempaquetando, puedes usar * para capturar el resto.
nombre1, nombre2, *resto_nombres = tupla_nombres
print(nombre1)  # "nacho"
print(resto_nombres)  # ['emma', 'afri', 'juan', 'gime', 'marianela']

# ================================================
# Iterar sobre una tupla
# ================================================
# Puedes iterar sobre los elementos de una tupla de la misma manera que con una lista.

for nombre in tupla_nombres:
    print(nombre)

# ================================================
# Anidar tuplas
# ================================================
# Puedes crear tuplas dentro de otras tuplas, igual que con listas.

tupla_anidada = (("nacho", "emma"), ("afri", "juan"), ("gime", "marianela"))
print(tupla_anidada[0])  # ("nacho", "emma")
print(tupla_anidada[1][1])  # "juan"

# ================================================
# Convertir entre tuplas y listas
# ================================================
# Aunque las tuplas son inmutables, puedes convertirlas en listas para modificarlas si es necesario.

# Convertir una tupla en una lista
lista_desde_tupla = list(tupla_nombres)
print(lista_desde_tupla)  # ["nacho", "emma", "afri", "juan", "gime", "marianela"]

# Convertir una lista en una tupla
lista_nombres = ["nacho", "emma", "afri", "juan", "gime", "marianela"]
tupla_desde_lista = tuple(lista_nombres)
print(tupla_desde_lista)  # ("nacho", "emma", "afri", "juan", "gime", "marianela")

# ================================================
# Operaciones con tuplas
# ================================================
# Las tuplas soportan algunas operaciones básicas como la concatenación y la repetición.

# Concatenar dos tuplas
tupla_concatenada = tupla_nombres + ("pedro", "sofia")
print(tupla_concatenada)  # ("nacho", "emma", "afri", "juan", "gime", "marianela", "pedro", "sofia")

# Repetir una tupla
tupla_repetida = tupla_nombres * 2
print(tupla_repetida)  # ("nacho", "emma", "afri", "juan", "gime", "marianela", "nacho", "emma", "afri", "juan", "gime", "marianela")

# ================================================
# Tuplas de un solo elemento
# ================================================
# Para definir una tupla con un solo elemento, debes agregar una coma (,) al final del único elemento,
# de lo contrario, Python lo interpretará como un valor individual.

tupla_un_elemento = ("nacho",)  # Esto es una tupla
print(type(tupla_un_elemento))  # <class 'tuple'>

no_es_tupla = ("nacho")  # Esto es una cadena (no una tupla)
print(type(no_es_tupla))  # <class 'str'>

# ================================================
# Comparación con listas
# ================================================
# Las tuplas son más rápidas que las listas y ocupan menos memoria.
# Esto las hace útiles cuando tienes una colección de elementos que no necesitan cambiar.

# Sin embargo, si necesitas modificar los elementos, una lista es la estructura más apropiada.
