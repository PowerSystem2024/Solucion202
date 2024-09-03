# TIPOS DE DATOS EN PYTHON
* Numericos
  -Integer

      a = 3
  -Complex Number

      c = 2 + 3j
  -Float

      b = 3.5
* Dictionary
    
      d= {"key1": "value1", "key2": "value2"}

* Boolean
  
      e = True
      e = False
* Set
  
      f = {1, 2, 3, "cuatro", 5.0}

* SequenceType
  -String

      g = "Hola mundo"

  -List

      h = [1, 2, 3, "cuatro", 5.0]

  -Tuple

      i = (1, 2, 3, "cuatro", 5.0)

   [Ejemplos Ver Main Sección Clase 3](/Python/Clases/leccion1/main.py)


## MANEJO DE STRINGS
Se realiza con el operador  **+**

### Concatenaciones
- Concatenación de cadenas
- Concatenación variable + cadena
- Concatenación variables

```python
            miGrupoFavorito = "The letter"
            print("Mi grupo favorito es: " + miGrupoFavorito + ", The best")  # Concatenación
            caracteristica = "the best rock"
            print('Mi grupo favorito es:', miGrupoFavorito, caracteristica)
```

[Ejercicio mi grupo favorito Ver en Main](/Python/Clases/leccion1/main.py)


### Transformación de String a Int
```python   
    numero1 = "2"
    numero2 = "6"
    print(int(numero1) + int(numero2))
```
[Ver en Main ](/Python/Clases/leccion1/main.py)

## BOOLEANOS
Nos permite saber si o no, 1 - 0, verdadero - falso
No pueden cumplirse ambas, o es verdadero o es falso, existe o no existe
```python      
      soyBooleano = 7 > 2
      print(soyBooleano)
      if soyBooleano:
      print("El resultado es verdadero")
      else: print("El resultado es falso")
```
[Ver en Main](/Python/Clases/leccion1/main.py)


## INPUTS - Entradas de usuario

  -Funcion input: pedimos al usuario que ingrese un valor y procesamos el resultado
  -Regresa un dato de tipo *string*
```python
      resultado = input()
      print(resultado)
```
[Ver en Main](/Python/Clases/leccion1/main.py)  

### Conversión de entrada de datos
```python
    numero1 = input("Escribe el primer numero ")
    numero2 = input("Escribe el segundo numero ")
    resultado = int(numero1) + int(numero2)
    print("El resultado de la suma es", resultado)
```
[Ver en Main](/Python/Clases/leccion1/main.py) 

---

#### Ejercicios
###### [1 "Como estuvo tu dia"](/Python/Ejercicios/ejercicio1.py) 
###### [2 Libro](/Python/Ejercicios/ejercicio2.py) 