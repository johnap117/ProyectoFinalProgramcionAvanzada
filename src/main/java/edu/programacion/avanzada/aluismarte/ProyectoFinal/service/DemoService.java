package edu.programacion.avanzada.aluismarte.ProyectoFinal.service;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommandBus commandBus;

    public DemoResponse get(boolean explote) {
        return commandBus.sendCommand(DemoCommand.builder().explote(explote).build());
    }
}
