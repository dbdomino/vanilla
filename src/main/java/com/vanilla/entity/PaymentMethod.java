package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter @Setter
public class PaymentMethod extends CuDate {
    @Id @GeneratedValue
    @Comment("결제 방법 ID")
    private Long paymentMethodId;

    @NotEmpty
    @Comment("회원 ID")
    private String memberId;

    @NotEmpty
    @Comment("결제 방법 이름")
    private String paymentMethodName;

    @NotEmpty
    @Comment("정렬 순서")
    private String sequence= "0";

}
