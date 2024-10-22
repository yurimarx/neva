package br.com.ymservices.neva.composer.mlmodel;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class MLModelService <T extends MLModel> extends CrudServiceImpl<MLModel> {

    public MLModelService(MLModelRepository repository) {
        super(repository);
    }

}
