package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.payment;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.PaymentMethod;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodRequest {

    @Size (min = 8, max = 15)
    @NotBlank (message = "El campo nombre no puede estar vacio")
    private String name;

    @Size (min = 10, max = 25)
    @NotBlank (message = "El campo descripcion no puede estar vacio")
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }
}
