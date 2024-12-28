package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
public class SystemStat extends CuDate {
    @Id @GeneratedValue
    @Comment("사용자별 시스템 설정 Id")
    private Long id;

    @NotBlank
    @Comment("회원 Id")
    private String memberId;

    @NotBlank
    @Comment("기본 결제수단")
    private String systemPayment;

    @Comment("기본 가계부 정렬")
    private String systemSequence;


}
