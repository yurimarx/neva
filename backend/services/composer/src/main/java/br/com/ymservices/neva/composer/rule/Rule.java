package br.com.ymservices.neva.composer.rule;

import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.scenario.Scenario;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
@Table(name = "rule")
public class Rule extends CrudEntity{

    private String title;
    private String description;
    private String script;
    @ManyToOne
    @JoinColumn(name = "scenario")
    private Scenario scenario;
}
