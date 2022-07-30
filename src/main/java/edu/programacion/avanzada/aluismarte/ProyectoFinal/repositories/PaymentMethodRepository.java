package edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
