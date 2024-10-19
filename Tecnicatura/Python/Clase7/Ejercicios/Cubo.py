class Cubo:
    """
    Crear la clase Cubo, con los atributos, ancho, alto y profundidad,
    con un metodo, calcular volumen que tendrá la fórmula:
    
    volumen = ancho * altura * profundidad
    
    que el usuario ingrese los valores
    """
    
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad
        
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad
    
ancho = int(input("Ingrese un valor para el ancho del Cubo: "))
altura = int(input("Ingrese un valor para la altura del Cubo: "))
profundidad = int(input("Ingrese un valor para la profundidad del Cubo: "))

cubo1 = Cubo(ancho, altura, profundidad)

print(f"El volumen del Cubo es: {cubo1.calcular_volumen()}")