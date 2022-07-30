package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.DeleteAddressCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = DeleteAddressCommand.class)
@Slf4j
public class DeleteAddressCommandHandler implements CommandHandler<DeleteAddressResponse, DeleteAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public DeleteAddressResponse handle(DeleteAddressCommand deleteAddressCommand) {
        addressRepository.deleteById(deleteAddressCommand.getId());
        log.info("Address {} deleted", deleteAddressCommand.getId());
        return DeleteAddressResponse.builder()
                .build();
    }
}
