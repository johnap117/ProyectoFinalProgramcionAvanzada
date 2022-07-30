package edu.programacion.avanzada.aluismarte.ProyectoFinal.command;


import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DemoCommand extends Command<DemoResponse> {

    private boolean explote;
}
