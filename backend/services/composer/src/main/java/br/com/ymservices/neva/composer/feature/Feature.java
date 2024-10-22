package br.com.ymservices.neva.composer.feature;

import br.com.ymservices.neva.composer.businessentity.BusinessEntity;
import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.datafield.Datafield;
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
@Table(name = "feature")
public class Feature extends CrudEntity{

    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "business_entity")
    private BusinessEntity businessEntity;
    @OneToOne(mappedBy = "feature")
    private Datafield dataField;    
}
