package com.vanilla.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.vanilla.entity.LoginHistory}
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class LoginHistoryDto implements Serializable {
    private final Long loginHistoryId;
    private final String id;
    private final LocalDateTime loginDatetime;
    private final String loginIp;
}