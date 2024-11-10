class Persona2:
    
    def __init__(self, nombre, apellido, edad): #Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        
    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguiente: {self._nombre} {self._apellido} {self._edad}")
        
    #*Metodo Getter: para poder acceder al metodo como si fuera un atributo y de manera indirecta vamos a necesitar lo que llamamos un decorador
    @property # Decorador
    def nombre(self):
        return self._nombre
    
    @property
    def apellido(self):
        return self._apellido
    
    @property
    def edad(self):
        return self._edad
    
    @nombre.setter
    def nombre(self, nombre): #Metodo setter
        self._nombre = nombre
        
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
        
    @edad.setter
    def edad(self, edad):
        self._edad = edad
        
#*Creacion de objetos
#Objeto 1
persona1 = Persona2('Juan', 'Salinas', 40)
print(" ")
print(" OBJETO 1 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 1: {persona1.nombre}")
print(f"Apellido objeto 1: {persona1.apellido}")
print(f"Edad objeto 1: {persona1.edad}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
persona1.nombre = 'Rodrigo'
persona1.apellido = 'Sanchez'
persona1.edad = 23
print(f"Nombre objeto 1: {persona1.nombre}")
print(f"Apellido objeto 1: {persona1.apellido}")
print(f"Edad objeto 1: {persona1.edad}")
print(" ")
print(persona1.mostrar_detalles())
print(" ")

#Objeto 2
persona2 = Persona2('Carla', 'Cisneros', 23)
print(" ")
print(" OBJETO 2 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 2: {persona2.nombre}")
print(f"Apellido objeto 2: {persona2.apellido}")
print(f"Edad objeto 2: {persona2.edad}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
persona2.nombre = 'Carlos'
persona2.apellido = 'Purriel'
persona2.edad = 32
print(f"Nombre objeto 2: {persona2.nombre}")
print(f"Apellido objeto 2: {persona2.apellido}")
print(f"Edad objeto 2: {persona2.edad}")
print(" ")
print(persona2.mostrar_detalles())
print(" ")

#Objeto 3
persona3 = Persona2('Nicolas', 'Muñoz', 30)
print(" ")
print(" OBJETO 3 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 3: {persona3.nombre}")
print(f"Apellido objeto 3: {persona3.apellido}")
print(f"Edad objeto 3: {persona3.edad}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
persona3.nombre = 'Facundo'
persona3.apellido = 'Mercado'
persona3.edad = 56
print(f"Nombre objeto 3: {persona3.nombre}")
print(f"Apellido objeto 3: {persona3.apellido}")
print(f"Edad objeto 3: {persona3.edad}")
print(" ")
print(persona3.mostrar_detalles())
print(" ")