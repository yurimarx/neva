package br.com.ymservices.neva.composer.datafield;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class DatafieldService <T extends Datafield> extends CrudServiceImpl<Datafield> {

    public DatafieldService(DatafieldRepository repository) {
        super(repository);
    }

}
