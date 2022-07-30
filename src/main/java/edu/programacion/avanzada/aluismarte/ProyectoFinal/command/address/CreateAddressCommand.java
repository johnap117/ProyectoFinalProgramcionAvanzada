package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address;


import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressCommand extends Command<CreateAddressResponse> {

    private String name;
    private String description;

    public Address toAddress() {
        return Address.builder()
                .name(name)
                .description(description)
                .build();
    }
}
