#Ejercicio 8: Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario y la sumatoria de todos los salarios.

print("...::: Ejercicio 7 :::...")

suma_salario =0


for i in range(1,6):
    horas = float(input(f"Ingrese las horas trabajadas del {i}° trabajador : "))
    tarifa = float(input(f"Ingrese la tarifa por hora del {i}° trabajador : "))
    print(f"El salario del {i}° trabajador es = ${horas*tarifa}")
    suma_salario += horas*tarifa

print(f"La suma de todos los salario  es = ${suma_salario}")


