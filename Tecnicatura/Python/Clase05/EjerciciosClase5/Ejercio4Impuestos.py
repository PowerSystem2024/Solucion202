"""
Ejercicio 4: Calculadora de impuestos
Crear una funcion para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
Proporcione el pago sin impuesto: 1000
Proporcione el monto del impuesto: 21%
Pago con impuesto: xxxxx
"""

def pagoImpuestos(pago, IVA):
    
    pago_total = pago + (pago * (IVA/100))
    
    return pago_total

pago = float(input("Ingrese el monto a pagar: "))
IVA = float(input("Ingrese el valor del porcentaje a pagar: "))

print(f"El pago total es de: {pagoImpuestos(pago, IVA)}")