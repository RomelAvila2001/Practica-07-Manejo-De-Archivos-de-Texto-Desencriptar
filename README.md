# Practica-07-Manejo-De-Archivos-de-Texto-Desencriptar
##  Lenguaje
- Java JDK 1.8
- ID Netbeans Apache 11.3
## Librerias
- javax.swing.JOptionPane
- javax.swing.jLabel
- javax.swing.jTextField
- javax.swing.JButton
- java.util.List
# Practica
## 1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 07: Gestión de Archivos de texto en Java
![1](https://user-images.githubusercontent.com/64879338/87238773-7b717800-c3cc-11ea-8246-44160fc661b5.jpg)
## 2. Desarrollar una aplicación que permita encriptar y desencriptar documentos de texto usando dos aplicaciones cliente. 
- La aplicación fue realizada en el lenguaje de programación de Java (Netbeans), en el cual fue creado 2 proyectos, el primero llamado Practica07-GestionDeArchivosDeTexto tiene como objetivo la encriptación del texto para después crear un archivo y guardar la información en él.

![2](https://user-images.githubusercontent.com/64879338/87238831-6d702700-c3cd-11ea-9a37-8186b44179b3.jpg)
- El segundo proyecto con el nombre de Practica07-GestionDeArchivosDeTextoParte2 hace lo contrario al primero mencionado, ya que este recupera el texto guardado en el archivo y desencripta.

![3](https://user-images.githubusercontent.com/64879338/87238861-c63fbf80-c3cd-11ea-8c8f-f12b2aef70f2.jpg)

## 3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin. 
- Commits del primer proyecto:
- En total fueron 23 commits.

![4](https://user-images.githubusercontent.com/64879338/87238901-26cefc80-c3ce-11ea-8b36-43c7c5c36ae8.jpg)

- Commits del segundo proyecto:
- En total fueron 9 commits.

![5](https://user-images.githubusercontent.com/64879338/87238910-52ea7d80-c3ce-11ea-8a2d-2b5a784d88e8.jpg)

## 4. Generar el informe de la práctica con el desarrollo de cada uno de los puntos descritos anteriormente. 
### Proyecto Practica07-GestionDeArchivosDeTexto
- Este proyecto consta de 2 paquetes, el primero es del controlador y el segundo es para la interfaz gráfica.
##### Paquete ec.edu.ups.controlador:
###### Clase ControladorArchivos: 
- Esta clase tiene la función de crear el archivo, además encriptar el contenido para ser guardado en el archivo.
- Código: https://github.com/RomelAvila2001/Practica-de-laboratorio-07-Gestion-de-Archivos-de-texto-en-Java/blob/master/src/main/java/ec/edu/ups/controlador/ControladorArchivos.java

##### Paquete ec.edu.ups.vista
###### Clase VentanaPrincipal
- Esta clase contiene el método main y la interfaz que conecta con las demás ventanas para ingresar la información.
- Código: https://github.com/RomelAvila2001/Practica-de-laboratorio-07-Gestion-de-Archivos-de-texto-en-Java/blob/master/src/main/java/ec/edu/ups/vista/VentanaPrincipal.java
- Vista 

![6](https://user-images.githubusercontent.com/64879338/87239007-81b52380-c3cf-11ea-9a1e-9febf06fab5b.jpg)

###### Clase VentanaIngresarTexto
- Esta clase ingresa la información para enviar al controlador y crear el archivo
- Código: https://github.com/RomelAvila2001/Practica-de-laboratorio-07-Gestion-de-Archivos-de-texto-en-Java/blob/master/src/main/java/ec/edu/ups/vista/VentanaIngresarTexto.java
- Vista 

![7](https://user-images.githubusercontent.com/64879338/87239037-fe480200-c3cf-11ea-9143-f72049d2c615.jpg)

### Proyecto Practica07-GestionDeArchivosDeTextoParte2
Este proyecto consta de 2 paquetes, el primero es del controlador y el segundo es para la interfaz gráfica.
##### Paquete ec.edu.ups.controlador:
###### Clase ControladorArchivos:
- Esta clase recupera la información guardada en el archivo y le desencripta.
- Código: https://github.com/RomelAvila2001/Practica-07-Manejo-De-Archivos-de-Texto-Desencriptar/blob/master/src/main/java/ec/edu/ups/controlador/ControladorArchivos.java
##### Paquete ec.edu.ups.vista:
###### Clase VentanaPrincipal:
- Esta clase realiza como intermedio con el usuario y el sistema para poder ingresar los datos que necesita para realizar el Proceso.
- Código: https://github.com/RomelAvila2001/Practica-07-Manejo-De-Archivos-de-Texto-Desencriptar/blob/master/src/main/java/ec/edu/ups/vista/VentanaPrincipal.java
- Vista 

![8](https://user-images.githubusercontent.com/64879338/87239114-df963b00-c3d0-11ea-9137-496593218dcb.jpg)

## javaDoc
- file:///C:/Users/NANCY/Documents/NetBeansProjects/Practica-de-laboratorio-07-Gestion-de-Archivos-de-texto-en-Java-master/target/site/apidocs/allpackages-index.html
- file:///C:/Users/NANCY/Documents/NetBeansProjects/Practica07-GestionDeArchivosDeTextoParte2/target/site/apidocs/allpackages-index.html
## RESULTADO(S) OBTENIDO(S): 
- Al finalizar la práctica los estudiantes podrán conocer varios métodos de la clase File de Java que permite manipular  directorios del sistema operativo utilizando una ruta base. 
## CONCLUSIONES:  
- Los estudiantes podrán manejar directorios del S.O. desde java utilizando la clase File. 
## RECOMENDACIONES:  
- Aplicar buenas prácticas de programación 
- Programar según las convenciones de los códigos de Java.  
