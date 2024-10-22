package br.com.ymservices.neva.composer.scenario;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class ScenarioService <T extends Scenario> extends CrudServiceImpl<Scenario> {

    public ScenarioService(ScenarioRepository repository) {
        super(repository);
    }

}
