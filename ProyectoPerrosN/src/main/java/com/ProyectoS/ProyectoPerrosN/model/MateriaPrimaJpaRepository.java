package com.ProyectoS.ProyectoPerrosN.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MateriaPrimaJpaRepository extends JpaRepository<MateriaPrima, Integer> {
    
}
