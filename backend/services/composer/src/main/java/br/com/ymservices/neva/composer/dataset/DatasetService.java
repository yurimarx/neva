package br.com.ymservices.neva.composer.dataset;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class DatasetService<T extends Dataset> extends CrudServiceImpl<Dataset> {

    public DatasetService(DatasetRepository repository) {
        super(repository);
    }

}
