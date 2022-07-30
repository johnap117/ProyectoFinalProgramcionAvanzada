package edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
}
