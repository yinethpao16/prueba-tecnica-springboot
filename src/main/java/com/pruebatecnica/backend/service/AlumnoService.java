package com.pruebatecnica.backend.service;

import com.pruebatecnica.backend.entity.Alumno;

import java.util.List;

public interface AlumnoService {

    Alumno crear(Alumno alumno);

    List<Alumno> listar();

    Alumno buscarPorId(Long id);

    Alumno actualizar(Long id, Alumno alumno);

    void eliminar(Long id);
}
