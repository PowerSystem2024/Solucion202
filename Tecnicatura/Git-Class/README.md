# CLASE 01 MIÉRCOLES 14 DE AGOSTO DEL 2024 - Portafolio 1

**USO DE GITHUB Parte 1**

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

**COMANDOS**

```sh
Import repository, New repository, New organization: #significa que es como tu empresa, New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa, New gist: es un pedasito de código que puedes compartir

New repository #Ponemos el nombre: class-git, descripción: Haremos un blog increible, hay muchas licencias para publicar el código: NO lo hacemos ahora.

Create repository #Lo ponemos en privado o en Publico.
```

El ***README.md*** es el archivo que veremos por defecto al entrar a un repositorio. *Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.*

Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando HTTPS) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub.

>ATENCIÓN: ¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña.
Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.

**Cómo conectar un repositorio de GitHub** a nuestro documento local Si queremos conectar el repositorio de GitHub con nuestro repositorio local, que creamos aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes instrucciones:

```sh
## Guardar la URL del repositorio de GitHub con el nombre de origin

$ git remote add origin URL

## Verificar que la URL se haya guardado correctamente:

$ git remote

$ git remote -v

## Traer la versión del repositorio remoto y hacer merge para crear un commit con los archivos de ambas partes. 

#Podemos usar git fetch y git merge o solo git pull con el flag 

$ git pull --allow-unrelated-histories:

$ git pull origin master --allow-unrelated-histories

# Por último, ahora sí podemos hacer git push para guardar los cambios de nuestro repositorio local en GitHub:

$ git push origin master
```

**Cómo autenticarte en GitHub 2022**

Antes de empezar debemos renombrar la rama **‘máster’** a **‘main’**, este es el nuevo estándar en GitHub, para esto:

Primero nos posicionamos en la rama a la que queremos cambiarle el nombre.

Ejecutamos el siguiente comando: 

```sh
$ git branch -M main
```

**Pasos para crear un token de acceso personal.**

Inicia sesión en GitHub:

   >Ve a GitHub e inicia sesión con tu cuenta.
    Accede a la configuración de tu cuenta: Haz clic en tu avatar en la esquina superior derecha de la página y selecciona "Settings" (Configuración).

Ve a la sección de desarrolladores:

> En el menú de la izquierda, desplázate hacia abajo y selecciona "Developer settings" (Configuración de desarrollador).

Crea un nuevo token:

>En la sección de "Personal access tokens", selecciona "Tokens classic" y luego haz clic en "Generate new token" (Generar nuevo token).

Configura el token:

>Asigna un nombre descriptivo al token para recordar su propósito.
Selecciona la duración del token (por ejemplo, 30 días, 60 días, etc.) o déjalo sin fecha de expiración.
Selecciona los permisos necesarios para el token, dependiendo de lo que necesites hacer (repositorios, notificaciones, paquetes, etc.).

Genera y guarda el token:

>Haz clic en "Generate token" (Generar token).
**Importante**: Copia y guarda el token en un lugar seguro, ya que no podrás verlo nuevamente una vez que cierres esta ventana.

Usa el token:

>Puedes utilizar este token en lugar de tu contraseña al autenticarte en GitHub desde la línea de comandos o herramientas que requieran acceso a tu cuenta de GitHub.

*Desde el 2022 GitHub ya no deja hacer el push con la contraseña del propio GitHub, para esto tenemos que crear un token, y este token es la contraseña que vamos a colocar cuando nos pida clave.*

Descubre el uso de tags en Github

Ver los Tags en GitHub:

>1. Navega a tu repositorio en GitHub.
>2. Ve a la pestaña "Tags" en la sección de "Releases" para ver todos los tags.

Crear una release desde un Tag:

>1. En la pestaña "Releases", haz clic en "Draft a new release".
>2. Selecciona el tag que deseas asociar con la release.
>3. Llena los detalles como título, descripción y, si es necesario, adjunta binarios o archivos para la release.
>4. Haz clic en "Publish release" para crear una nueva release basada en el tag seleccionado.

## PORTAFOLIO

*Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:*

**Dante Nicolás Martinez**

<sub>Segundo Semestre Parte 1:</sub>

***Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.***

**Profesor Ariel Betancud**

# CLASE 02 MIÉRCOLES 21 DE AGOSTO DEL 2024 - Portafolio 2

**Vamos a cargar la llave SSH publica en GitHub**

Para copiar la llave publica debes ir al archivo ***.ssh*** y allí encontrarás el archivo ***.pub*** lo podes abrir con el *txt*, luego copiar el contenido que esta dentro.

    1- copiar la llave publica. Ir a GitHub, vamos a setting, vamos a SSH and GPG keys
    2- crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.

<sub>Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.</sub>

```sh
git branch #Vemos en que rama estamos

git checkout master #Ponernos en la rama master

git branch -M main #Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo

git remote -v #Vemos si ya esta conectado

git merge segunda #Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy

git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.
```

***Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.***

### PORTAFOLIO

***Vamos a ver unos videos en el campus de como avanzar en lo que es un portafolio por el Tutor:***

**Dante Nicolás Martinez**

<sub>Segundo Semestre Parte 2:</sub>

> Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

**Profesor Ariel Betancud**

# CLASE 03 MIÉRCOLES 28 DE AGOSTO DEL 2024 - Portafolio 3

## Cambios en GitHub: de master a main

> El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.
> Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

**Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.**

**Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.**

>Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como **master, slave, blacklist o whitelist** y esperamos pronto puedan ir desapareciendo.

***Y sí, las palabras importan.***

*Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.*

¿Cuando es que sigue siendo **"master"** y cuando sigue siendo **"main"**?

Cuando se crea un repositorio desde **git bash** en nuestro ordenador a través de **git init**, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando **"git branch -M main"**.
Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de *"main"* y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.

### PORTAFOLIO

***Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:***

**Dante Nicolás Martinez**

<sub>**Segundo Semestre Parte 3:**</sub>

> Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

***Profesor Ariel Betancud***

# CLASE 04 MIÉRCOLES 4 DE SEPTIEMBRE DEL 2024 - Portafolio 4

## Tu primer push

**La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.**

Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

```sh
ssh 

git remote set-url origin url-ssh-del-repositorio-en-github
```

Comandos para copiar la llave SSH:

### ESTAS SON LAS RUTAS DEL SSH PUBLICO

>**Mac:**

```sh
pbcopy < ~/.ssh/id_rsa.pub
```

>**Windows (Git Bash):**

```sh
clip < ~/.ssh/id_rsa.pub
```

>**Linux (Ubuntu):**

```sh
cat ~/.ssh/id_rsa.pub
```

#### Importante

Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

#### Invitar a un colaborador

Para invitar a un colaborador debemos ir a GitHub y seleccionar:

```sh
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.
```

Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.

## PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 4:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 05 MIÉRCOLES 11 DE SEPTIEMBRE DEL 2024 - Portafolio 5

## Git tag y versiones en GitHub

En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.


### **Creación de etiquetas en Git**

```sh
git tag

```

Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.

### **Listado de etiquetas**

Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:

```sh
git tag -a v1.0 -m "Product release"

git tag -a rongburgundy -m "Brick killed a guy with a trident"

```

### Para crear una etiqueta, ejecuta el siguiente comando:

Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.

```sh
git tag
```

*Esto mostrará una lista de las etiquetas existentes, como:*

```sh
v1.0

v1.1

v1.2
```

>Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.

### Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:

```sh
git push origin
```

Para enviar varias etiquetas a la vez, usa:

```sh
git push origin --tags
```

### Eliminación de etiquetas

Para eliminar una etiqueta, usa el siguiente comando:

```sh
git tag -d
```

>Esto eliminará la etiqueta identificada por en el repositorio local.

En resumen, las **etiquetas en Git** son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.

## PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 5:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 06 MIÉRCOLES 18 DE SEPTIEMBRE DEL 2024 - Portafolio 6

### Error con los tags
**Investigación:** ¿Qué pasa si por error cargamos un tag dos veces? ¿Cómo solucionarías este problema o error?

<sub>La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.</sub>

>**[Trabajo del grupo "Solucion202"](/Tags-Clase6.pdf)**

### PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 6:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 07 MIÉRCOLES 25 DE SEPTIEMBRE DEL 2024 - Portafolio 7

### Error con los tags

*Investigación: Si un tag es imposible generarlo dos veces ¿Cómo es que existe el error de dos tags con el mismo nombre?*

**¿Cómo se origina este problema o error?**

<sub>La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.</sub>

**[Trabajo del grupo "Solucion202"](/Clase7-Tags.pdf)**

### PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 6:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 08 MIÉRCOLES 2 DE OCTUBRE DEL 2024 - Portafolio 8

## Manejo de ramas en GitHub

> *Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.*
> 
Para instalar git debemos ejecutar los siguientes comandos:


```sh

  sudo apt-get update

  sudo apt-get install gitk

```

## Repasa: ¿Qué es Git?

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

## Comandos para manejo de ramas en GitHub
*Crear una rama:*

```sh
git branch branchName #Crear una rama
git checkout branchName #Movernos a otra rama 
git checkout -b nombre-de-la-rama #Crear una rama en el repositorio local
git push origin nombre-de-la-rama #Publicar una rama local al repositorio remoto
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

## PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 7:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 09 MIÉRCOLES 9 DE OCTUBRE DEL 2024 - Portafolio 9

> **Tarea para antes de las 23 horas: Investigar como se puede clonar un repo con el https del mismo, ósea siendo ustedes los dueños del repositorio, y desde la nube quieren traer este repo a nuestro ordenador, nos pedira Username y password: ¿qué se debe hacer para lograr hacer cambios y así utilizar pull, push, y todo lo necesario para trabajar?. Como referencia les digo que solo usuario y contraseña no será suficiente, esto cambio desde el año 2021 y ahora hay algo más para poder hacer esto y tener así acceso total.**

## Configurar múltiples colaboradores en un repositorio de GitHub

Por defecto, cualquier persona puede clonar o descargar tu proyecto desde GitHub, pero no pueden crear commits, ni ramas. Esto quiere decir que pueden copiar tu proyecto pero no colaborar con él, si este es publico, de otra manera, osea, si es privado es necesario que realmente estes haciendo una invitación, sino no lo van a poder ver. Existen varias formas de solucionar esto para poder aceptar contribuciones. Una de ellas es añadir a cada persona de nuestro equipo como colaborador de nuestro repositorio.

**Cómo agregar colaboradores en Github
Solo debemos entrar a la configuración de colaboradores de nuestro proyecto. Se encuentra en:**

```sh
Repositorio > Settings > Collaborators
```

***Ahí, debemos añadir el email o username de los nuevos colaboradores.***

Si, como colaborador, agregaste erróneamente el mensaje del commit, lo puedes cambiar de la siguiente manera:

**Hacer un commit con el nuevo mensaje que queremos,** esto nos abre el editor de texto de la terminal:

```sh
git commit —amend #Corregimos el mensaje
git pull origin main #Traer el repositorio remoto
git push --set-upstream origin main #Ejecutar el cambio, el error arreglado
```

**Comienzo del colaborador**

```sh
cd Documentos #Abre git bash
mkdir class-git #Crea la carpeta o directorio de trabajo
ls -al #Revisa lo que va haciendo, los archivos o directorios que tiene
```

**1**. No debe hacer un git init, debe buscar el repositorio en el cual esta invitado a participar, por supuesto en GitHub.

**2**. Pasa a clonar desde HTTPS, copiar la url, esto es porque no se arranca el proyecto desde cero, se esta uniendo otro colaborador.

**3**. En git bash ponemos el siguiente comando.
git clone url-copiada-github #Esto hace que clonemos el repositorio

**4**. No pide ni usuario ni contraseña si el repositorio es publico.

```sh
code . #Abre VSC y comienza con cambios, o abre el siguiente comando para hacer modificaciones
vim historia.txt #Vamos a escribir: Aquí esta un nuevo colaborador
vim escribimos el mensaje del commit #Esto en Ubuntu
ctrl + x
s #Para un si 
enter #Terminado el mensaje del commit
vim escribimos el mensaje del commit #Esto en git bash window
esc #Presionamos escaner luego de terminar de escribir
:wq! #Para salir del editor vim en window

git status
git commit -am "Mi primer commit, estoy muy emocionado!!!"
git pull origin main
git fetch
gti branch #Para ver las ramas que se trajo, no se trae sino solo main, si hay mas debes crearlas local
git log #Para ver toda las historia
git log --graph #Vemos el grafico de las diferentes ramas y del commit que acabamos de hacer que esta en el main, Git es una base de datos de toda las historia de todo lo que se ha hecho
git push origin main #Va a pedir un email que será el del colaborador, su contraseña.
```

**5**. Nos trae un denegado, ¿Por qué? Porque en el proceso de abordaje el jefe no le dio acceso: el dueño del repositorio no le agregó dandole acceso.

**6**. Ir a settings del repositorio, veremos la opsión Collaborators, agregamos el correo o nombre de usuario: el colaborador debe tener un email publico y visible o de otra manera debera ser con el nombre de usuario publico: ingresar el username y debe ir como colaborador.

**7**. Se puede enviar un email con la url, pero ya GitHub envia una notificación al usuario de invitado, es una cosa que debemos empezar a consultar y revisar.

**8**. El colaborador debe aceptar la invitación, una vez hecho eso ya tendrá total acceso para hacer push al repositorio.
```sh
git pull origin main
git push origin main #Colocar nombre de usuario y contraseña, listo
```

**9**. El dueño del repositorio no ve los cambios, ¿Qué hacer?

```sh
git pull origin main
git fetch
git log --stat #Se verá claro que el colaborador ingreso su primer commit
```

**10**. A partir de ahora el dueño del repositorio y el colaborador deberán repartir el trabajo, esto se hace con distintas ramas de trabajo: el dueño trabajará desde la rama header y el colaborador desde la rama footer, al final cuando se termine, se hara un merge para terminar el proyecto.

**PORTAFOLIO**

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 8:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 10 MIÉRCOLES 16 DE OCTUBRE DEL 2024 - Portafolio 10

## Flujo de trabajo profesional

### Haciendo merge de ramas de desarrollo a main

Para poder desarrollar software de manera óptima y ordenada, necesitamos tener un flujo de trabajo profesional, que nos permita trabajar en conjunto sin interrumpir el trabajo de otros desarrolladores.

**Una buena práctica de flujo de trabajo sería la siguiente:**

**1**. Crear ramas

**2**. Asignar una rama a cada programador

**3**. El programador baja el repositorio con git pull origin master

**4**. El programador cambia de rama

**5**. El programador trabaja en esa rama y hace commits

**6**. El programador sube su trabajo con git push origin #nombre_rama

**7**. El encargado de organizar el proyecto baja, revisa y unifica todos los cambios


**PORTAFOLIO**

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 9:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>

# CLASE 11 MIÉRCOLES 23 DE OCTUBRE DEL 2024 - Portafolio 11

## Flujo de trabajo profesional -> Archivos binarios

Las imagenes cargandolas en el repositorio, representan un problema: porque las imagenes son pesadas, y si la subimos al repositorio, siempre que hagamos cambios, vamos a estar trayendo la imagen siempre, estas imagenes son binarios para GitHub, mientras mas binarios carguemos, más pesado va a ser el repositorio, algo que no es parte de las buenas practicas.

Otra cosa muy importante a tener en cuenta, es que en cada commit que hagamos hay un tamaño predefinido para la carga, este no lo podemos superar o no podremos subir los commits, el tamaño es 100 mb, si acoplamos un archivo binario en un commit que pese mas de esto, será un problema, no nos dejará seguir commiteando, porque siempre seguirá arrastrando el archivo binario.

## PORTAFOLIO

**Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:**

>Dante Nicolás Martinez
>
>Segundo Semestre Parte 9:

>Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>**Profesor Ariel Betancud**</sub>