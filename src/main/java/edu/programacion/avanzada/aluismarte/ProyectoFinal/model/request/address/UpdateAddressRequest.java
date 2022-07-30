package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.UpdateAddressCommand;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressRequest {

    private Long id;
    private String name;
    @Size(min = 8, max = 20)
    @NotBlank(message = "Campo description no puede estar vacío")
    private String description;

    public UpdateAddressCommand toCommand() {
        return UpdateAddressCommand.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

}
