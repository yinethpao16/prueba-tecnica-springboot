package com.pruebatecnica.backend.service.impl;

import com.pruebatecnica.backend.entity.Alumno;
import com.pruebatecnica.backend.repository.AlumnoRepository;
import com.pruebatecnica.backend.service.AlumnoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public Alumno crear(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> listar() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno buscarPorId(Long id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    @Override
    public Alumno actualizar(Long id, Alumno alumno) {
        Alumno existente = buscarPorId(id);

        existente.setNombre(alumno.getNombre());
        existente.setApellido(alumno.getApellido());
        existente.setEmail(alumno.getEmail());
        existente.setFechaNacimiento(alumno.getFechaNacimiento());

        return alumnoRepository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);
    }
}
