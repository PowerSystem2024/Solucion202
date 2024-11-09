#CLASE 2
#TIPO SET
#no tiene un orden y no permite almacenar elementos duplicados o repetidos.
#este no se puede modificar, pero si se puede agregar o eliminar.
#no mantiene ningun indice esto quiere decir que cuando accedemos al tipo set
#o mandamos a imprimir el orden es completamente aleatorio.
#un elemento de tipo set es un coleccion sin orden y sin indice.
planetas = {"Marte", "Jupiter", "Venus"}
print(len(planetas)) #Usamos la funcion len = length significa largo

# Revisar si un elemento existe dentro de set
print("Marte" in planetas)

# Agregar un elemento
planetas.add("Tierra") # add  es una función
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("Jupiter") # Esta función ante un mal ingreso u inexistencia del elemento da error
print(planetas)
planetas.discard("Tierra")# Esta función no nos presenta ningun tipo de error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o cunjunto
del planetas # Al eliminar nos muestra fun error
#print(planetas)

#DICCIONARIO
# Ejemplo: "Maradona":10 Un diccionario esta compuesto por dos elementos
#UNA LLAVE Y UN VALOR
#dict(key,value)
diccionario = {
    "IDE" : "Integrated Development Environment",
    "POO" : "Programación Orientada a Objetos",
    "SABD" : "Sistema de Administracion de base de Datos"
}
#Verificar la cantidad de elementos del diccionario
print(diccionario)
print(len(diccionario))

#Acceder a un diccionario con la llave(Key)
print(diccionario["IDE"])

#Otra forma de recuperar un elemento
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

#Modificar elementos
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

# Como recorrer los elementos
for termino in diccionario:
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una función
    print(termino) # muesto solo las llaves

for valor in diccionario.values(): # Usamos una función para acceder al valor
    print(valor)

# Comprobar la existencia de algun elemento
print("IDE" in diccionario) # devuelve un booleano

# Agregar un elemento
diccionario["PK"] = "Primary  key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
del diccionario # el diccionario se borro
#print(diccionario)

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 # Concatenamos
print(lista3)

# Extend
lista3.extend([7, 8, 9, 1]) # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice esta el valor ingresado
#print(lista3.index(0)) esto daría error por no ser elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = lista3 * 2
print(lista)

# Métodos de ordenamiento, en python es una función
lista3.sort() # Oderna los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True) # Ordena descendentemente
print(lista3)

# Repaso de tuplas
tupla = (4, "Hola", 6.78, [1, 2, 78], 4, "hola") # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tuplas a lista y de lista a tupla