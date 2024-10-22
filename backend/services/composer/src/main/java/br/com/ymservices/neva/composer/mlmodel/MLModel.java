package br.com.ymservices.neva.composer.mlmodel;

import br.com.ymservices.neva.composer.crud.CrudEntity;
import br.com.ymservices.neva.composer.scenario.Scenario;
import jakarta.persistence.Column;
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
@Table(name = "mlmodel")
public class MLModel extends CrudEntity {

    private String title;
    private String description;
    @Column(name = "create_model")
    private String createModel;
    @Column(name = "train_model")
    private String trainModel;
    @Column(name = "validate_model")
    private String validateModel;
    @Column(name = "execute_model")
    private String executeModel;
    @ManyToOne
    @JoinColumn(name = "scenario")
    private Scenario scenario;
}
