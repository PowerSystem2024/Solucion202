from FiguraGeometrica import FiguraGeometrica
from Color import Color

# Con las clases creadas vamos a armar una nueva clase hija
class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)
        
    def calcular_area(self):
        return self.alto * self.ancho
    
    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)}'