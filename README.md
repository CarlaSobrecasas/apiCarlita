# Aplicacion Rest con SpringBoot

### Pasos a seguir

- Para empezar a desarrollar esta Api, vamos a crear :
varios package en nuestro caso a mi controlador lo llame: Controller
Luego hacemos lo mismo para nuestras Entidades, Repository y Service 
dentro del (main-> java-> com.apicarlita.carlitaApi).

> A tener en cuenta: la Base de datos ya la tenemos que tener creada. 

- (application.properties): Configuramos las variables para la coneccion con nuestra base de datos

- (Controller): Vamos a crear una clase y agregamos las anotations correspondiente, la clase la identificamos con la Anotation @RestController. aqui vamos a colocar los Endpoints, para identificar las rutas colocamos la anotation @GetMaping (/miruta).

- (Entity): Vamos a crear nuestras entidades para la base de datos, con sus respectivos atributos y sus Getters and Setters
agregamos las Anotations correspondientes para la clase @Enity ,@Id para identificar el atributo id. Lo mismo realizamos para cada entidad.

- (Repository) Vamos a crear una clase de tipo Interface por Entidad, la cual extiende de jpaRepository, esta sera la encargada de comunicar con la base de datos mediante la Entidad y el Id (Clave Primria).

- (Services) Vamos a crear una clase de tipo interface por ecada ntidad, donde vamos a crear los metodos, luego creamos una clase comun dentro del mismo package para cada entidad, donde vamos a implementar los metodos ya creados en el interface, a esta clase la vamos a identificar con la anotation @Service 


