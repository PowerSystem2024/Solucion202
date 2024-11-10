from mundo_pc.Monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

class Computadora:

    contador_conputadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_conputadoras += 1
        self._id_computadora = Computadora.contador_conputadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f'''
            {self._nombre}: {self._id_computadora}
            Monitor: {self._monitor}
            Teclado: {self._teclado}
            Ratón: {self._raton}       
    '''

if __name__ == '__main__':
    teclado1 = Teclado('HP', 'USB')
    monitor1 = Monitor('HP', '15 Pulgadas')
    raton1 = Raton('HP', 'USB')
    computadora1 = Computadora('HP', monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado('Acer', 'Bluethooth')
    monitor2 = Monitor('Acer', '32 Pulgadas')
    raton2 = Raton('Acer', 'BLuethooth')
    computadora2 = Computadora('AMD', monitor2, teclado2, raton2)
    print(computadora2)