from MetodoSetyGet import Persona2

print(' Creacion de objetos '.center(60, '-'))
if __name__ == '__main__':
    persona5 = Persona2('Ivan', 'Champu', 30)
    persona5.mostrar_detalles()

    print(__name__)# Metodo de comprobacion 
    
# "Destructor de objetos"    
print(' Eliminacion de objetos '.center(60, '-'))
del persona5