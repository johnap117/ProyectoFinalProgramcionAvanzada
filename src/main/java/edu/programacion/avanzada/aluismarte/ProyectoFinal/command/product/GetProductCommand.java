package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetProductCommand extends Command<GetProductResponse> {

    private Long id;
}
