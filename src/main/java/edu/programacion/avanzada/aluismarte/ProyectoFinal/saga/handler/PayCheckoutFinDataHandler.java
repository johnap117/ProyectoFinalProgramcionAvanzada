package edu.programacion.avanzada.aluismarte.ProyectoFinal.saga.handler;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Checkout;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.exceptions.CheckoutNoFoundException;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PayCheckoutFinDataHandler implements SagaStepHandler<PayCheckoutResponse> {

    private final CheckoutRepository checkoutRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        PayCheckoutCommand command = sagaPayload.getProperty(PayCheckoutCommand.COMMAND);
        Checkout checkout = checkoutRepository.findById(command.getId()).orElseThrow(() -> new CheckoutNoFoundException(command.getId()));

        sagaPayload.addProperty(PayCheckoutCommand.CHECKOUT, checkout);
    }
}
