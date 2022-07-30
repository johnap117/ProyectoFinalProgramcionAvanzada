package edu.programacion.avanzada.aluismarte.ProyectoFinal.domain;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private long availableQuantity;

    @Column
    private BigDecimal price;

    public ProductDTO toDTO() {
        return ProductDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }

}
    /**@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private long disponibilidad;

    @Column
    private BigDecimal precio;**/
