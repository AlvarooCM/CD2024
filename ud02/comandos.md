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







