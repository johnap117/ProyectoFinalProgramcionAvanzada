package edu.programacion.avanzada.aluismarte.ProyectoFinal.service;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.PaymentMethod;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.payment.CreatePaymentMethodRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.payment.DeletePaymentMethodRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.payment.UpdatePaymentMethodRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentMethodService {

    private final PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethodDTO> getAll() {
        return paymentMethodRepository.findAll().stream().map(PaymentMethod::toDTO).collect(Collectors.toList());
    }

    public PaymentMethodDTO get(Long id) {
        return paymentMethodRepository.findById(id).orElseThrow().toDTO();
    }

    public PaymentMethodDTO create(CreatePaymentMethodRequest createPaymentMethodRequest) {
        PaymentMethod paymentMethod = paymentMethodRepository.save(createPaymentMethodRequest.toPaymentMethod());
        return paymentMethod.toDTO();
    }

    public PaymentMethodDTO update(UpdatePaymentMethodRequest updatePaymentMethodRequest) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(updatePaymentMethodRequest.getId()).orElseThrow();
        paymentMethod.applyChanges(updatePaymentMethodRequest);
        paymentMethodRepository.save(paymentMethod);
        return paymentMethod.toDTO();
    }

    public void delete(DeletePaymentMethodRequest deletePaymentMethodRequest) {
        paymentMethodRepository.deleteById(deletePaymentMethodRequest.getId());
    }
}
