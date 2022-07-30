package edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutRepository extends JpaRepository<UUID, Checkout> {
}
