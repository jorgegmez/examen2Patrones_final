# examen2Patrones_final
Errores del examen:

En la clase de Pelicula, en el método persist() → el nombre de la colección era “Movies” cuendo el nombre correcto es “Peliculas”.
En ningún momento se asigna un alquiler a un cliente.
Los cálculos de alquiler siempre retornan 0.0.
En el método statement() en la clase Cliente no pasa a la condición del while.
El método de get() en la clase Cliente y Pelicula retorna null siempre.


Cambios en el código:

El el método de persist() y en el método de add() cambie el tipo de dato a retornar de void a boolean. Justificación: Facilidad en obtener los resultados deseados en los test.
Agregué en el método add() y la clase Registrar una colección para Disco, para poder registrar el mismo.
Y a su vez en la clase Disco, agregué el método persist(). Justificación: Con el fin de poder registrar el mismo.
Agregué un método para poder asignar un alquiler al cliente respectivo. Justificación: Hacer funcionar correctamente el cálculo del alquiler.
Intente agregar el patrón de diseño estrategia: Por medio de la creacion e implementacion de una Interface, y la división de cada algoritmo en una clase particular, se logra acceder al calculo especifico de cada una para la realización del mismo con mayor eficacia, dejando el código más corto y entendible. Justificación: Manejo de cálculos de alquiler. Sin embargo, se me presento un error que no logro resolver, el método no de la interface no se sobre escribe. Me base en el ejemplo de estrategia 1, pero por alguna razón no funciona. Por lo que me debo obligado a entregarlo sin patrones de diseño.


Nota importante:

Intente agregar el patrón de diseño estrategia: Por medio de la creacion e implementacion de una Interface, y la división de cada algoritmo en una clase particular, se logra acceder al calculo especifico de cada una para la realización del mismo con mayor eficacia, dejando el código más corto y entendible. Justificación: Manejo de cálculos de alquiler. Sin embargo, se me presento un error que no logro resolver, el método no de la interface no se sobre escribe. Me base en el ejemplo de estrategia 1, pero por alguna razón no funciona. Por lo que me debo obligado a entregarlo sin patrones de diseño.
