package br.com.ymservices.neva.composer.rule;

import org.springframework.stereotype.Service;

import br.com.ymservices.neva.composer.crud.CrudServiceImpl;

@Service
public class RuleService <T extends Rule> extends CrudServiceImpl<Rule> {

    public RuleService(RuleRepository repository) {
        super(repository);
    }

}
