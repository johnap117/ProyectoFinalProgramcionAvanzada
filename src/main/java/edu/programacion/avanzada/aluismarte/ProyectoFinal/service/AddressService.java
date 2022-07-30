package edu.programacion.avanzada.aluismarte.ProyectoFinal.service;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.GetAddressCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.GetAllAddressCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.address.CreateAddressRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.address.DeleteAddressRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.request.address.UpdateAddressRequest;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final CommandBus commandBus;

    public GetAddressResponse getAll(Integer pageSize, Integer page, String name) {
        return commandBus.sendCommand(GetAllAddressCommand.builder().pageSize(pageSize).page(page).name(name).build());
    }

    public GetAddressResponse get(Long id) {
        return commandBus.sendCommand(GetAddressCommand.builder().id(id).build());
    }

    public CreateAddressResponse create(CreateAddressRequest createAddressRequest) {
        return commandBus.sendCommand(createAddressRequest.toCommand());
    }

    public UpdateAddressResponse update(UpdateAddressRequest updateAddressRequest) {
        return commandBus.sendCommand(updateAddressRequest.toCommand());
    }

    public DeleteAddressResponse delete(DeleteAddressRequest deleteAddressRequest) {
        return commandBus.sendCommand(deleteAddressRequest.toCommand());
    }
}
