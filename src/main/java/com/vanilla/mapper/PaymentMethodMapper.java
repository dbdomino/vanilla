package com.vanilla.mapper;

import com.vanilla.dto.PaymentMethodDto;
import com.vanilla.entity.PaymentMethod;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMethodMapper {
    PaymentMethod toEntity(PaymentMethodDto paymentMethodDto);

    PaymentMethodDto toDto(PaymentMethod paymentMethod);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PaymentMethod partialUpdate(PaymentMethodDto paymentMethodDto, @MappingTarget PaymentMethod paymentMethod);
}