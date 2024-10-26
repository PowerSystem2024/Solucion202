"""
En Python, una constante es un valor que no se debe cambiar una vez que se ha asignado. Sin embargo, en Python 
no existen constantes propiamente dicho, como en otros lenguajes (por ejemplo, final en Java o const en C++). En 
su lugar, se utiliza una convención de nombres para indicar que un valor no debe modificarse, aunque Python no 
impide que se reasigne.

* Convención para Definir Constantes en Python
Por convención, se nombran las constantes usando mayúsculas y guiones bajos. Ejemplo:

PI = 3.14159
VELOCIDAD_DE_LUZ = 299792458  # en metros por segundo

* Buenas Prácticas

    - No modificar las constantes: Aunque Python permite reasignarlas, es buena práctica mantener su valor fijo
    una vez definido.
    - Usar un archivo separado para constantes: En proyectos grandes, se suelen guardar todas las constantes en 
    un archivo separado (por ejemplo, constants.py) para facilitar su acceso y mantener el código organizado.

* Alternativas

Para asegurarse de que un valor no cambie, se puede usar:

    Tuplas para colecciones de valores constantes.
    Módulos externos como const de la biblioteca constantly, que permite definir valores "pseudo-constantes".
"""
class Matematicas:
    PI = 3.1416 # Esta es una variable de clase constante

MI_CONSTANTE = 'Esta es una variable constante'

