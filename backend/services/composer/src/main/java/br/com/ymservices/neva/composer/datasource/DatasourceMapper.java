package br.com.ymservices.neva.composer.datasource;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(componentModel = "spring")
public interface DatasourceMapper extends CrudMapper<Datasource, DatasourceRequest, DatasourceResponse> {
    
    @Mapping(ignore = true, target = "scenarios")
    @Mapping(source = "businessUnitId", target = "businessUnit.id")
    Datasource requestToEntity(DatasourceRequest source);

    @Mapping(source = "businessUnit.id", target = "businessUnitId")
    @Mapping(source = "businessUnit.name", target = "businessUnitName")
    DatasourceResponse entityToResponse(Datasource source);
}
