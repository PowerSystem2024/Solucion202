# Variables y su ubicación en memoria en Python

# En Python, las variables son referencias a objetos en la memoria.
# Esto significa que cuando creas una variable, Python asigna un objeto en la memoria y la variable apunta a ese objeto.

# Ejemplo:
a = 10
b = a

# Aquí, 'a' es una referencia a un objeto entero con valor 10 en la memoria.
# Cuando asignamos 'b = a', 'b' también referencia al mismo objeto en la memoria.

print(a)  # Imprime: 10
print(b)  # Imprime: 10

# Podemos usar la función id() para obtener la dirección de memoria de un objeto.
print(id(a))  # Imprime la dirección de memoria de 'a'
print(id(b))  # Imprime la misma dirección de memoria que 'a'

# Si cambiamos el valor de 'b', Python crea un nuevo objeto en la memoria para 'b'.
b = 20
print(a)  # Imprime: 10
print(b)  # Imprime: 20

print(id(a))  # La dirección de memoria de 'a' sigue siendo la misma
print(id(b))  # La dirección de memoria de 'b' es ahora diferente

# Tipos de datos inmutables y mutables:
# En Python, los tipos de datos se dividen en inmutables y mutables.

# Los tipos inmutables no pueden cambiar su valor una vez creados. Ejemplos: int, float, str, tuple.
# Los tipos mutables pueden cambiar su valor después de la creación. Ejemplos: list, dict, set.

# Ejemplo con tipos inmutables (int):
x = 5
print(id(x))  # Dirección de memoria de 'x'

x = 6  # 'x' ahora referencia a un nuevo objeto con valor 6
print(id(x))  # Dirección de memoria de 'x' ha cambiado

# Ejemplo con tipos mutables (list):
lista = [1, 2, 3]
print(id(lista))  # Dirección de memoria de 'lista'

lista.append(4)  # Modificamos la lista
print(id(lista))  # La dirección de memoria de 'lista' no cambia

# Paso de argumentos a funciones:
# En Python, los argumentos de las funciones se pasan por referencia, lo que significa que la función recibe una referencia al objeto.

def modificar_lista(l):
    l.append(4)
    print("Dentro de la función:", l)

mi_lista = [1, 2, 3]
modificar_lista(mi_lista)

print("Fuera de la función:", mi_lista)
# La lista original se modifica porque 'mi_lista' y 'l' referencia al mismo objeto en memoria

# Sin embargo, para tipos inmutables, no se puede modificar el objeto original.
def modificar_valor(x):
    x = 20
    print("Dentro de la función:", x)

y = 10
modificar_valor(y)

print("Fuera de la función:", y)
# 'y' no cambia porque los enteros son inmutables y la asignación dentro de la función crea un nuevo objeto

# Resumen de conceptos:
# 1. Las variables en Python son referencias a objetos en la memoria.
# 2. Los tipos de datos inmutables no pueden cambiar su valor, mientras que los mutables sí.
# 3. La función id() devuelve la dirección de memoria de un objeto.
# 4. Los argumentos de las funciones se pasan por referencia, lo que puede afectar a los objetos mutables.

