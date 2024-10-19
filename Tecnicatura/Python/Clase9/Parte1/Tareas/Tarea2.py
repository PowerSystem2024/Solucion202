"""
Definir una clase padre llamada Vehiculo y dos clases hijas llamadas Auto y Bicicleta. Las cuales heredan de la clase Vehiculo. La clase padre debe tener los siguientes atributos y metodos: 

Vehiculo
- Atributos(color, ruedas)
- Metodos(__init__(color, ruedas) y __str__)

Auto(clase hija de Vehiculo)
- Atributos(velocidad(hm/hr))
- Metodos(__init__(color, ruedas, velocidad) y __str__())

Bicicleta(clase hija de Vehiculo)
- Atributos(tipo(urbana, montaña, etc.))
- Metodos(__init__(color, ruedas, tipo) y __str__())
"""

class Vehiculo:
    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas
        
    def __str__(self) -> str:
        return f'Vehiculo: [Color: {self._color}. Cantidad de ruedas: {self._ruedas}]'
    
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velocidad = velocidad #Kilometros por hora
        
    def __str__(self) -> str:
        return f'Auto: [Velocidad: {self._velocidad} km/hr. {super().__str__()}]'
    
class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo 
        
    def __str__(self):
        return f'Bicicleta: [Tipo: {self._tipo}. {super().__str__()}]'
    
bicicleta1 = Bicicleta('Rojo', 2, 'Montaña')
auto1 = Auto('Azul', 4, 200)

print(bicicleta1)
print("")
print(auto1)