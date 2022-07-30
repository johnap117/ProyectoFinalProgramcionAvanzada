package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductResponse {

    private ProductDTO product;
}
