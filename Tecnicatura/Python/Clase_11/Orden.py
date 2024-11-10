from Producto import Producto

class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)  # agregar producto al final de la lista

    # calcular total
    def calcular_total(self):
        total = 0
        for producto in self._productos:
            total += producto._precio
        return total

    def __str__(self):
        productos_str = ''
        for producto in self._productos:
            productos_str += producto.__str__() + ' | '
        return f'Orden: {self.id_orden}, \nProductos: {productos_str}'

# Ejemplo de uso
if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)
    productos1 = [producto1, producto2]
    orden1 = Orden(productos1)
    print(orden1)
