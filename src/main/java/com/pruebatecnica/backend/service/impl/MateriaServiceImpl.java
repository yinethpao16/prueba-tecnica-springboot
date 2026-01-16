package com.pruebatecnica.backend.service.impl;

import com.pruebatecnica.backend.entity.Materia;
import com.pruebatecnica.backend.repository.MateriaRepository;
import com.pruebatecnica.backend.service.MateriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaServiceImpl(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public Materia crear(Materia materia) {
        return materiaRepository.save(materia);
    }

    public List<Materia> listar() {
        return materiaRepository.findAll();
    }

    public Materia buscarPorId(Long id) {
        return materiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Materia no encontrada"));
    }

    public Materia actualizar(Long id, Materia materia) {
        Materia existente = buscarPorId(id);
        existente.setNombre(materia.getNombre());
        existente.setCodigo(materia.getCodigo());
        existente.setCreditos(materia.getCreditos());
        return materiaRepository.save(existente);
    }

    public void eliminar(Long id) {
        materiaRepository.deleteById(id);
    }
}

