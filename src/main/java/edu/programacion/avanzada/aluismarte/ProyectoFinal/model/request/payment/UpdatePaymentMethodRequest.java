package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.payment;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdatePaymentMethodRequest {

    @NotNull
    private Long id;
    private String description;
    @Size (min = 1)
    private long availableQuantity;
    @NotNull
    private BigDecimal price;

}
