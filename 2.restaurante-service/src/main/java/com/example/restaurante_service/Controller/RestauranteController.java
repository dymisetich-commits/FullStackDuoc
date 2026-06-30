package com.example.restaurante_service.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.restaurante_service.Dto.RestauranteRequestDTO;
import com.example.restaurante_service.Dto.RestauranteResponseDTO;
import com.example.restaurante_service.Service.RestauranteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// Indica que es controlador REST
@RestController

// Ruta principal
@RequestMapping("/api/restaurantes")

// Documentación Swagger
@Tag(
    name = "Restaurantes",
    description = "API para la administración de restaurantes"
)

@RequiredArgsConstructor
// Logs
@Slf4j
public class RestauranteController {

    // Inyección del service
    
    private final RestauranteService restauranteService;

    // Listar todos
    @Operation(summary = "Listar todos los restaurantes")
    @ApiResponse(responseCode = "200", description = "Lista obtenida correctamente")
    @GetMapping
    public List<RestauranteResponseDTO> listar() {

        log.info("GET listar restaurantes");

        return restauranteService.findAll();
    }

    // Buscar por ID
    @Operation(summary = "Buscar restaurante por ID")
    @ApiResponse(responseCode = "200", description = "Restaurante encontrado")
    @ApiResponse(responseCode = "404", description = "Restaurante no encontrado")
    @GetMapping("/{id}")
    public RestauranteResponseDTO obtener(@PathVariable Long id) {

        log.info("GET restaurante {}", id);

        return restauranteService.findById(id);
    }

    // Crear restaurante
    @Operation(summary = "Crear un nuevo restaurante")
    @ApiResponse(responseCode = "201", description = "Restaurante creado correctamente")
    @PostMapping
    public RestauranteResponseDTO crear(
            @Valid @RequestBody RestauranteRequestDTO dto) {

        log.info("POST crear restaurante");

        return restauranteService.save(dto);
    }

    // Actualizar restaurante
    @Operation(summary = "Actualizar restaurante")
    @ApiResponse(responseCode = "200", description = "Restaurante actualizado")
    @ApiResponse(responseCode = "404", description = "Restaurante no encontrado")
    @PutMapping("/{id}")
    public RestauranteResponseDTO actualizar(
            @PathVariable Long id,
            @Valid @RequestBody RestauranteRequestDTO dto) {

        log.info("PUT actualizar restaurante {}", id);

        return restauranteService.update(id, dto);
    }

    // Eliminar restaurante
    @Operation(summary = "Eliminar restaurante")
    @ApiResponse(responseCode = "200", description = "Restaurante eliminado")
    @ApiResponse(responseCode = "404", description = "Restaurante no encontrado")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {

        log.info("DELETE restaurante {}", id);

        restauranteService.delete(id);
    }

}

/*
-- Crear base de datos en mysql y despues esto se vera en eureka epicooo
CREATE DATABASE restaurante_db;
*/


/*
POST http://localhost:8081/api/restaurantes
*/

/*
{
  "nombre": "KFC",
  "direccion": "Santiago",
  "telefono": "12345678",
  "tipoComida": "Rapida",
  "activo": true
}
*/