package br.com.ymservices.neva.composer.feature;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/features")
public class FeatureController extends CrudController<Feature, FeatureRequest, FeatureResponse> {

    public FeatureController(FeatureService<Feature> service,
            FeatureMapper mapper) {
        super(service, mapper);
    }   
    
}
