# Colas con listas
# Estructura de datos de tipo FIFO (first input / first output)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Se retira el cliente: {seRetira}')
print(cola)

"""
------------- Otra forma --------------------

En Python, una cola (queue en inglés) es una estructura de datos que sigue el principio de FIFO (First In, First Out),
es decir, el primer elemento en entrar es el primero en salir. 
Las colas se utilizan para almacenar elementos en el orden en que fueron añadidos, y 
el acceso a los elementos se realiza en ese mismo orden.

Características principales de una cola:

    - Encolar (enqueue): Añadir un elemento al final de la cola.
    - Desencolar (dequeue): Eliminar y devolver el elemento que está al frente de la cola.
    - Frente (front): Consultar el elemento que está al frente de la cola sin eliminarlo.

Aunque se pueden utilizar listas (list) para implementar colas en Python, 
esto no es eficiente porque las operaciones de eliminación (pop(0)) requieren el desplazamiento de 
todos los elementos restantes. 
En su lugar, Python ofrece la clase deque del módulo collections, que es más eficiente para implementar colas.
"""

from collections import deque

# Vamos a crear una cola
cola1 = deque()

cola1.append(1)
cola1.append(2)
cola1.append(3)

print("Cola después de encolar:", cola1)  # Salida: deque([1, 2, 3])

elemento = cola1.popleft()
print("Elemento desencolado:", elemento)  # Salida: 1
print("Cola después de desencolar:", cola1)  # Salida: deque([2, 3])

"""
En este ejemplo:

    - append agrega elementos al final de la cola.
    - popleft elimina y devuelve el primer elemento de la cola.

Usando deque, las operaciones de encolar y desencolar son rápidas y eficientes, y se comportan como una cola FIFO.
"""
