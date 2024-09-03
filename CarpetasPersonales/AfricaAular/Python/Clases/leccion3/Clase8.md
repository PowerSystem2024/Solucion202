# CICLOS
## CICLO WHILE
Es un ciclo que se ejecuta mientras la condicion se cumpla y se detiene cuando la condicion no se cumple
```python
contador = 0
while contador < 5:
    print(f"Contador: {contador}")
    contador += 1  # Incrementa el contador en 1 en cada iteración
```
[Ver Main](/Python/Clases/leccion3/main.py)


## CICLO FOR
Itera una lista de datos con un numero determinado
```python
for i in range(5):  # Itera desde 0 hasta 4
    print(f"Valor de i: {i}")
```
[Ver Main](/Python/Clases/leccion3/main.py)

### BREAK
Palabra reservada que rompe la estructura y corta el ciclo del programa
```python
for i in range(10):
    if i == 5:
        break  # Rompe el ciclo cuando i es igual a 5
    print(f"Valor de i: {i}")
```
[Ver Main](/Python/Clases/leccion3/main.py)

### Continue
Palabra reservada que elude la iteración que le indiquemos
```python
for i in range(10):
    if i % 2 == 0:
        continue  # Salta el resto del código en el ciclo si i es par
    print(f"Valor de i: {i}")  # Esto solo se imprimirá para valores impares de i
```
[Ver Main](/Python/Clases/leccion3/main.py)

