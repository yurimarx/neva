package br.com.ymservices.neva.composer.datasource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/datasources")
public class DatasourceController extends CrudController<Datasource, DatasourceRequest, DatasourceResponse> {

    public DatasourceController(DatasourceService<Datasource> service,
            DatasourceMapper mapper) {
        super(service, mapper);
    }   
    
}
