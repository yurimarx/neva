package br.com.ymservices.neva.composer.feature;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface FeatureMapper extends CrudMapper<Feature, FeatureRequest, FeatureResponse> {
    
    @Mapping(source = "businessEntityId", target = "businessEntity.id") 
    @Mapping(ignore = true, target = "dataField")
    Feature requestToEntity(FeatureRequest source);

    @Mapping(source = "businessEntity.id", target = "businessEntityId")
    @Mapping(source = "businessEntity.name", target = "businessEntityName")
    FeatureResponse entityToResponse(Feature source);
}
