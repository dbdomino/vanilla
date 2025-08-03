package com.vanilla.mapper;

import com.vanilla.dto.ExpendDto;
import com.vanilla.entity.Expend;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {ExpendGroupMapper.class, PaymentMethodMapper.class})
public interface ExpendMapper {
    Expend toEntity(ExpendDto expendDto);

    ExpendDto toDto(Expend expend);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Expend partialUpdate(ExpendDto expendDto, @MappingTarget Expend expend);
}