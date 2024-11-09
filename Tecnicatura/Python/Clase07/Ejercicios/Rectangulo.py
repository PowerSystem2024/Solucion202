class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo será calcular area utilizando la formula:
    area = base * altura.

    Pero la base y la altura deben ser ingresadas por el usuario y los objetos deben ser tres.
    """
    
    def __init__(self, altura, base) -> None:
        self.altura = altura
        self.base = base
        
    def calcular_area(self):
        return self.altura * self.base
        
base = int(input("Ingrese el valor de la base: "))
altura = int(input("Ingrese el valor de la altura: "))
rectangulo1 = Rectangulo(base, altura)
print(f"El area del rectangulo 1 es: {rectangulo1.calcular_area()}")

base = int(input("Ingrese el valor de la base: "))
altura = int(input("Ingrese el valor de la altura: "))
rectangulo2 = Rectangulo(base, altura)
print(f"El area del rectangulo 1 es: {rectangulo2.calcular_area()}")

base = int(input("Ingrese el valor de la base: "))
altura = int(input("Ingrese el valor de la altura: "))
rectangulo3 = Rectangulo(base, altura)
print(f"El area del rectangulo 1 es: {rectangulo3.calcular_area()}")