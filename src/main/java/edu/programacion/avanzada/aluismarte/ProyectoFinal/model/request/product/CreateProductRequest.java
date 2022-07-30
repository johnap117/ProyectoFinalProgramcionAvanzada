package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product.CreateProductCommand;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductRequest {

    @Size (min = 8,max = 15)
    @NotBlank (message = "El campo nombre no puede estar vacio")
    private String name;
    @Size (min = 10,max = 20)
    @NotBlank (message = "El campo nombre no puede estar vacio")
    private String description;
    @NotBlank (message = "El campo nombre no puede estar vacio")
    private long availableQuantity;
    @NotBlank (message = "El campo nombre no puede estar vacio")
    private BigDecimal price;

    public CreateProductCommand toCommand() {
        return CreateProductCommand.builder()
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }
}
