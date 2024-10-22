package br.com.ymservices.neva.composer.rule;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ymservices.neva.composer.crud.CrudController;

@RestController
@RequestMapping("/rules")
public class RuleController extends CrudController<Rule, RuleRequest, RuleResponse> {

    public RuleController(RuleService<Rule> service,
            RuleMapper mapper) {
        super(service, mapper);
    }   
    
}
