package br.com.ymservices.neva.composer.businessunit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/business-units")
public class BusinessUnitController extends CrudController<BusinessUnit, BusinessUnitRequest, BusinessUnitResponse> {

    public BusinessUnitController(BusinessUnitService<BusinessUnit> service,
            BusinessUnitMapper mapper) {
        super(service, mapper);
    }   
    
}