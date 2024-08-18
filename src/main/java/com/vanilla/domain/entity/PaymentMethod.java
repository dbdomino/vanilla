package com.vanilla.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PaymentMethod {
    @Id @GeneratedValue
    private Long paymentMethodId;

    private String paymentMethodName;
    private String memberId;
    private String sequence;

}
