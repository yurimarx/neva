package br.com.ymservices.neva.composer.crud;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class CrudEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;
    protected String name;
    
}
