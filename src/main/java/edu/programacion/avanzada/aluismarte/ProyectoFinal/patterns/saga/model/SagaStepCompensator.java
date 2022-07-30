package edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model;

public interface SagaStepCompensator<T> {

    void handle(SagaPayload<T> sagaPayload);
}
