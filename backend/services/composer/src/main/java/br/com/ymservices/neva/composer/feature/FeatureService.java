package br.com.ymservices.neva.composer.feature;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class FeatureService <T extends Feature> extends CrudServiceImpl<Feature> {

    public FeatureService(FeatureRepository repository) {
        super(repository);
    }

}
