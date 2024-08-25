# Tuplas
Son inmutables, ordenadas y heterogéneas
Su sintaxis es con paréntesis
Aunque sea un elemento DEBE tener coma, de lo contrario sería un string 

```python
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)
```

* Longitud
```python
print(len(cocina))   #3
```
* Acceder a un elemento
```python
print(cocina[2])  # tenedor
print(cocina[-1]) # tenedor
```
* Acceder a un rango
```python
print(cocina[0:1])  #('cuchara',)
```
* Pasar de tupla a lista:
  -No es una buena práctica pero se puede hacer, lo ideal es que si vas a usar valores mutables usar listas directamente
```python
cocinaLista = list(cocina)  #convertimos una lista con los valores de la tupla
cocinaLista[0] = 'plato' #agregamos el valor nuevo en un indice que ya se encuentre en la tupla
cocina = tuple(cocinaLista) #convertimos la nueva lista a tupla
print(cocina) # ('plato', 'tenedor', 'cuchillo')
```
---
[Ejercicio Tuplas](/Ejercicios/ejerciciosLeccion4/ejercicioTuplasListas.py)