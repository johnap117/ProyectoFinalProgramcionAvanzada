package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.payment;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdatePaymentMethodResponse {

    private PaymentMethodDTO paymentMethod;
}
