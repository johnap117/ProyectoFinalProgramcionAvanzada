package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.handler.product;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.product.CreateProductCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Product;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = CreateProductCommand.class)
@Slf4j
public class CreateProductCommandHandler implements CommandHandler<CreateProductResponse, CreateProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public CreateProductResponse handle(CreateProductCommand createProductCommand) {
        Product product = productRepository.save(createProductCommand.toProduct());
        log.info("Product {} created", product.getId());
        return CreateProductResponse.builder()
                .product(product.toDTO())
                .build();
    }
}
