"""
Ejercicio 5: Convertidor de temperatura
Realizar dos funciones para convertir de grados Celsius a Farenheit y viceversa.
Investigar las formulas
"""

def convertirFarenheit(grados):
    
    faren = (grados * (9/5)) + 32
    
    return round(faren, 2)


def convertirCelsius(grados):
    
    celsius = (grados - 32) * (5/9)
    
    return round(celsius, 2)

eleccion = int(input("Ingrese si pasa a Celsius o Farenheit (1 o 2): "))
grados = float(input("Ingrese el valor a pasar: "))

if eleccion == 1:
    print(f"Son {convertirCelsius(grados)} grados Celsius")
elif eleccion == 2:
    print(f"Son {convertirFarenheit(grados)} grados Farenheit")
else: 
    print("Ingreso un valor incorrecto")