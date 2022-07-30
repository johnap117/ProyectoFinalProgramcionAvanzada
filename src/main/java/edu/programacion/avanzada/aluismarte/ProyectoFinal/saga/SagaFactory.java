package edu.programacion.avanzada.aluismarte.ProyectoFinal.saga;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.Saga;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.step.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SagaFactory {
    public static Saga<DemoResponse> createDemoSaga(UUID key, DemoCommand command) {
        SagaPayload<DemoResponse> sagaPayload = new SagaPayload<>();
        sagaPayload.addProperty(new SagaPayLoadKey<>("command", DemoCommand.class), command);
        return Saga.<DemoResponse>builder()
                .name("Demo Saga")
                .key(key)
                .payload(sagaPayload)
                .requiredStep(List.of(
                        SagaDemoStep1.class,
                        SagaDemoStep2.class,
                        SagaDemoStepFinal.class,
                        SagaDemoStepTrueFinal.class
                ))
                .build();
    }

    public static Saga<PayCheckoutResponse> payCheckoutSaga(UUID key, PayCheckoutCommand command) {
        SagaPayload<PayCheckoutResponse> sagaPayload = new SagaPayload<>();
        sagaPayload.addProperty(PayCheckoutCommand.ID, key);
        sagaPayload.addProperty(PayCheckoutCommand.COMMAND, command);
        return Saga.<PayCheckoutResponse>builder()
                .name("Pay Checkout Saga")
                .key(key)
                .payload(sagaPayload)
                .requiredStep(List.of(
                        PayCheckoutFindDataStep.class,
                        PayCheckoutCreateOrderStep.class,
                        PayCheckoutSaveOrderStep.class
                ))
                .build();
    }
}
