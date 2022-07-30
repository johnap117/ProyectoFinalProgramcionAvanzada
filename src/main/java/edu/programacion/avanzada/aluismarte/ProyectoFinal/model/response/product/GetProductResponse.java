package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetProductResponse {

    private List<ProductDTO> products;
}
