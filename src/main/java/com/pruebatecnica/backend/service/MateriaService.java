package com.pruebatecnica.backend.service;

import com.pruebatecnica.backend.entity.Materia;

import java.util.List;

public interface MateriaService {

    Materia crear(Materia materia);

    List<Materia> listar();

    Materia buscarPorId(Long id);

    Materia actualizar(Long id, Materia materia);

    void eliminar(Long id);
}
