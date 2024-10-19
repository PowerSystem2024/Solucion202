def desplegarNombres(nombres):
    
    for nombre in nombres:
        print(nombre)
        
nombres2 = ['Tito', 'Pedro', 'Carlos']

desplegarNombres(nombres2) # Aqui llamamos a una lista armada
desplegarNombres('Carla') # Llamamos a una cadena
#desplegarNombres(21) # No es un objeto iterable
desplegarNombres((10, 12)) # Convertimos en una tupla iterable. En este caso es una tupla de tipo entero
desplegarNombres([10, 12]) # Tambien lo podemos convertir en una lista para llamar a numeros