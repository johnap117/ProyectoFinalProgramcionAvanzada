package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUpdateAddressResponse {

    private CheckoutDTO checkout;
}
