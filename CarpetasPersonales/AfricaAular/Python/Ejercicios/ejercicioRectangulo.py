# Calcular el area y perimetro de un rectangulo

alto = int(input("Ingrese el alto: "))
ancho = int(input("Ingrese el ancho: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El area del rectangulo es {area}, y el perimetro es {perimetro}")