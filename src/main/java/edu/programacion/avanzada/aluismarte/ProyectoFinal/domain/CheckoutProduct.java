package edu.programacion.avanzada.aluismarte.ProyectoFinal.domain;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.CheckoutProductDTO;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "checkouts_products")
public class CheckoutProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Product product;

    @Column
    private Long quantity;

    public CheckoutProductDTO toDTO() {
        return CheckoutProductDTO.builder()
                .id(id)
                .product(product.toDTO())
                .quantity(quantity)
                .build();
    }
}
    /**@Id
    private UUID id;

    @OneToOne
    private Product producto;

    @Column
    private long cantidad;**/
