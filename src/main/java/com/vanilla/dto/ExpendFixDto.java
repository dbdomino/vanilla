package com.vanilla.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.vanilla.entity.ExpendFix}
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class ExpendFixDto implements Serializable {
    private final LocalDateTime dateCreate;
    private final LocalDateTime dateUpdate;
    private final Long expendFixId;
    @NotBlank
    private final String memberId;
    @NotBlank
    private final String expendFixName;
    private final int outDay;
    private final String expendFixDetail;
    private final String expendFixType;
    private final int expendFixStat;
}