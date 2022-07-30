package edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.saga.model;

public interface SagaStepHandler<T> {

    void handle(SagaPayload<T> sagaPayload);
}
