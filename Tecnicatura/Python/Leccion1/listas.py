# ================================================
# Listas en Python
print("..:::Listas en Python:::..")
# ================================================

# Una lista es una colección ordenada y mutable de elementos. 
# Puede contener elementos de diferentes tipos (números, cadenas, otras listas, etc.).
# Las listas se definen usando corchetes [].

# Creación de una lista vacía y lista con elementos
lista_vacia = []  # lista vacía
lista_nombres = ["nacho", "emma", "afri", "juan", "gime", "marianela"]  # lista con nombres

# Las listas pueden contener diferentes tipos de datos
lista_mixta = [1, "Python", 3.14, True]

# ================================================
# Acceso a elementos de una lista
# ================================================
# Los elementos de una lista se pueden acceder usando su índice (comenzando en 0).
# La indexación negativa comienza desde el final de la lista.

print(" print [0] : ",lista_nombres[0])  # Primer elemento: "nacho"
print(" print [-1] : ",lista_nombres[-1])  # Último elemento: "marianela"

# Tambien se puede acceder a un intervalo de elementos por ejemplo [0:2] siendo el "cero" inclusivo y el "dos" excluyente de la lista.
print(" print [0:2] : ",lista_nombres[0:2]) #daria por resultado ["nacho", "emma"] correcpondiendo a los indices 0 y 1

#podemos tambien indicarle desdel el inicio de la lista hasta un número indicado dejando vacia la primer parte
print(" print [:2] : ",lista_nombres[:2]) #daria por resultado ["nacho", "emma"]

#a su vez podemos indicarle que recorra desde un indice dado hasta el final
print(" print [-2:] : ", lista_nombres[-2:])


# ================================================
# Modificación de elementos
print("Modificación de elementos")
# ================================================
# Las listas son mutables, lo que significa que podemos cambiar sus elementos después de crearlas.

lista_nombres[2] = "sofia"  # Cambiamos el tercer elemento (índice 2) de "afri" a "sofia"
print(lista_nombres)  # ["nacho", "emma", "sofia", "juan", "gime", "marianela"]


# ================================================
# Recorrer una lista
# ================================================
# Puedes iterar sobre una lista usando un bucle `for`.

for nombre in lista_nombres:
    print(nombre)
else:
    print("termino el bucle..")


# ================================================
# Métodos comunes de listas
# ================================================
# Las listas tienen varios métodos útiles para manipularlas.

# Agregar elementos a la lista
lista_nombres.append("marcos")  # Agrega "marcos" al final
print(lista_nombres)  # ["nacho", "emma", "sofia", "juan", "gime", "marianela", "marcos"]

# Insertar en una posición específica
lista_nombres.insert(1, "flor")  # Inserta "flor" en el índice 1
print(lista_nombres)  # ["nacho", "flor", "emma", "sofia", "juan", "gime", "marianela", "marcos"]

# Eliminar un elemento
lista_nombres.remove("juan")  # Elimina "juan" de la lista
print(lista_nombres)  # ["nacho", "flor", "emma", "sofia", "gime", "marianela", "marcos"]

# Eliminar el último elemento (o un índice específico)
ultimo_elemento = lista_nombres.pop()  # Elimina y retorna el último elemento
print(ultimo_elemento)  # "marcos"
print(lista_nombres)  # ["nacho", "flor", "emma", "sofia", "gime", "marianela"]

# Obtener la longitud de la lista
print(len(lista_nombres))  # 6



# ================================================
# Listas por comprensión (list comprehensions)
# ================================================
# Una forma compacta de generar listas basadas en una expresión.

# Crear una lista con la longitud de cada nombre
longitud_nombres = [len(nombre) for nombre in lista_nombres]
print(longitud_nombres)  # [5, 4, 4, 5, 4, 9]

# Crear una lista solo con nombres que tengan más de 4 letras
nombres_largos = [nombre for nombre in lista_nombres if len(nombre) > 4]
print(nombres_largos)  # ["nacho", "sofia", "marianela"]

# ================================================
# Copiar una lista
# ================================================
# Las listas son objetos mutables, por lo que copiar una lista requiere especial cuidado.

# Copia incorrecta: ambas variables referencian la misma lista.
lista_original = lista_nombres
lista_copia = lista_original  # Ambas listas son la misma en memoria.
lista_copia.append("maria")
print(lista_original)  # ["nacho", "flor", "emma", "sofia", "gime", "marianela", "maria"]

# Copia correcta: usamos `copy()` o slicing para crear una copia independiente.
lista_copia_independiente = lista_nombres.copy()
lista_copia_independiente.append("pedro")
print(lista_nombres)  # ["nacho", "flor", "emma", "sofia", "gime", "marianela", "maria"]
print(lista_copia_independiente)  # ["nacho", "flor", "emma", "sofia", "gime", "marianela", "maria", "pedro"]

# ================================================
# Anidar listas
# ================================================
# Puedes crear listas dentro de otras listas, formando listas anidadas.

lista_anidada = [["nacho", "emma"], ["afri", "juan"], ["gime", "marianela"]]
print(lista_anidada[0])  # ["nacho", "emma"]
print(lista_anidada[1][1])  # "juan"

# ================================================
# Convertir otros tipos de datos a listas
# ================================================
# Puedes convertir otros tipos de colecciones, como tuplas o cadenas, en listas.

tupla = ("emma", "sofia", "juan")
lista_desde_tupla = list(tupla)
print(lista_desde_tupla)  # ["emma", "sofia", "juan"]

cadena = "marianela"
lista_desde_cadena = list(cadena)
print(lista_desde_cadena)  # ['m', 'a', 'r', 'i', 'a', 'n', 'e', 'l', 'a']

# ================================================
# Borrar una lista o sus elementos
# ================================================
# Puedes eliminar el contenido de una lista o borrar la lista completamente.

lista_a_borrar = ["nacho", "emma", "afri"]
lista_a_borrar.clear()  # Elimina todos los elementos de la lista
print(lista_a_borrar)  # []

del lista_a_borrar  # Elimina completamente la variable lista_a_borrar
