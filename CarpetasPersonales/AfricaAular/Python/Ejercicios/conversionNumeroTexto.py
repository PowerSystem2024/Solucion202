#EJERCICIO NUMERO A TEXTO
num=int(input("Ingrese un nuemro del 1 al 3: "))
numTexto = " "
if num ==1:
  numTexto = "numero uno"
elif num==2:
  numTexto = "numero dos"
elif num==3:
  numTexto = "numero tres"
print(f"El numero ingresado fue {num}, {numTexto}")
