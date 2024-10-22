package br.com.ymservices.neva.composer.datafield;

import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.dataset.Dataset;
import br.com.ymservices.neva.composer.feature.Feature;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "data_field")
public class Datafield extends CrudEntity {

    private String title;
    private String description;
    private String script;
    @ManyToOne
    @JoinColumn(name = "dataset")
    private Dataset dataset;
    @OneToOne
    @JoinColumn(name = "feature")
    private Feature feature;
    
}
