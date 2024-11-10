termino1 = "IDE"
termino2 = "Integrated Development Environment"

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    
    for llave, valor in terminos.items(): # kwargs significa: key word argument
        print(f'{llave} : {valor}')
    
listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE = 'Integrated Development Environment', PK = 'Primary Key')
print("-------------------------------------")
listarTerminos(termino1 = termino2) #No me llama al termino1