# Memoria en Java y Gestión de Variables

## 1. Conceptos Básicos de Memoria RAM
- **Definición**: Memoria de almacenamiento volátil utilizada para datos y programas activos
- **Características**:
    - Acceso rápido para la CPU
    - Almacenamiento temporal
    - Pierde su contenido al apagar el sistema
    - Fundamental para la ejecución de programas Java

## 2. Gestión de Memoria en la JVM
### 2.1 Áreas Principales
#### Stack (Pila)
- Almacena:
    - Variables locales
    - Valores de variables primitivas dentro de métodos
    - Referencias a objetos
- Características:
    - Organización LIFO (Last In, First Out)
    - Creación de frames por cada llamada a método
    - Gestión automática de memoria

#### Heap (Montículo)
- Almacena:
    - Objetos
    - Arrays
    - Instancias de clases
- Características:
    - Gestión dinámica
    - Espacio compartido entre todos los hilos
    - Gestionado por el Garbage Collector

Ejemplo:
```JAVA
  public void metodo() {
  int x = 5; // Se almacena en el stack.
  String saludo = "Hola"; // La referencia se almacena en el stack, pero el objeto en el heap.
  }
  ```

## 3. Garbage Collector (GC)
### 3.1 Funciones Principales
- Liberar memoria automáticamente
- Gestionar el heap eficientemente
- Prevenir fugas de memoria
- Optimizar el uso de recursos

### 3.2 Proceso de Recolección
1. **Marcado**: Identifica objetos no utilizados
2. **Barrido**: Elimina objetos no accesibles
3. **Compactación**: Optimiza el espacio en memoria

### 3.3 Características
- Ejecución automática
- No requiere intervención del programador
- Se activa según:
    - Políticas de la JVM
    - Necesidades de la aplicación
    - Disponibilidad de memoria

## 4. Funcionamiento del Sistema
### 4.1 Ciclo de Vida de Variables
1. **Declaración**: Reserva de espacio en memoria
2. **Asignación**: Almacenamiento de valores
3. **Uso**: Acceso y modificación
4. **Liberación**: Automática por el GC (para objetos)

### 4.2 Proceso de Ejecución
1. Compilación del código fuente (.java) a bytecode (.class)
2. Carga del bytecode en memoria RAM por la JVM
3. Ejecución del programa con gestión automática de memoria

## 5. Buenas Prácticas
- Liberar referencias a objetos cuando no se necesiten
- Evitar retener objetos innecesariamente
- Considerar el alcance de las variables
- Utilizar estructuras de datos apropiadas

## 6. Ventajas del Sistema
- Gestión automática de memoria
- Prevención de fugas de memoria
- Optimización del uso de recursos
- Mejora en la seguridad y estabilidad

## 7. Consideraciones de Rendimiento
- El GC puede afectar temporalmente el rendimiento
- Las operaciones de limpieza ocurren en momentos específicos
- La JVM optimiza el proceso según el uso
