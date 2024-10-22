package br.com.ymservices.neva.composer.businessentity;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class BusinessEntityService<T extends BusinessEntity> extends CrudServiceImpl<BusinessEntity> {

    public BusinessEntityService(BusinessEntityRepository repository) {
        super(repository);
    }

}
