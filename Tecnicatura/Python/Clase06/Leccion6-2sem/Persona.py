class Persona:  # Creamos una clase
    def __init__(self, nombre, apellido, dni,  edad, *args, **Kwargs):  # Constructor de la clase
        self.nombre = nombre
        self._apellido = apellido # Este atributo esta encapsulado de una manera sugerida
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args # Tupla
        self.wkargs = Kwargs # Diccionario

    def mostrar_detalle(self): # self es igual a this
      print(f" La clase Persona tiene los siguientes datos: {self.nombre} {self._apellido} {self._dni} {self.edad}, la dirección es: {self.args}, los datos importantes son: {self.wkargs}")



# Creamos una instancia de Persona con valores predeterminados
persona1 = Persona("Juan", "Zalazar", 40454542,22) # Argumentos
# Imprimimos los atributos de la instancia
print(persona1.nombre)  # Imprime "Juan"
print(persona1._apellido)  # Imprime "Zalazar"
print(persona1.edad)  # Imprime 22

# Creamos otra instancia de Persona con valores diferentes
persona2 = Persona("Ana", "Gómez", 38943235, 30)
# Imprimimos los atributos de la segunda instancia
print(persona2.nombre)  # Imprime "Ana"
print(persona2._apellido)  # Imprime "Gómez"
print(persona2.edad)  # Imprime 30

persona3 = Persona("Osvaldo", "Giordanini", 27432876, 45)
print(f"El objeto3 de la clase persona:{persona3.nombre} {persona3._apellido} Su edad es: {persona3.edad}")

# TAREA
persona1 = Persona("Juan", "Zalazar", 40334543, 22)
print(f"El objeto1 de la clase persona:{persona1.nombre} {persona1._apellido} Su edad es: {persona1.edad}")

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40
print(f"El objeto1 modificado de la clase persona:{persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}")

# Los atributos son : caracteristicas
# Los métodos (= que una función, pero al metodo se lo asocia con una clase y la función no es propia de si misma) son: el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle unareferencia para el self o dará error

persona1.telefono = "3343354564656"
print(f"Este es el telefono de: {persona1.nombre} {persona1.telefono}") # Hemos creado un atributo de un objeto

# print(persona2.telefono) el objeto perosna2 no tiene ese atributo, da error

persona3 = Persona("Rogelio", "R0omero", 35789456,22, "Telefono", "256787878", "Calle Lopez", 823, "Manzana", 77, "Casa", 18, Altura= 1.83, peso=105, CFavorito="Azul", Auto="Citroen", Modelo=2021 )
persona3.mostrar_detalle()
# print(persona3._dni) esto no se debe utilizar en python(esta encapsulado), esto dice que lo desconocemos python
# persona3.__nombre # Esta totalmente encapsulado
