package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Getter @Setter
public abstract class Expend extends CuDate {
    @Id
    @GeneratedValue
    @Comment("지출 ID")
    private Long Id;

    @Comment("회원Id")
    @Column(nullable = false)
    private String memberId;

    @Comment("지출 이름")
    private String expendName;

    @Comment("지출 금액")
    private Long expendCost;

    @Comment("지출 메모")
    private String expendMemo;

    @Comment("상태, 0: 활성, 1: 결제취소, 2: 삭제")
    private int stat;

    @JoinColumn(name = "expendGroupId") // 외래 키 컬럼명 설정
    @OneToOne(fetch = FetchType.LAZY)
    @Comment("지출 그룹 Id")
    private ExpendGroup expendGroup;

    @JoinColumn(name = "paymentMethodId")
    @OneToOne(fetch = FetchType.LAZY)
    @Comment("결제 방법 ID")
    private PaymentMethod paymentMethod;


}
