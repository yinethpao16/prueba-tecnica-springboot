package com.pruebatecnica.backend.service;

import com.pruebatecnica.backend.entity.Nota;

import java.util.List;

public interface NotaService {

    Nota crearNota(Long alumnoId, Long materiaId, Double valor);

    List<Nota> listarNotas();

    Nota obtenerNotaPorId(Long id);

    void eliminarNota(Long id);
}

