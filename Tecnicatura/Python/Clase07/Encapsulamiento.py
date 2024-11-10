class Persona: 
    
    """
    La clase Persona modela la estructura básica de una persona, con datos como
    nombre, apellido, DNI, y edad. Adicionalmente, se pueden incluir otros datos
    a través de argumentos variables (*args y **kwargs).

    Atributos:
    ----------
    - nombre (str): El nombre de la persona.
    - apellido (str): El apellido de la persona.
    - _dni (int): Documento Nacional de Identidad, atributo encapsulado para 
      evitar acceso directo.
    - edad (int): La edad de la persona.
    - args (tuple): Argumentos adicionales que pueden contener datos opcionales.
    - kwargs (dict): Diccionario que almacena argumentos adicionales con clave-valor.
    
    Encapsulamiento:
    ----------------
    - El atributo _dni está encapsulado con el guion bajo (_) como una convención
      de Python que sugiere que no debe ser accedido directamente fuera de la clase.
    - Aunque no es estrictamente privado (Python no tiene atributos verdaderamente privados),
      es una buena práctica respetar esta convención.

    Métodos:
    --------
    - mostrar_detalle: Muestra los detalles de la persona, incluyendo nombre, apellido,
      DNI (a pesar de estar encapsulado se permite su acceso dentro de la clase), edad,
      dirección y otros datos opcionales pasados como *args y **kwargs.
    """
    
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        
        #Creamos objetos
        self.__nombre = nombre # El atributo esta totalmente encapsulado, no se puede modificar
        self.apellido = apellido
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        
    def mostrar_detalle(self): # self es igual a this (en Java)
        
        print(f'La clase Persona tiene los siguientes datos: {self.__nombre} {self.apellido} {self._dni} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}')
        
persona3 = Persona(
    'Rogelio', 'Romero', 31255555, 22, 
    'Telefono', '2615553333', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, 
    Altura = 1.83, Peso = 105, CFavorito = 'Azul', Auto = 'Citroen', Modelo = 2023)

persona3.mostrar_detalle()

# No se debe acceder al atributo encapsulado directamente, ya que viola las convenciones de encapsulamiento.
# Sin embargo, Python lo permite, pero esto indica que no estamos respetando las convenciones:
print(persona3._dni)  # Mala práctica