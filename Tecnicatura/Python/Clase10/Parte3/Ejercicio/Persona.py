class Persona:
    
    contador_persona = 0
    
    @classmethod #Con este arreglo no hace falta crear un onjeto para que aumente el contador   
    def generar_siguiente_valor(cls):
        cls.contador_persona += 1 # Vamos incrementando 
        return cls.contador_persona
    
    def __init__(self, nombre, edad):
        self.idPersona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad
        
    def __str__(self):
        return f'Persona [{self.idPersona}: {self.nombre} {self.edad}]'
    
#Comenzamos con la instancia
persona1 = Persona('Juan', 40)
print(persona1)
persona2 = Persona('Osvaldo', 45)
print(persona2)
persona3 = Persona('Liliana', 35)
print(persona3)
Persona.generar_siguiente_valor() # Estamos llamando al decorador pero no creamos un objeto
persona4 = Persona('Natalia', 35)
print(persona4)

print(f'Contador personas: {Persona.contador_persona}')