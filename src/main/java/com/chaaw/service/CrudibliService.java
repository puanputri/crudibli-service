package com.chaaw.service;

import com.chaaw.model.Crudibli;
import com.chaaw.repository.CrudibliRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.List;

@ApplicationScoped
public class CrudibliService {
    @Inject
    CrudibliRepository crudibliRepository;

    public List<Crudibli> getCrudiblis() {
        return crudibliRepository.listAll();
    }

    @Transactional
    public void addCrudibli(Crudibli crudibli) {
        crudibliRepository.persist(crudibli);
    }

    @Transactional
    public void updateCrudibli(String crudibliId, Crudibli crudibli) {
        Crudibli crudibli1 = crudibliRepository.findById(crudibliId);
        crudibli.setName(crudibli.getName());
    }

    @Transactional
    public void deleteCrudibli(String crudibliId) {
        crudibliRepository.deleteById(crudibliId);
    }
}
