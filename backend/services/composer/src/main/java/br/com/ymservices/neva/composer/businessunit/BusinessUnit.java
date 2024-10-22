package br.com.ymservices.neva.composer.businessunit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import br.com.ymservices.neva.composer.crud.CrudEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@Entity
@Table(name = "business_unit")
public class BusinessUnit extends CrudEntity {

    private String acronym;
    private String description;
}
