
# BigFileOpps
Proyecto para realizar operaciones de filtrado con ficheros muy grandes en JAVA

## Requerimientos

- JAVA 1.8 o superior
- MAVEN 3.8 o o superior

## Compilamos con Maven

`mvn clean compile`

## Uso

Se utiliza desde la consola a traves de dos argumentos, la ruta del fichero y la cadena a buscar:

`java -jar target\bigFilesOpps.jar D:\datos\datos.txt rebeca`

`java -jar target\bigFilesOpps.jar /tmp/datos/datos.txt rebeca`

Cada ejecución generara un fichero 'output' con las líneas que tienen la cadena a buscar