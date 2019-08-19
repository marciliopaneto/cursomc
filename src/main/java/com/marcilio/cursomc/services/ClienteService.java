package com.marcilio.cursomc.services;

import com.marcilio.cursomc.domain.Cliente;
import com.marcilio.cursomc.repositories.ClienteRepository;
import com.marcilio.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Cliente obj = clienteRepository.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado Id: " + id
                + ", tipo: " + Cliente.class.getName());
        }
        return obj;
    }

}
