# Instructivo para la utilización de Git en forma grupal

En este proyecto, hemos establecido dos ramas principales: la rama por defecto llamada **"main"**, y una rama de trabajo llamada **"staging"**. Dentro de la rama **"staging"**, cada integrante del equipo creará y trabajará en su propia rama personal. Este flujo de trabajo nos permitirá colaborar de manera organizada, minimizando conflictos de código y asegurando que los cambios estén bien probados antes de fusionarse con la rama principal.

## 1. Estructura de ramas

- **main:** Es la rama principal que contiene el código más estable. Solo se fusionarán cambios aquí después de pasar por revisiones y pruebas adecuadas.
- **staging:** Es la rama de trabajo común donde se integrarán las ramas personales para revisión y pruebas antes de ser fusionadas a "main".
- **Ramas personales:** Cada integrante del equipo trabajará en su propia rama personal creada a partir de "staging". Los nombres de estas ramas deben seguir un formato claro para identificar a cada miembro, por ejemplo: Juan, Africa, Ignacio, Emmanuel, Marianela, Gimena.

## 2. Flujo de trabajo colaborativo
### 2.1. Clonar el repositorio

Cada integrante debe clonar el repositorio a su máquina local utilizando el siguiente comando:

```sh
git clone https://github.com/PowerSystem2024/Solucion202.git
```

O con SSH:

```sh
git clone git@github.com:PowerSystem2024/Solucion202.git
```

### 2.2. Crear una rama personal desde "staging"

Cada integrante debe crear su propia rama personal desde "staging". Primero, deben asegurarse de estar en la rama staging:

```sh
git checkout staging
```
**Luego, crear y cambiar a su propia rama personal:**

```sh
git checkout -b usuario-feature
```

### 2.3. Trabajar en la rama personal

Una vez creada la rama personal, el usuario podrá hacer sus cambios de código y los respectivos commits:

```sh
git add .
git commit -m "Descripción del cambio"
```

### 2.4. Subir la rama personal al repositorio remoto

Para mantener una copia de la rama personal en el repositorio remoto y permitir la colaboración del equipo, se debe hacer un push de la rama recién creada:

```sh
git push origin usuario-feature
```

### 2.5. Realizar un Pull Request desde la rama personal a "staging"

Una vez que los cambios hayan sido completados y probados en la rama personal, el usuario deberá solicitar una revisión creando un Pull Request (PR) desde su rama hacia **staging**. Esto lo puede hacer desde la plataforma en línea (GitHub, GitLab, etc.).

### 2.6. Fusionar los cambios en "staging"

Los demás integrantes del equipo revisarán el **Pull Request**. Una vez aprobados, los cambios se fusionarán en la rama staging. Esto se puede hacer desde la interfaz de la plataforma o mediante la terminal:

```sh
git checkout staging
git merge usuario
```

### 2.7. Actualización de la rama "main"

Una vez que se han integrado y probado satisfactoriamente los cambios en staging, los mismos serán fusionados en main, que contiene el código estable listo para producción.

```sh
# Cambiar a main
git checkout main

# Fusionar staging a main
git merge staging

# Subir los cambios al repositorio remoto
git push origin main
```

## 3. Buenas prácticas grupales

**Hacer commits con mensajes descriptivos:** Cada commit debe describir claramente qué cambio se está realizando, por ejemplo, git commit -m "Corrección de bug en la función de login".

Mantener la rama **"staging"** actualizada: Antes de trabajar en la rama personal, cada integrante debe asegurarse de que su rama staging local está actualizada con los últimos cambios remotos:

```sh
git checkout staging
git pull origin staging
```

**Resolver conflictos:** En caso de que surjan conflictos al intentar fusionar ramas, es importante que cada usuario los resuelva antes de realizar el push o fusionar a staging.

**Revisar y probar:** Todos los cambios deben ser revisados y probados antes de fusionarse a main.
