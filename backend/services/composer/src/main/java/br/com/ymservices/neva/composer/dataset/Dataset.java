package br.com.ymservices.neva.composer.dataset;

import br.com.ymservices.neva.composer.businessunit.BusinessUnit;
import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.datasource.Datasource;
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
@Table(name = "dataset")
public class Dataset extends CrudEntity {

    private String title;
    private String description;
    private String script;
    @ManyToOne
    @JoinColumn(name = "business_unit")
    private BusinessUnit businessUnit;
    @ManyToOne
    @JoinColumn(name = "scenario")
    private Scenario scenario;
    @ManyToOne
    @JoinColumn(name = "datasource")
    Datasource datasource;
}
