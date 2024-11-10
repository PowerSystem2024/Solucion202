"""
Lo que vamos a hacer es ordenar y ponerle condiciones a la clase "Figura Geometrica"
y vamos a separar el codigo lo mas ordenado posible en el testeo.
"""
from FiguraGeometrica import FiguraGeometrica
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print("Creacion del objeto clase Cuadrado".center(50, "-"))

cuadrado1 = Cuadrado(5, 'Azul')
"""
Para que sean atributos de solo lectura hay que quitar los metodos setter
"""
cuadrado1.alto = 9 # Reasignamos el valor del alto
cuadrado1.ancho = 9 # Reasignamos el valor del ancho
cuadrado2 = Cuadrado(7, 'Verde')

print(f'Cuadrado1: {cuadrado1}')
print(f'Calculo del area del cuadrado1: {cuadrado1.calcular_area()}')
print(f'Cuadrado2: {cuadrado2}')
print(f'Calculo del area del cuadrado2: {cuadrado2.calcular_area()}')

print("Creacion del objeto clase Rectangulo".center(50, "-"))
rectangulo1 = Rectangulo(4, 3,'Rojo')
rectangulo1.ancho = 5 # Reasignamos su valor
rectangulo1.alto = 8

print(f'Rectangulo: {rectangulo1}')
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')

# figura1 = FiguraGeometrica() # No se puede instanciar, es abstracta
print(Cuadrado.mro()) # Aqui se puede ver a la nueva clase padre ABC
