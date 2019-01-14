# Patrones de Diseño | Práctica 1
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Descripción
Crear 4 entidades y aplicarle los patrones que se piden.
El ejemplo que se plantea trata de una librería en la que se hacen publicaciones.
* Cada publicación está asociado a 0 o varios lectores. Un lector sigue 1 o varias publicaciones.
* Cada publicación contiene un libro.
* Cada publicación es de un género. De cada género hay 0 o varias publicaciones.
* Feedback recoge opiniones de la librería.

### Entidades
* Book `id : String`  `title : String`  `author : String`
* Reader `id : String`  `name : String`  `age : Integer`
* enum Genre `MATHS`  `ARTS`  `DESIGN`
* Publication `id : String`, `signed : Boolean`, `publiDate : LocalDateTime`, `Book : book`,  `List<Reader> : readers`, Genre : genre`
* Feedback id `String`, likes `Integer`
#### Diseño de entidades
![UML DIAGRAM](http://https://github.com/lelepompom/APAW.ECP1.SandraOrtega/blob/master/UML.png)

### Patrones
* (+2). **Factoría** con patrón **Singleton** de la entidad. Se almacenan y se buscan las entidades por su id de la entidad principal, como entidad principal se refiere a la entidad que posee la relación, pero la factoría no los crea, solo gestiona los objetos. Debe ir con test de prueba
* (+2). **Builder** de la entidad. Debe ir con test de prueba
* (+2). Patrón **Composite** de la entidad . La entidad no puede ser cambiada de su interfaz publico dado. Mediante el método view() se visualiza la id si es una entidad y name (String) si es una agrupación. Debe ir con test de prueba
* (+2). Patrón **Strategy**. Buscar, comprender , explicar y realizar un ejemplo propio de su funcionamiento
* (+2). A la Factoría anterior,  aplicarle el patrón **Observer**, para que cada vez que se añade un objeto nuevo, provoque un evento.  Debe ir con test de prueba

