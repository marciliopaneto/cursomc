package com.marcilio.cursomc.services;

import com.marcilio.cursomc.domain.Pedido;
import com.marcilio.cursomc.repositories.PedidoRepository;
import com.marcilio.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {
        Pedido obj = pedidoRepository.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado Id: " + id
                + ", tipo: " + Pedido.class.getName());
        }
        return obj;
    }

}
