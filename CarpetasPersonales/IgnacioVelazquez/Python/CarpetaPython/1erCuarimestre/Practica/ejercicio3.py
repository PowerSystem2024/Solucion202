#Leer 10 números e imprimir cuantos son positivos, ciantos negativos y cuantos neutros

print("Programa Iniciado")

conteo_positivos= 0
conteo_negativos = 0
conteo_neutros=0

for i in range(1,11):
    numero = int(input(f"Ingrese el {i}° numero: "))
    if numero == 0:
        conteo_neutros += 1
    elif numero < 0:
        conteo_negativos+=1
    else:
        conteo_positivos += 1

print(f"Conteo positivos: {conteo_positivos}")
print(f"Conteo negativos: {conteo_negativos}")
print(f"Conteo neutros: {conteo_neutros}")