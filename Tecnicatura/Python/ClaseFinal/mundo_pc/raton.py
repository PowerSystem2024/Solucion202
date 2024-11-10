from mundo_pc.dispositivo_entrada import DispositivoEntrada
class Raton(DispositivoEntrada):
    contador_ratones = 0
    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)
    @property
    def marca(self):
        return self._marca

    @marca.setter
    def nombre(self, marca):
        self._marca = marca

    @property
    def tipo_entrada(self):
        return self._tipo_entrada

    @tipo_entrada.setter
    def nombre(self, tipo_entrada):
        self._tipo_entrada = tipo_entrada

    def __str__(self):
        return (f'Id:{self._id_raton}, Marca:{self._marca}, Tipo Entrada: {self._tipo_entrada}')

if __name__ == '__main__':
    raton1 = Raton('Lenovo', 'USB')
    print(raton1)
    raton2 = Raton('Logitech', 'Bluethooth')
    print(raton2)