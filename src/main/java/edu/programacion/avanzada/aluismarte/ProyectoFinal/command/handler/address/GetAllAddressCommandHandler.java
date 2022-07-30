package edu.programacion.avanzada.aluismarte.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.aluismarte.ProyectoFinal.command.address.GetAllAddressCommand;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.aluismarte.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAllAddressCommand.class)
@Slf4j
public class GetAllAddressCommandHandler implements CommandHandler<GetAddressResponse, GetAllAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public GetAddressResponse handle(GetAllAddressCommand getAllAddressCommand) {
        log.debug("Get Addresses {}", getAllAddressCommand.toString());
        List<AddressDTO> addressDTOS = addressRepository.findAllByNameContainingIgnoreCase(
                        getAllAddressCommand.getName(),
                        PageRequest.of(getAllAddressCommand.getPage(), getAllAddressCommand.getPageSize()))
                .stream()
                .map(Address::toDTO)
                .collect(Collectors.toList());
        return GetAddressResponse.builder()
                .addresses(addressDTOS)
                .build();
    }
}
