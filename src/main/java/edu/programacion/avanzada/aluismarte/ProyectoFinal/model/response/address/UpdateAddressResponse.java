package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressResponse {

    private AddressDTO address;
}
