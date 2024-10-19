#Vamos a importar las clases creadas
from FiguraGeometrica import FiguraGeometrica
from Color import Color

# Con las clases creadas vamos a armar una nueva clase hija
class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)
        
    def calcular_area(self):
        return self.alto * self.ancho
    
    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)}'
    