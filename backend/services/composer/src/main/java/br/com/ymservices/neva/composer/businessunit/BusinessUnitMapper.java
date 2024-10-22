package br.com.ymservices.neva.composer.businessunit;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import br.com.ymservices.neva.composer.crud.CrudMapper;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BusinessUnitMapper extends CrudMapper<BusinessUnit, BusinessUnitRequest, BusinessUnitResponse> {
    
    BusinessUnit requestToEntity(BusinessUnitRequest source);

    BusinessUnitResponse entityToResponse(BusinessUnit source);
}
