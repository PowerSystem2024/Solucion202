from Empleado import Empleado
from Gerente import Gerente
def imprimir_detalles(objeto):
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)

empleado = Empleado('Afri', 60000.00)
imprimir_detalles(empleado)

gerente = Gerente('Aular', 50000.00, 'Producción')
imprimir_detalles(gerente)
imprimir_detalles(gerente)