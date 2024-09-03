'''
Valor dentro de un rango
1. Pedimos al usuario un valor numerico
2. Verificar si el valor ingresadose encuentar entre el rango de 0 a 5
3. La formula es <num> >= 0 and <num> <=5
'''
valor = int(input("Ingrese un valor: "))
if valor >= 0 and valor <=5:{
  print(f"El valor {valor}  está dentro del rango")
}
else: {
  print(f"El valor {valor}  no está dentro del rango")
}
