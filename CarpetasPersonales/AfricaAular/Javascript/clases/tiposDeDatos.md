# Tipos de datos en Javascript
### String
Son cadenas de caracteres, se deben escribir dentro de comillas o comillas simples 
      
      let string = "Soy String"

### Number

      let number = 3984

### Boolean
Representa un valor lógico que puede ser **true (verdadero)** o **false (falso)**. Es uno de los tipos de datos primitivos en JavaScript y se utiliza principalmente para evaluaciones lógicas y condiciones dentro del código.

      let bandera = true

### Undefined
Representa un valor "no definido". Este valor se utiliza para indicar que una variable ha sido declarada pero aún no tiene asignado ningún valor

      var x;
      console.log(x);

### Null
Significa ausencia de valor, no es un tipo de dato propiamente dicho, pero su origen es de tipo object

      var x = null;
      console.log(typeof x);
    
### Object
Es una entidad que agrupa datos (propiedades) y funciones (métodos) relacionados. Es una estructura de datos fundamental que permite organizar y manipular información de manera eficiente y flexible dentro del lenguaje.
###### Clave (Key):
Una clave, también conocida como propiedad, es el identificador único asociado a cada valor dentro de un objeto. Las claves en JavaScript son siempre cadenas de texto o símbolos. No pueden ser números ni otros tipos de datos.
###### Valor (Value):
El valor es la información asociada a cada clave en el objeto. Puede ser cualquier tipo de dato válido en JavaScript, como números, cadenas de texto, booleanos, funciones, arreglos u otros objetos.

      let object = {
        key: "value",
        key2: "value2"
      }

##### Tipos de objetos
###### Funciones: 
Objetos que contienen un bloque de código ejecutable.

      function miFunction(){
        console.log(typeof miFunction)
      }

###### Simbolos:
Identificadores únicos e inmutables.

      var simbolo = symbol("mi simbolo");
      console.log(simbolo)

###### Clases:  
Plantillas para crear objetos con propiedades y métodos compartidos.

      class persona{
        constructor(nombre.apellido){
          this.nombre = nombre
        this.apellido = apellido
        }
      }

##### Arrays

      var autos = ["uno", "dos", "tres", "cuatro"]



> El tipo de dato no se define en Javascript, pero para saberlo, usamos el operador `typeof`