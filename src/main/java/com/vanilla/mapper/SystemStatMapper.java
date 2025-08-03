package com.vanilla.mapper;

import com.vanilla.dto.SystemStatDto;
import com.vanilla.entity.SystemStat;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SystemStatMapper {
    SystemStat toEntity(SystemStatDto systemStatDto);

    SystemStatDto toDto(SystemStat systemStat);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SystemStat partialUpdate(SystemStatDto systemStatDto, @MappingTarget SystemStat systemStat);
}