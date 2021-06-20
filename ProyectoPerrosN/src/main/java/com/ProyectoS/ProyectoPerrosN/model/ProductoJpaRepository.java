package com.ProyectoS.ProyectoPerrosN.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoJpaRepository extends JpaRepository<Producto, Integer>{
    
}
