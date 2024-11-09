class Persona: 
    
    def __init__(self, nombre, apellido, edad):
        
        #Creamos objetos
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
    def mostrar_detalle(self): # self es igual a this (en Java)
        
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')
        
persona1 = Persona('Juan', 'Perez', 23)
persona2 = Persona('Osvaldo', 'Giordadini', 45)

# Persona.mostrar_detalle() # Debemos pasarle una referencia al sefl sino dara error
# Persona.mostrar_detalle(persona1) # Estas lineas de codigo ya no se utiliza

#persona1.telefono = '44444444'
#print(f'Este es el telefono de {persona1.nombre}: {persona1.telefono}') # Hemos creado un atributo de un objeto