package com.pruebatecnica.backend.repository;

import com.pruebatecnica.backend.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
