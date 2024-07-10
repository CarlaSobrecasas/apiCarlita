# apiCarlita

Para empezar a desarrollar esta Api, vamos a crear :
un package para nuestro controlador en mi caso lo llame: cntroller
Luego hacemos lo mismo para Nuestras Entidades, Repository y Service 
dentro del (main-> java-> com.apicarlita.carlitaApi).

Imagen

creamos la Base de datos anteriormente, 

En application.properties configuramos las variables para la coneccion con nuestra base de datos....

En el package controller vamos a crear una clase y agregamos las anotations correspondiente, la clase la identificamos con la Anotation @RestController. aqui vamos a colocar los Endpoints, para identificar las rutas colocamos la anotation @GetMaping (/miruta).

En el package entity vamos a crear nuestras entidades para la base de datos, con sus respectivos atributos y sus Getters and Setters
agregamos las Anotations correspondientes para la clase @Enity ,@Id para identificar el atributo id. Lo mismo realizamos para cada entidad.

El en package Repository vamos a crear una clase de tipo Interface por Entidad, la cual extiende de jpaRepository, esta sera la encargada de comunicar con la base de datos mediante la Entidad y el Id (Clave Primria).

En el package services vamos a crear una clase de tipo interface por ecada ntidad, donde vamos a crear los metodos, luego creamos una clase comun dentro del mismo package para cada entidad, donde vamos a implementar los metodos ya creados en el interface, a esta clase la vamos a identificar con la anotation @Service 


