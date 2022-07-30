package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product.UpdateProductCommand;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateProductRequest {

    @NotNull
    private Long id;
    @Size(min = 10,max = 20)
    private String description;
    @Size (min = 1)
    private long availableQuantity;
    private BigDecimal price;

    public UpdateProductCommand toCommand() {
        return UpdateProductCommand.builder()
                .id(id)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }

}
