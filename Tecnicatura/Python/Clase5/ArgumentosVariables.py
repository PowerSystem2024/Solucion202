# Argumentos, variables en funciones

def listarNombres(*nombres): # Normalmente se le agrega *args
    # Se le agrega el asteristico cuando no sabemos la cantidad real de valores
    
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
        
listarNombres('Lucas', 'Jose', 'Claudia', 'Rosa', 'Maria')
listarNombres('Rosalia', 'Juanita', 'Pepe', 'Fito') #  Se agrega al listado de nombres anterior