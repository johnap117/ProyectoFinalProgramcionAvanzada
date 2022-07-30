package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllProductCommand extends Command<GetProductResponse> {

}
