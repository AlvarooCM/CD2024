# Comandos Utilizados Ejercicio 1.

### Moverse a la carpeta destino

    cd /Desktop/CD2024/ud02

### Crear carpeta

    mkdir Ejercicio1

### Nos movemos a la carpeta creada

    cd Ejercicio1

### Crear ficheros txt

    touch alvaro.txt actividades.txt

### Añadimos contido aos ficheiros

    nano alvaro.txt
    nano actividades.txt

### Para añadir los archivos para hacer el commit

    git add .

### Hacer commit

    git commit -m "Commit Apartado 1"

### Hacemos el push

    git push

### Editamos el fichero alvaro.txt

    nano alvaro.txt

### Para añadir los archivos para hacer el commit

    git add .

### Hacemos el segundo commit

    git commit -m "Commit Apartado 2"

### Hacemos el push

    git push

### Creamos otra carpeta 

    mkdir carpeta

### Creamos 2 archivos

    touch archivo1.txt archivo2.txt

### Editamos el fichero actividades.txt

    nano actividades.txt

### Cogemos los cambios que hicimos

    git add .

### Hacemos el commit de los cambios

    git commit -m "Commit final"

### Hacemos el push

    git push

# Comandos Utilizados Ejercicio 2.

### Crear repositorio nuevo

    mkdir pagina_web

### Mostrar contenido de la carpeta

    ls /pagina_web

### Ver el estado del repositorio.

    git status

    Vemos que al ejecutar el comando que tenemos el repositorio desactualizado o todavia no lo hemos pusheado.

### Creamos un fichero index.html con un codigo.

    nano index.html

### Cogemos los cambios que hicimos

    git add .

### Hacemos el commit de los cambios

    git commit -m "Primera practica html"

### Vemos el estado del repositorio.

    git status

    Vemos que el repositorio esta actualizado.

### Cambiamos el contenido del index

    nano index.html

### Volvemos a hacer el commit

    git commit -m "Añadidas 3 ciudades que visitar"

### Ver historial de commits

    git log

### Crear carpeta por cada ciudad

    mkdir Oslo Venecia

### Cogemos los cambios

    git add .

### Hacemos un commit de los cambios

    git commit -m "Añadimos informacion sobre las ciudades a visitar"

# Comandos Utilizados Ejercicio 3

### Crear carpeta

    mkdir Libro

### Crear fichero indice.txt

    nano indice.txt

### Hacer commit

    git commit -m "Añadido indice del libro"

### Cambiar contenido indice.txt

    nano indice.txt

### Hacer commit

    git commit -m "Añadido Capitulo 4: La bella y la bestia"

### Ver historial del repositorio

    git status

### Crear carpeta Capitulos

    mkdir Capitulos

### Crear archivos capitulo2.txt con texto dentro

    nano capitulo2.txt

### Hacer commit 

    git commit -m "Añadido capitulo 2"

### Mostrar historial de cambios

    git log

### Crear capitulo3.txt con texto dentro 

    nano capitulo3.txt

### Ver el estado del repositorio de forma abreviada e indicar qué significa cada letra

    git log -s

### Modificar el índice.txt añadiendo “Capitulo 5: Forzen””
        
    nano indice.txt

### Subir los cambios ignorando el capitulo3.txt

    nano .gitignore

### Hacer un git add

    git add .

### Modificar el fichero para que se ignoren todos aquellos ficheros que comiencen por _ a excepción del fichero _ayuda.txt (ya no se debe ignorar capitulo3.txt)

    nano .gitignore

### Crear un fichero _logs.txt con el siguiente contenido

    nano _logs.txt

### Crear un fichero _ayuda.txt con el siguiente contenido

    nano _ayuda.txt

### Preparar todo con git add *.

    git add *
    Ignora las rutas por el .gitignore

### Hacer un commit de los cambios con el mensaje “Añadido capitulo 2”.

    git commit -m "Añadido capitulo 2"

### Modificar el fichero capitulo2.txt 

    nano capitulo2.txt

### Ver y explicar qué ha cambiado

    git status
    Cambió el contenido del fichero del capitulo2

### Hacer un commit con el mensaje “Capitulo 2 modificado”

    git commit -m "Capitulo 2 modificado"
