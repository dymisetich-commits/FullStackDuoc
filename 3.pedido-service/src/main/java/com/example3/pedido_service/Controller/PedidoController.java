package com.example3.pedido_service.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example3.pedido_service.Model.PedidoModel;
import com.example3.pedido_service.Service.PedidoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
@Tag(
    name = "Pedidos",
    description = "API para la gestión de pedidos"
)
public class PedidoController {


    private final PedidoService pedidoService;

    // Listar pedidos
    @Operation(summary = "Listar todos los pedidos")
    @ApiResponse(responseCode = "200", description = "Lista obtenida correctamente")
    @GetMapping
    public ResponseEntity<List<PedidoModel>> listar() {

        log.info("GET -> listar pedidos");

        return ResponseEntity.ok(pedidoService.findAll());
    }

    // Buscar por ID
    @Operation(summary = "Buscar pedido por ID")
    @ApiResponse(responseCode = "200", description = "Pedido encontrado")
    @ApiResponse(responseCode = "404", description = "Pedido no encontrado")
    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> buscar(@PathVariable Long id) {

        log.info("GET -> buscar pedido {}", id);

        return ResponseEntity.ok(pedidoService.findById(id));
    }

    // Crear pedido
    @Operation(summary = "Crear un nuevo pedido")
    @ApiResponse(responseCode = "201", description = "Pedido creado correctamente")
    @PostMapping
    public ResponseEntity<PedidoModel> guardar(@Valid @RequestBody PedidoModel pedidoModel) {

        log.info("POST -> guardar pedido");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pedidoService.save(pedidoModel));
    }

    // Actualizar pedido
    @Operation(summary = "Actualizar un pedido")
    @ApiResponse(responseCode = "200", description = "Pedido actualizado")
    @ApiResponse(responseCode = "404", description = "Pedido no encontrado")
    @PutMapping("/{id}")
    public ResponseEntity<PedidoModel> actualizar(
            @PathVariable Long id,
            @Valid @RequestBody PedidoModel pedidoModel) {

        log.info("PUT -> actualizar pedido {}", id);

        return ResponseEntity.ok(
                pedidoService.update(id, pedidoModel));
    }

    // Eliminar pedido
    @Operation(summary = "Eliminar un pedido")
    @ApiResponse(responseCode = "200", description = "Pedido eliminado")
    @ApiResponse(responseCode = "404", description = "Pedido no encontrado")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {

        log.info("DELETE -> eliminar pedido {}", id);

        pedidoService.delete(id);

        return ResponseEntity.ok("Pedido eliminado");
    }
}


/*
CREATE DATABASE pedido_db;
*/


/*
GET http://localhost:8083/api/pedidos
*/


/*
GET http://localhost:8083/api/pedidos/1
*/

/*
{ post
  "usuarioId": 1,
  "restauranteId": 1,
  "total": 25000
}
*/

/* put 
{
  "usuarioId": 1,
  "restauranteId": 1,
  "estado": "PAGADO",
  "total": 25000
}
*/



/*
CREATE DATABASE pedido_db;
*/


/*
GET http://localhost:8083/api/pedidos
*/


/*
GET http://localhost:8083/api/pedidos/1
*/

/*
{ post
  "usuarioId": 1,
  "restauranteId": 1,
  "total": 25000
}
*/

/* put 
{
  "usuarioId": 1,
  "restauranteId": 1,
  "estado": "PAGADO",
  "total": 25000
}
*/
