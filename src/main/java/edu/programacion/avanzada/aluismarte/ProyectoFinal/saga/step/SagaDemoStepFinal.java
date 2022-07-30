package edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.step;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class SagaDemoStepFinal implements SagaStep<DemoResponse> {

    @Override
    public String getName() {
        return "Demo Step final";
    }

    @Override
    public SagaStepHandler<DemoResponse> getHandler() {
        return sagaPayload -> {
            DemoCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("command", DemoCommand.class));
            log.info("Running {} Handler", getName());
            System.out.println("Testing Demo Handler");
            BigDecimal decimal = sagaPayload.getProperty(new SagaPayLoadKey<>("decimal", BigDecimal.class));
            log.info("Reading value from step 1: {}", decimal);
        };
    }

    @Override
    public SagaStepCompensator<DemoResponse> getCompensator() {
        return null;
    }
}
