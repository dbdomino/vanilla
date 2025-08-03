package com.vanilla.mapper;

import com.vanilla.dto.LoginHistoryDto;
import com.vanilla.entity.LoginHistory;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoginHistoryMapper {
    LoginHistory toEntity(LoginHistoryDto loginHistoryDto);

    LoginHistoryDto toDto(LoginHistory loginHistory);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    LoginHistory partialUpdate(LoginHistoryDto loginHistoryDto, @MappingTarget LoginHistory loginHistory);
}