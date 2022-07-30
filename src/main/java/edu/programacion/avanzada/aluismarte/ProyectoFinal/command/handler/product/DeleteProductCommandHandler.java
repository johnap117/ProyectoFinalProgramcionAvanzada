package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.handler.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product.DeleteProductCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = DeleteProductCommand.class)
@Slf4j
public class DeleteProductCommandHandler implements CommandHandler<DeleteProductResponse, DeleteProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public DeleteProductResponse handle(DeleteProductCommand deleteProductCommand) {
        productRepository.deleteById(deleteProductCommand.getId());
        log.info("Product {} deleted", deleteProductCommand.getId());
        return DeleteProductResponse.builder()
                .build();
    }
}