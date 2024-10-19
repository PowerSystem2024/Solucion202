"""
Desempaquetado de listas
"""

def show (name, lastName):
    print(name + ' ' + lastName)
    
print("")
person = ['Ariel', 'Betancud']
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion
print("")
show(*person) # Esto es lo mismo que lo anterior pero todo junto
print("")
person2 = ('Osvaldo', 'Giordanini') # Desempaquetamos tupla
show(*person2)
print("")
person3 = {"lastName": "Lucero", "name": "Natalia"} # Desempaquetamos diccionario
show(**person3) # Aqui agregamos un asteristico mas
