package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.checkout;

import lombok.*;

import javax.validation.constraints.Size;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutAddProductRequest {

    private UUID id;

    private Long product;
    @Size(min = 1)
    private Long quantity;
}
