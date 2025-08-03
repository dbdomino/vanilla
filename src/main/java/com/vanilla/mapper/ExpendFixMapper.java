package com.vanilla.mapper;

import com.vanilla.dto.ExpendFixDto;
import com.vanilla.entity.ExpendFix;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExpendFixMapper {
    ExpendFix toEntity(ExpendFixDto expendFixDto);

    ExpendFixDto toDto(ExpendFix expendFix);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ExpendFix partialUpdate(ExpendFixDto expendFixDto, @MappingTarget ExpendFix expendFix);
}