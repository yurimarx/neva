package br.com.ymservices.neva.composer.datasource;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

import br.com.ymservices.neva.composer.businessunit.BusinessUnit;
import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.scenario.Scenario;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
@Table(name = "datasource")
public class Datasource extends CrudEntity {

    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "business_unit")
    BusinessUnit businessUnit;
    @ManyToMany
    @JoinTable(
        name = "scenario_datasource", 
        joinColumns = @JoinColumn(name = "datasource"), 
        inverseJoinColumns = @JoinColumn(name = "scenario"))
    private List<Scenario> scenarios;
}
