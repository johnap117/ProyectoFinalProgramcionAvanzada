package edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.compensator;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PayCheckoutCompletePaymentCompensator implements SagaStepCompensator<PayCheckoutResponse> {

    private final OrderRepository orderRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        Order order = sagaPayload.getProperty(PayCheckoutCommand.ORDER);
        orderRepository.delete(order);
    }
}
