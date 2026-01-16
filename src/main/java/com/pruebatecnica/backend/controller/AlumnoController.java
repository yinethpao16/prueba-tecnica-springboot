package com.pruebatecnica.backend.controller;

import com.pruebatecnica.backend.entity.Alumno;
import com.pruebatecnica.backend.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.crear(alumno);
    }

    @GetMapping
    public List<Alumno> listar() {
        return alumnoService.listar();
    }

    @GetMapping("/{id}")
    public Alumno obtener(@PathVariable Long id) {
        return alumnoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.actualizar(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}
