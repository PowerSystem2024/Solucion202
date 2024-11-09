"""
* metodo set = colocar, establecer, colocar. Nos permite modificar los atributos de la clase
* metodo get = obtener, recuperar. Nos permite obtener los atributos de la clase
"""

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
        print('Utilizamos el metodo get')
        return self._nombre
    
    @property
    def apellido(self):
        print('Utilizamos el metodo get')
        return self._apellido
    
    @property
    def edad(self):
        print('Utilizamos el metodo get')
        return self._edad
    
    @nombre.setter
    def nombre(self, nombre): #Metodo setter
        print('Estamos utilizando el metodo set')
        self._nombre = nombre
        
    @apellido.setter
    def apellido(self, apellido):
        print('Estamos utilizando el metodo set')
        self._apellido = apellido
        
    @edad.setter
    def edad(self, edad):
        print('Estamos utilizando el metodo set')
        self._edad = edad
        
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == '__main__':        
    # Ahora vamos a mostrar 
    persona1 = Persona2('Juan', 'Orellana', 40)
    print(persona1.nombre) # Aqui llamamos al metodo getter

    persona1.nombre = 'Ariel Salinas' # Aqui utilizamos el metodo set
    print(persona1.nombre)

    print(persona1.mostrar_detalles())

    persona1.edad = 41 #Si no estuviera el metodo setter de este atributo no se podria modificar Quedaria como un atrinuto read-only por lo que no tiene el metodo set
    print(persona1.edad)

    print(__name__)