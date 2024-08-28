#Calcular la suma de los N primero números

print("Programa de la suma de los primeros N números")

n_num = int(input("ingrese hasta que número vamos a sumar "))
acc= 0
for n in range(1,n_num+1):
    acc += n

print(f"la suma de los primeros {n_num} es igual a {acc}")
