package com.chaaw.repository;

import com.chaaw.model.Crudibli;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CrudibliRepository implements PanacheRepositoryBase<Crudibli, String> {
}
