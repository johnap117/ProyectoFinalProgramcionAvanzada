package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressCommand extends Command<GetAddressResponse> {

    private Long id;
}
