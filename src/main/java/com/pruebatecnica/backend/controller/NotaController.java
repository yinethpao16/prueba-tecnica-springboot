package com.pruebatecnica.backend.controller;

import com.pruebatecnica.backend.entity.Nota;
import com.pruebatecnica.backend.service.NotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    private final NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @PostMapping
    public Nota crear(@RequestParam Long alumnoId,
                      @RequestParam Long materiaId,
                      @RequestParam Double valor) {
        return notaService.crearNota(alumnoId, materiaId, valor);
    }

    @GetMapping
    public List<Nota> listar() {
        return notaService.listarNotas();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        notaService.eliminarNota(id);
    }
}

