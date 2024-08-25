# Descomenta el bloque de código que desees ejecutar.
# Ejecuta el archivo para ver cómo funciona el código.
# Modifica el código según lo necesites para experimentar y entender mejor los conceptos.

# -------- Clase 6 --------
# -----WHILE-----

# contador=0
# while contador <10:
#   print("Eejcuntando el ciclo", contador)
#   contador += 1
# else:
#   print(f"Fin while")

# -----FOR-----
# cadena = "hello"
# for letra in cadena:
#   print(letra)
# else:
#   print("fin del for")

# -----BREAK-----
# for letra in "Alemania":
#   if letra == "a":
#     print(f"letra encontrada")
#     break

# -----CONTINUE-----
for i in range(6):
  if i % 2 == 0:
    continue
  print(f"valor: {i}")