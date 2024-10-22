package br.com.ymservices.neva.composer.dataset;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/datasets")
public class DatasetController extends CrudController<Dataset, DatasetRequest, DatasetResponse> {

    public DatasetController(DatasetService<Dataset> service,
            DatasetMapper mapper) {
        super(service, mapper);
    }   
    
}