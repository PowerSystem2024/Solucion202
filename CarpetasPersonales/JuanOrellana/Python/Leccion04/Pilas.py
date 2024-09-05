"""
Una pila (stack en inglés) es una estructura de datos que sigue el principio de LIFO (Last In, First Out), 
es decir, el último elemento en entrar es el primero en salir. 
Las pilas se utilizan para almacenar y gestionar datos de manera que el acceso a los elementos 
se realiza en un orden inverso al de su inserción.
Características principales de una pila:

    - Apilar (push): Añadir un elemento a la parte superior de la pila.
    - Desapilar (pop): Eliminar y devolver el elemento que está en la parte superior de la pila.
    - Cima (top/peek): Consultar el elemento que está en la parte superior de la pila sin eliminarlo.
"""
# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop() # Vamos a eliminar el ultimo elemento de la pila y lo guarda en la variable
print(f"El elemento borrado es el {elementoBorrado}")
print(f"La pila ahora queda as: {pila}")

"""
En este ejemplo, append agrega elementos al final de la lista, que actúa como la parte superior de la pila, 
y pop elimina el último elemento añadido, siguiendo el comportamiento de una pila LIFO.
"""
