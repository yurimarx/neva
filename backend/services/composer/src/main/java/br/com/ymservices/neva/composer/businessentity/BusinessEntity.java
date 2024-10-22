package br.com.ymservices.neva.composer.businessentity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

import br.com.ymservices.neva.composer.businessunit.BusinessUnit;
import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.scenario.Scenario;

@SuperBuilder
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "business_entity")
public class BusinessEntity extends CrudEntity {

    private String title;
    private String description;
    private String script;
    @ManyToOne
    @JoinColumn(name = "business_unit")
    private BusinessUnit businessUnit;
    @ManyToMany
    @JoinTable(
        name = "scenario_business_entity", 
        joinColumns = @JoinColumn(name = "business_entity"), 
        inverseJoinColumns = @JoinColumn(name = "scenario"))
    private List<Scenario> scenarios;
}
