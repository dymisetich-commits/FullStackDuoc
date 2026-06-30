--------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------
Proyecto compuesto por 10 microservicios, desarrollado con tecnologías backend como Spring Framework y Netflix Eureka, enfocado en una arquitectura distribuida, escalable y modular para la gestión eficiente de servicios y comunicación entre componentes.

--------------------------------------------------------------------------------------------------------------------------------------------------------
Para iniciar el proyecto, primero se debe abrir el código fuente en el IDE de preferencia. Luego, ejecutar la clase EurekaServerApplication.java para iniciar el servidor Eureka encargado del registro y descubrimiento de microservicios.

Posteriormente, iniciar XAMPP y levantar el servicio de MySQL. En caso de que las bases de datos no existan, pueden crearse manualmente desde phpMyAdmin o ejecutando el siguiente script SQL:

CREATE DATABASE usuario_db;
CREATE DATABASE pedido_db;
CREATE DATABASE pago_db;
CREATE DATABASE restaurante_db;
CREATE DATABASE repartidor_db;
CREATE DATABASE entrega_db;
CREATE DATABASE notificacion_db;
CREATE DATABASE historial_db;

Una vez creada la base de datos, se debe iniciar cada microservicio ejecutando su respectiva clase Application.java. Después de que todos los servicios estén en funcionamiento, ejecutar el microservicio api-gateway.

Finalmente, abrir Postman para realizar las pruebas de endpoints y verificar el correcto funcionamiento de la arquitectura de microservicios.

--------------------------------------------------------------------------------------------------------------------------------------------------------
Video:
https://www.youtube.com/watch?v=ttYjcYZqk-I

--------------------------------------------------------------------------------------------------------------------------------------------------------
Integrantes:
- Patricio Muñoz Huinca
- Suimey Flores Garcia
- Dylan Misetich Riquelme

--------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------
