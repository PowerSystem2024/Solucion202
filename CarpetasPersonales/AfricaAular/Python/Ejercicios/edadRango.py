#EJERCICIO EDAD ENTRE 20 Y 30 AÑOS
edad= int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
if veinte or treinta:{
print("Esta dentro del rango")
}
else:{
  print("Esta fuera de rango")
}