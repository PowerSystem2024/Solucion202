from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')

print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

# *MOR = Method Resolution Order (forma de saber de donde provinenen las clases padres)
print(Cuadrado.mro()) # Nos muestra el orden en que son llamadas las clases
#[<class 'Cuadrado.Cuadrado'>, <class 'FiguraGeometrica.FiguraGeometrica'>, <class 'Color.Color'>, <class 'object'>]

rectangulo1 = Rectangulo(6, 8,'Rojo')
cuadrado2 = Cuadrado(7, 'Verde')

print(f'Rectangulo: {rectangulo1}')
print(f'Cuadrado: {cuadrado2}')
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')