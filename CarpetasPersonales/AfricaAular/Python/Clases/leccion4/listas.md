# LISTAS

- Conjunto de elementos
- A cada elemento se le asigna un indice **[i]**
- La primera posición es 0
- Su nomenclatura es con corchetes [ ] y cada elemento se separa con comas
- Teniendo en cuenta el índice podemos acceder a ese , elemento
- El índice negativo nos permite acceder al último elemento, partiendo desde el final de la lista
- La lista es mutable, es decir, podemos modificar sus elementos
- Puede almacenar distintos tipos de datos

```python
nombres= ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)     #['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres[0])  #Naty
print(nombres[2])  #Lily
print(nombres[-1]) #Ariel
```
##### Mostrar un rango
```python
print(nombres[1:3])  #['Osvaldo','Lily']-Muestra desde el indice ingresado hasta el pedido, sin incluirlo
```
##### Ir del inicio de la lista al indice x sin incluirlo
```python
print(nombres[ :3]) #['Naty', 'Osvaldo', 'Lily']
```
##### Ir desde el inidice indicado hasta el final
```python
print(nombres[2: ]) #['Lily', 'Ariel']
```
##### Modificar un valor
```python
nombres[2] = "Liliana"  #['Naty', 'Osvaldo', 'Liliana', 'Ariel']
nombres[0] = "Natalia"  #['Natalia', 'Osvaldo', 'Liliana', 'Ariel']
print(nombres)
```
##### Iterar una lista
```python
for nombre in nombres:
  print(nombre)
else:
  print('Se acabaron los elemontos de la lista')
#Natalia
#Osvaldo
#Liliana
#Ariel
#Se acabaron los elemontos de la lista
```

#### Función *len*
Pasamos como parámetro la lista y nos devuelve la cantidad de elementos que contiene
```python
print(len(nombres)) #4
```
#### Función *append*
Ingresa el elemento inicado al final de la lista (cola)
```python
nombres.append('Marcelo')
print(nombres)  #['Naty', 'Osvaldo', 'Lily', 'Ariel', 'Marcelo']
```

#### Función *insert*
Debe pasarse el indice con un numero entero y luego el elemento a insertar:
 `lista.insert(1, "elemento")`

```python
nombres.insert(1, "Debora")
print(nombres) #['Naty', 'Debora','Osvaldo', 'Lily', 'Ariel']
```

#### Función *remove*
- elimina el primer elemento de una lista que coincide con el valor especificado (solo la primera coincidencia)
- modifica la lista original y no devuelve ningún valor

```python
nombres.remove("Debora")
print(nombres) #['Naty','Osvaldo', 'Lily', 'Ariel']
```
#### Función *pop*
Elimina el útlimo elemento de la lista, independientemente del orden en que se ingreso el valor
```python
nombres.pop()
print(nombres) #['Naty','Osvaldo', 'Lily'], 
```

#### Instrucción *del*
Es una palabra clave que elimina objetos, elementos, listas, etc
Para eliminar in indice especifico:
```python
del nombres[2]
print(nombres)    #['Naty', 'Osvaldo', 'Ariel']
```


#### función *clear* 
Elimina todos los elementos de la lista, dejándola vacía
```python
nombres.clear()
print(nombres)   #[] 
```
[Ver en main](/Clases/leccion4/main.py)

---
### EJERCICIO
[Ejercicio Rangos](/Ejercicios/ejerciciosLeccion4/ejercicioRangos.py)