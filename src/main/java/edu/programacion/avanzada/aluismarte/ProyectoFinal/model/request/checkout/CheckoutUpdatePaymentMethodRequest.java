package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.checkout;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdatePaymentMethodRequest {

    private UUID id;

    @NotBlank (message = "Debe suministrar un metodo de pago")
    private Long paymentMethod;
}
