package edu.programacion.avanzada.aluismarte.ProyectoFinal.model.exceptions;

public class BadSagaException extends RuntimeException {

    public BadSagaException() {
        super("Error en el Saga");
    }
}
