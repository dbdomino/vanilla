package com.vanilla.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.vanilla.entity.PaymentMethod}
 */
@AllArgsConstructor
@Getter
public class PaymentMethodDto implements Serializable {
    private final LocalDateTime dateCreate;
    private final LocalDateTime dateUpdate;
    private final Long paymentMethodId;
    @NotEmpty
    private final String memberId;
    @NotEmpty
    private final String paymentMethodName;
    @NotEmpty
    private final String sequence;
}