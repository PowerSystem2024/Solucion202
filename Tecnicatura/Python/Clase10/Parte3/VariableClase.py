class MiClase:
    #Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una varibale de clase'
    
    #Contexto dinamico
    def __init__(self, variable_instancia): #La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia
    
    #Contexto estatico, se aasocia a la clase
    @staticmethod
    def metodo_estatico(): # No recibe la referencia de self
        print(MiClase.variable_clase)
        
    # Definimos un metodo de clase
    @classmethod
    def metodo_clase(cls): # Recibe un contexto de clase "cls" es una referencia a la clase misma
        print(cls.variable_clase)
        
    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)
        
print(MiClase.variable_clase)

miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)

miClase2 = MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

# *Otra forma de crear una varible de clase
"""
 MiClase.variable_clase2 = 'Valor de variable de clase 2': Aquí se está creando dinámicamente una nueva
 variable de clase llamada variable_clase2 para la clase MiClase. 
 Esto es posible en Python, ya que las variables de clase se pueden crear o modificar en cualquier momento.
"""

#MiClase.variable_clase2 = 'Valor de varibale de clase 2'
#print(MiClase.variable_clase2)
#print(miClase1.variable_clase2)

"""
Variables de clase: Compartidas entre todas las instancias de la clase y accesibles tanto desde la clase como 
desde las instancias.

Variables de instancia: Pertenecen a cada instancia y pueden tener valores diferentes en cada objeto.
"""

#Metodo estatico
print("Imprimiendo metodo_estatico".center(50, "-"))
MiClase.metodo_estatico()

print("Imprimiendo metodo_clase".center(50, "-"))
MiClase.metodo_clase()
miObjeto1 = MiClase('Variable de instancia')
miObjeto1.metodo_clase()

print("Imprimiendo variable de clase".center(50, "-"))
miObjeto1.metodo_instancia()