package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.handler;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.SagaOrchestrator;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.Saga;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.SagaFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@CommandEvent(command = DemoCommand.class)
@Slf4j
public class DemoCommandHandler implements CommandHandler<DemoResponse, DemoCommand> {

    private final SagaOrchestrator sagaOrchestrator;

    @Value("${pattern.saga.timeout}")
    private int timeout;

    @Override
    public DemoResponse handle(DemoCommand command) {
        Saga<DemoResponse> saga = SagaFactory.createDemoSaga(UUID.randomUUID(), command);
        return sagaOrchestrator.orchestrate(saga, timeout);
    }
}