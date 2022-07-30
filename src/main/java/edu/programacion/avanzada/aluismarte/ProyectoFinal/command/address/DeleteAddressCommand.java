package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressCommand extends Command<DeleteAddressResponse> {

    private Long id;
}