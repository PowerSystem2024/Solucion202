# Ejercicio 11: Agenda telefonica
# Hacer un progarama que simule una agenda de contacto. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menú de opciones:
# 1. Nuevo contacto
# 2. Borrar contacto
# 3. Ver contacto existente
# 4. Salir

agenda = {}

while True:
    print("\t.:Menú:.")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Digite una opción de menú: "))

    if opcion == 1:
        nombre = input("Digite el nombre del contacto: ")
        telefono = input("Digite el número de teléfono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("¡Contacto agregado exitosamente!")
        else:
            print("Este nombre de contacto ya existe.")

    elif opcion == 2:
        nombre = input("¿Cuál es el nombre del contacto que desea eliminar?: ")
        if nombre in agenda:
            del agenda[nombre]
            print("Se ha eliminado el contacto requerido.")
        else:
            print("Este contacto no existe en la agenda.")

    elif opcion == 3:
        print("\nAgenda de contactos:")
        if len(agenda) > 0:
            for clave, valor in agenda.items():
                print(f"Nombre: {clave}, Teléfono: {valor}")
        else:
            print("La agenda está vacía.")

    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos.")
        break

    else:
        print("Se equivocó de opción de menú.")

        print()

