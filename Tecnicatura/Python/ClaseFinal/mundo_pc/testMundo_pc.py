from mundo_pc.Computadora import Computadora
from mundo_pc.Monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado('HP', 'USB')
monitor1 = Monitor('HP', '15 Pulgadas')
raton1 = Raton('HP', 'USB')
computadora1 = Computadora('HP', monitor1, teclado1, raton1)


teclado2 = Teclado('Acer', 'Bluethooth')
monitor2 = Monitor('Acer', '32 Pulgadas')
raton2 = Raton('Acer', 'BLuethooth')
computadora2 = Computadora('AMD', monitor2, teclado2, raton2)



teclado3 = Teclado('Red dragon', 'USB')
monitor3 = Monitor('Red dragon', '22 Pulgadas')
raton3 = Raton('Red dragon', 'USB')
computadora3 = Computadora('HP', monitor3, teclado3, raton3)


teclado4 = Teclado('Asus', 'VGA')
monitor4 = Monitor('Asus', '29 Pulgadas')
raton4 = Raton('Asus', 'VGA')
computadora4 = Computadora('Intel', monitor4, teclado4, raton4)
computadora5 = Computadora('Intel', monitor3, teclado2, raton4)


computadoras1 = [computadora1, computadora2]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora4, computadora5]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora5)
print(orden2)