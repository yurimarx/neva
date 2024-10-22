package br.com.ymservices.neva.composer.businessentity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/business-entities")
public class BusinessEntityController extends CrudController<BusinessEntity, BusinessEntityRequest, BusinessEntityResponse> {

    public BusinessEntityController(BusinessEntityService<BusinessEntity> service,
            BusinessEntityMapper mapper) {
        super(service, mapper);
    }   
    
}