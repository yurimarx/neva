package br.com.ymservices.neva.composer.mlmodel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/ml-models")
public class MLModelController extends CrudController<MLModel, MLModelRequest, MLModelResponse> {

    public MLModelController(MLModelService<MLModel> service,
            MLModelMapper mapper) {
        super(service, mapper);
    }   
    
}