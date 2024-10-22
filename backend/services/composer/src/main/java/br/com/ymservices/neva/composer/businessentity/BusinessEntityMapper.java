package br.com.ymservices.neva.composer.businessentity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BusinessEntityMapper extends CrudMapper<BusinessEntity, BusinessEntityRequest, BusinessEntityResponse> {
    
    @Mapping(ignore = true, target = "scenarios")
    @Mapping(source = "source.businessUnitId", target = "businessUnit.id")
    BusinessEntity requestToEntity(BusinessEntityRequest source);

    @Mapping(source = "source.businessUnit.id", target = "businessUnitId")
    BusinessEntityResponse entityToResponse(BusinessEntity source);
}
