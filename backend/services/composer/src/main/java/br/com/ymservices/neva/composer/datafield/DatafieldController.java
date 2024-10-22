package br.com.ymservices.neva.composer.datafield;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/datafields")
public class DatafieldController extends CrudController<Datafield, DatafieldRequest, DatafieldResponse> {

    public DatafieldController(DatafieldService<Datafield> service,
            DatafieldMapper mapper) {
        super(service, mapper);
    }   
    
}
