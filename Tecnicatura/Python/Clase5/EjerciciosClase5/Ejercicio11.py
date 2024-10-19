"""
Ejercicio11: Agenda telefonica
Hacer un programa que simule una agenda de contactos.
Crear un diccionario donde la clave sea el nombre del usuario 
y el valor sea el telefono, el programa tendrá el siguiente menu de opciones:

1. Nuevo contacto
2. Borrar contacto
3. Ver contacto existentes
4. Salir
"""

agenda = {}

while True:
    print("\t.:MENU:.")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contacto existentes")
    print("4. Salir")
    
    opcion = int(input("Digite una opcion de menú: "))
    if opcion == 1: 
        nombre = input("Digite el nombre del contacto: ")
        telefono = input("Digite el numero de telefono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto ingresado correctamente")
        else:
            print("Este contacto ya existe")
            
    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto: ")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se a eliminado el contacto requerido")
        else:
            print("ESte contacto no existe en la agenda")
            
    elif opcion == 3:
        print("Agenda de contacto")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, telefono: {valor}")
            
    elif opcion == 4:
        print("Gracias por utilizar nuestra agenda de contactos")
        break
    
    else:
        print("Se equivoco de opcion en el Menu")
        
    print("")
            