package edu.programacion.avanzada.aluismarte.ProyectoFinal.domain;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    public AddressDTO toDTO() {
        return AddressDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

}

/**@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String pais;
    @Column
    private String provincia;
    @Column
    private String municipio;
    @Column
    private String sector;
    @Column
    private String calle;
    @Column
    private int casa;**/

