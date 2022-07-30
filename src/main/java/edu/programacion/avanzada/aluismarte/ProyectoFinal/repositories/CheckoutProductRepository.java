package edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Checkout;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.CheckoutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProduct, Long> {
}
