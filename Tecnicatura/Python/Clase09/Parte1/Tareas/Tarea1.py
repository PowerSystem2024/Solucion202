"""
* Encapsular los atributos y agregar los metodos getter y setter
* Crear otro objeto, pasar los datos para nombre, edad y sueldo
* Mostrar estos datos, luego modificar y mostrar nuevamente
"""

class Persona:
    
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad
        
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self, edad):
        self._edad = edad
        
class Empleado(Persona):
    
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo
    
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo
        
#Objeto 1
empleado1 = Empleado('Juan', 32, 75000)
print(" ")
print(" OBJETO 1 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 1: {empleado1.nombre}")
print(f"Edad objeto 1: {empleado1.edad}")
print(f"Sueldo objeto 1: {empleado1.sueldo}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
empleado1.nombre = 'Facundo'
empleado1.edad = 56
empleado1.sueldo = 656444
print(f"Nombre objeto 1: {empleado1.nombre}")
print(f"Edad objeto 1: {empleado1.edad}")
print(f"Sueldo objeto 1: {empleado1.sueldo}")
print(" ")

#Objeto 2
empleado2 = Empleado('Facundo', 32, 900000)
print(" ")
print(" OBJETO 2 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 2: {empleado2.nombre}")
print(f"Edad objeto 2: {empleado2.edad}")
print(f"Sueldo objeto 2: {empleado2.sueldo}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
empleado2.nombre = 'Sergio'
empleado2.edad = 43
empleado2.sueldo = 920000
print(f"Nombre objeto 2: {empleado2.nombre}")
print(f"Edad objeto 2: {empleado2.edad}")
print(f"Sueldo objeto 2: {empleado2.sueldo}")
print(" ")

#Objeto 3
empleado3 = Empleado('Anibal', 43, 1957835)
print(" ")
print(" OBJETO 3 ".center(60, '-'))
print(" Accedemos a los atributos con el metodo getter ".center(60, '-'))
print(" ")
print(f"Nombre objeto 3: {empleado3.nombre}")
print(f"Edad objeto 3: {empleado3.edad}")
print(f"Sueldo objeto 3: {empleado3.sueldo}")
print(" ")
print(" Modificamos con el metodo setter ".center(60, '-'))
print(" ")
empleado3.nombre = 'Diego'
empleado3.edad = 39
empleado3.sueldo = 560432
print(f"Nombre objeto 3: {empleado3.nombre}")
print(f"Edad objeto 3: {empleado3.edad}")
print(f"Sueldo objeto 3: {empleado3.sueldo}")
print(" ")