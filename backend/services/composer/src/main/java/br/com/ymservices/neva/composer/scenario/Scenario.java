package br.com.ymservices.neva.composer.scenario;

import br.com.ymservices.neva.composer.businessunit.BusinessUnit;
import br.com.ymservices.neva.composer.crud.CrudEntity;
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
@Table(name = "scenario")
public class Scenario extends CrudEntity {

    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "business_unit")
    private BusinessUnit businessUnit;
}
