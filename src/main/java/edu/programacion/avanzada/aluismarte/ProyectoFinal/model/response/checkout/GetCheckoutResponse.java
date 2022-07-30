package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetCheckoutResponse {

    private List<CheckoutDTO> checkouts;
}
