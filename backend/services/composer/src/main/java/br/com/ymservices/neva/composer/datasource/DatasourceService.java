package br.com.ymservices.neva.composer.datasource;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class DatasourceService <T extends Datasource> extends CrudServiceImpl<Datasource> {

    public DatasourceService(DatasourceRepository repository) {
        super(repository);
    }

}
