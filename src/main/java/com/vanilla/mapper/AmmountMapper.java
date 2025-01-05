package com.vanilla.mapper;

import com.vanilla.dto.response.AmmountResponseDto;
import com.vanilla.dto.service.AmmountServiceDto;
import com.vanilla.entity.Ammount;
import org.mapstruct.Mapper;

import java.util.List;
/** @since  2024-12-28
 * @author dbdomino
 * @version 1.0
 * Ammount DTO Mapper
 */
@Mapper(componentModel = "spring")
public interface AmmountMapper {
//    AmmountMapper INSTANCE = Mappers.getMapper(AmmountMapper.class);
    // 매핑 메서드 예시
    AmmountServiceDto toServiceDto(Ammount entity);
    AmmountResponseDto toResponseDto(AmmountServiceDto entity);
    Ammount toEntity(AmmountServiceDto dto);
    List<AmmountServiceDto> toServiceDtoList(List<Ammount> ammountList);
    List<AmmountResponseDto> toResponseDtoList(List<AmmountServiceDto> serviceDtoList);
    // dto와 dto간의 매핑도 가능,
}
