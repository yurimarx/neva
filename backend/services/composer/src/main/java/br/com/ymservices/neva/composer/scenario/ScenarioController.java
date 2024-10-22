package br.com.ymservices.neva.composer.scenario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/scenarios")
public class ScenarioController extends CrudController<Scenario, ScenarioRequest, ScenarioResponse> {

    public ScenarioController(ScenarioService<Scenario> service,
            ScenarioMapper mapper) {
        super(service, mapper);
    }   
    
}
