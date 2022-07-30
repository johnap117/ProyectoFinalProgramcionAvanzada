package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteProductCommand extends Command<DeleteProductResponse> {

    private Long id;
}
