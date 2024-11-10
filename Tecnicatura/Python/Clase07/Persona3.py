class Persona: 
    
    """
    Esta clase representa a una Persona con un constructor que admite argumentos variables.
    
    Aqui veremos el metodo init dunder. 
    Con argumento variable
    *args: Argumentos variables para tuplas
    **kwargs: Argumentos variables para diccionarios
    """
    
    def __init__(self, nombre, apellido, edad, *args, **kwargs):
        
        #Creamos objetos
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        
    def mostrar_detalle(self): # self es igual a this (en Java)
        
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')
        
# Objeto 1
persona3 = Persona(
    'Rogelio', 'Romero', 22, 
    'Telefono', '2615553333', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, 
    Altura = 1.83, Peso = 105, CFavorito = 'Azul', Auto = 'Citroen', Modelo = 2023)

# Objeto 2
persona4 = Persona(
    'Elvio', 'Caliva', 32, 
    'Telefono', '2645553333', 'Calle Gral. Acha', 158, 'Manzana', 23, 'Casa', 1, 
    Altura = 1.90, Peso = 95, CFavorito = 'Negro', Auto = 'Chevrolet', Modelo = 1998)

persona3.mostrar_detalle()
persona4.mostrar_detalle()