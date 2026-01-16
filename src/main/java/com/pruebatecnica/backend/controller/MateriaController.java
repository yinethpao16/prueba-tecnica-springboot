package com.pruebatecnica.backend.controller;

import com.pruebatecnica.backend.entity.Materia;
import com.pruebatecnica.backend.service.impl.MateriaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    private final MateriaServiceImpl materiaService;

    public MateriaController(MateriaServiceImpl materiaService) {
        this.materiaService = materiaService;
    }

    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return materiaService.crear(materia);
    }

    @GetMapping
    public List<Materia> listar() {
        return materiaService.listar();
    }

    @GetMapping("/{id}")
    public Materia obtener(@PathVariable Long id) {
        return materiaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        return materiaService.actualizar(id, materia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaService.eliminar(id);
    }
}

