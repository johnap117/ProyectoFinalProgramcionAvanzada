package edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.handler;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Checkout;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.LogEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.service.LogEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class PayCheckoutCreateOrderHandler implements SagaStepHandler<PayCheckoutResponse> {

    private final LogEventService logEventService;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        UUID id = sagaPayload.getProperty(PayCheckoutCommand.ID);
        PayCheckoutCommand command = sagaPayload.getProperty(PayCheckoutCommand.COMMAND);
        Checkout checkout = sagaPayload.getProperty(PayCheckoutCommand.CHECKOUT);
        Order order = checkout.toOrder();
        logEventService.save(LogEvent.builder()
                .classOwner(getClass().toString())
                .processId(id)
                .process("Create Order")
                .parameterMap(Map.of("command", command))
                .build());
        sagaPayload.addProperty(PayCheckoutCommand.ORDER, order);
        // Solicito a mastercard la reserva del balance con mi payment intent
        sagaPayload.addProperty(PayCheckoutCommand.PAYMENT_INTENT, UUID.randomUUID().toString());
    }
}
