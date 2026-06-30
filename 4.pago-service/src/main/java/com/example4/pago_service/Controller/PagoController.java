package com.example4.pago_service.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example4.pago_service.DTO.PagoRequestDTO;
import com.example4.pago_service.DTO.PagoResponseDTO;
import com.example4.pago_service.Service.PagoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequestMapping("/api/pagos")
@RequiredArgsConstructor
@Tag(name = "Pagos", description = "API para la gestión de pagos")
public class PagoController {

    private final PagoService pagoService;

    @Operation(summary = "Listar todos los pagos")
    @ApiResponse(responseCode = "200", description = "Lista de pagos obtenida correctamente")
    @GetMapping
    public ResponseEntity<List<PagoResponseDTO>> listar() {
        return ResponseEntity.ok(pagoService.obtenerTodos());
    }

    @Operation(summary = "Obtener un pago por ID")
    @ApiResponse(responseCode = "200", description = "Pago encontrado")
    @ApiResponse(responseCode = "404", description = "Pago no encontrado")
    @GetMapping("/{id}")
    public ResponseEntity<PagoResponseDTO> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(pagoService.obtenerPorId(id));
    }

    @Operation(summary = "Crear un nuevo pago")
    @ApiResponse(responseCode = "201", description = "Pago creado correctamente")
    @PostMapping
    public ResponseEntity<PagoResponseDTO> crear(@Valid @RequestBody PagoRequestDTO dto) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pagoService.crearPago(dto));
    }

    @Operation(summary = "Eliminar un pago")
    @ApiResponse(responseCode = "200", description = "Pago eliminado correctamente")
    @ApiResponse(responseCode = "404", description = "Pago no encontrado")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {

        pagoService.eliminarPago(id);

        return ResponseEntity.ok("Pago eliminado");
    }
}

/*
CREATE DATABASE pago_db;
*/

