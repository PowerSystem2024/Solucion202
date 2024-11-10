# Podemos definir que cada valor sea de tipo int, pero es redundante por que las variables 
# son dinamicas. 

def sumar(a:int = 0, b:int = 0) -> int: # Aqui le damos un valor por defecto para que no genere error. 
    
    return a + b

resultado = sumar()

print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar(22, 66)}')