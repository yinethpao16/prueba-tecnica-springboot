package com.pruebatecnica.backend.service.impl;

import com.pruebatecnica.backend.entity.Alumno;
import com.pruebatecnica.backend.entity.Materia;
import com.pruebatecnica.backend.entity.Nota;
import com.pruebatecnica.backend.repository.AlumnoRepository;
import com.pruebatecnica.backend.repository.MateriaRepository;
import com.pruebatecnica.backend.repository.NotaRepository;
import com.pruebatecnica.backend.service.NotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;
    private final AlumnoRepository alumnoRepository;
    private final MateriaRepository materiaRepository;

    public NotaServiceImpl(
            NotaRepository notaRepository,
            AlumnoRepository alumnoRepository,
            MateriaRepository materiaRepository
    ) {
        this.notaRepository = notaRepository;
        this.alumnoRepository = alumnoRepository;
        this.materiaRepository = materiaRepository;
    }

    @Override
    public Nota crearNota(Long alumnoId, Long materiaId, Double valor) {

        Alumno alumno = alumnoRepository.findById(alumnoId)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));

        Materia materia = materiaRepository.findById(materiaId)
                .orElseThrow(() -> new RuntimeException("Materia no encontrada"));

        Nota nota = new Nota();
        nota.setValor(valor);
        nota.setAlumno(alumno);
        nota.setMateria(materia);

        return notaRepository.save(nota);
    }

    @Override
    public List<Nota> listarNotas() {
        return notaRepository.findAll();
    }

    @Override
    public Nota obtenerNotaPorId(Long id) {
        return notaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota no encontrada"));
    }

    @Override
    public void eliminarNota(Long id) {
        if (!notaRepository.existsById(id)) {
            throw new RuntimeException("Nota no encontrada");
        }
        notaRepository.deleteById(id);
    }
}
