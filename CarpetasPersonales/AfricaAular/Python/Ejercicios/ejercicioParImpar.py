#Numero par o impar

numero = int(input("Ingrese un numero: "))
parImpar = numero % 2
if parImpar == 0:{
  print(f"El numero {numero} es par")
}
else:{
  print(f"El numero {numero} es impar")
}