package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.DeleteAddressCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressRequest {

    private Long id;

    public DeleteAddressCommand toCommand() {
        return DeleteAddressCommand.builder()
                .id(id)
                .build();
    }
}
