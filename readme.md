
---------------------------------------------------
debe tener el readme estas cosas: 

Integrantes
Arquitectura
Cómo ejecutar
Orden de arranque
Bases de datos
Eureka
Swagger
Gateway
Link del video
-------------------------------------------------------------

1. mvn clean install -DskipTests

--------------------------------

# 🚀 Food Delivery Platform

Sistema de gestión de pedidos de comida desarrollado con arquitectura de microservicios utilizando Spring Boot, Spring Cloud, Eureka Server, API Gateway, OpenFeign, JWT, MySQL y Docker.

---

# 📦 Componentes de distribución

| Componente                      | Enlace                           |
| ------------------------------- | -------------------------------- |
| 📦 Versión Nativa (.jar + .bat) | **Pegar enlace de Google Drive** |
| 🐳 Versión Docker               | **Pegar enlace de Google Drive** |
| 🎥 Video de defensa             | **Pegar enlace del video**       |

---

# 👥 Integrantes

* Patricio Muñoz
* Dylan Misetich
* Suimey Flores

---

# 🏗 Arquitectura

El proyecto está desarrollado mediante una arquitectura de microservicios Maven Multi-Módulo.

## Microservicios

| Microservicio        | Puerto | Función                 |
| -------------------- | :----: | ----------------------- |
| Eureka Server        |  8761  | Registro de servicios   |
| API Gateway          |  8080  | Punto de entrada        |
| Usuario Service      |  8081  | Gestión de usuarios     |
| Restaurante Service  |  8082  | Gestión de restaurantes |
| Pedido Service       |  8083  | Gestión de pedidos      |
| Pago Service         |  8084  | Gestión de pagos        |
| Entrega Service      |  8085  | Gestión de entregas     |
| Repartidor Service   |  8086  | Gestión de repartidores |
| Historial Service    |  8087  | Historial de pedidos    |
| Notificación Service |  8088  | Notificaciones          |
| Categoría Service    |  8089  | Gestión de categorías   |
| Sucursal Service     |  8090  | Gestión de sucursales   |

---

# ▶ Cómo ejecutar el proyecto

## Compilar

```bash o powershell 
mvn clean install
```

## Ejecución nativa

Ejecutar el archivo:

```text
arrancar-nativo.bat
```

## Ejecución Docker

```bash
docker compose up --build
```

---

# 🔄 Orden de arranque

El sistema debe iniciarse en el siguiente orden:

1. Eureka Server
2. Usuario Service
3. Restaurante Service
4. Pedido Service
5. Pago Service
6. Entrega Service
7. Repartidor Service
8. Historial Service
9. Notificación Service
10. Categoría Service
11. Sucursal Service
12. API Gateway

---

# 🗄 Bases de datos

Cada microservicio utiliza una base de datos independiente.

| Microservicio | Base de datos   |
| ------------- | --------------- |
| Usuario       | usuario_db      |
| Restaurante   | restaurante_db  |
| Pedido        | pedido_db       |
| Pago          | pago_db         |
| Entrega       | entrega_db      |
| Repartidor    | repartidor_db   |
| Historial     | historial_db    |
| Notificación  | notificacion_db |
| Categoría     | categoria_db    |
| Sucursal      | sucursal_db     |

---

# 🌐 Eureka Server

Consola de Eureka:

```text
http://localhost:8761
```

Todos los microservicios deben registrarse correctamente en Eureka antes de consumir la API.

---

# 📚 Swagger

Cada microservicio dispone de documentación Swagger/OpenAPI.

los swaager de los microservicios

| Microservicio        | Puerto | Swagger                                       |
| -------------------- | ------ | --------------------------------------------- |
| Usuario Service      | 8089   | `http://localhost:8089/swagger-ui/index.html` |
| Restaurante Service  | 8081   | `http://localhost:8081/swagger-ui/index.html` |
| Pedido Service       | 8083   | `http://localhost:8083/swagger-ui/index.html` |
| Pago Service         | 8084   | `http://localhost:8084/swagger-ui/index.html` |
| Entrega Service      | 8085   | `http://localhost:8085/swagger-ui/index.html` |
| Historial Service    | 8086   | `http://localhost:8086/swagger-ui/index.html` |
| Notificación Service | 8087   | `http://localhost:8087/swagger-ui/index.html` |
| Repartidor Service   | 8088   | `http://localhost:8088/swagger-ui/index.html` |
| Categoría Service    | 8090   | `http://localhost:8090/swagger-ui/index.html` |
| Sucursal Service     | 8091   | `http://localhost:8091/swagger-ui/index.html` |

---

# 🚪 API Gateway

El Gateway centraliza el acceso a todos los microservicios.

URL principal:

```text
http://localhost:8080
```

Ejemplos de consumo:

```text
GET http://localhost:8080/api/usuarios
GET http://localhost:8080/api/restaurantes
GET http://localhost:8080/api/pedidos
GET http://localhost:8080/api/pagos
```

---

# 🧪 Pruebas Unitarias

El proyecto incorpora pruebas unitarias desarrolladas con **JUnit 5** y **Mockito**.

Se ejecutan automáticamente con:

```bash
mvn clean install
```

---

# 🎥 Video de defensa

Duración aproximada: **15 minutos**.

Enlace:

**(Pegar enlace del video aquí)**

---

Este formato:

* ✅ Integrantes
* ✅ Arquitectura
* ✅ Cómo ejecutar
* ✅ Orden de arranque
* ✅ Bases de datos
* ✅ Eureka
* ✅ Swagger
* ✅ Gateway
* ✅ Link del video



















