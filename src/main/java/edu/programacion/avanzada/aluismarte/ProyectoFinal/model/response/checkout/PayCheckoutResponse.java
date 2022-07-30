package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.OrderDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PayCheckoutResponse {

    private OrderDTO orderDTO;
}
