package com.marcilio.cursomc.services;

import com.marcilio.cursomc.domain.Categoria;
import com.marcilio.cursomc.repositories.CategoriaRepository;
import com.marcilio.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {
        Categoria obj = categoriaRepository.findOne(id);
        if (obj == null) {
            throw new ObjectNotFoundException("Objeto não encontrado Id: " + id
                + ", tipo: " + Categoria.class.getName());
        }
        return obj;
    }

}
