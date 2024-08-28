# Ejercicio 4: Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos.
# Realizar un algoritmo para calcular la calificación promedio y la calificación más baja de todo el grupo.

print("...::: Calificaciones :::...")
suma=0
calificacion_mas_baja: float
calificacion_mas_alta: float
for i in range(1,11):
    nota=int(input(f"Ingrese la {i}° nota: "))
    suma=suma+nota
    if i==1:
        calificacion_mas_baja=nota
        calificacion_mas_alta=nota
    else:
        if calificacion_mas_baja > nota:
            calificacion_mas_baja=nota
        if calificacion_mas_alta < nota:
            calificacion_mas_alta=nota

promedio = suma/10
print(f"la calificación más alta fue {calificacion_mas_alta}")
print(f"la calificación más baja fue {calificacion_mas_baja}")
print(f"el promedio de calificaciones fue {promedio}")

