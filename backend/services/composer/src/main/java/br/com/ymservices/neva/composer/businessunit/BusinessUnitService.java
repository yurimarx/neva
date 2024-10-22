package br.com.ymservices.neva.composer.businessunit;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class BusinessUnitService<T extends BusinessUnit> extends CrudServiceImpl<BusinessUnit> {

    public BusinessUnitService(BusinessUnitRepository repository) {
        super(repository);
    }

}
