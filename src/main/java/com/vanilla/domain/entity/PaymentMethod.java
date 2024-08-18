package com.vanilla.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PaymentMethod {
    @Id @GeneratedValue
    private Long paymentMethodId;
    @NotEmpty
    private String paymentMethodName;
    @NotEmpty
    private String memberId;
    private String sequence= "0";

}
