package com.vanilla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter @Setter
public class Ammount {
    @Id @GeneratedValue
    @Comment("재산 Id")
    private int id;

    @Comment("회원Id")
    @Column(nullable = false)
    private String memberId;

    @Comment("재산 이름")
    private String amountName;

    @Comment("금액")
    private int amount;

    @Comment("재산 종류 0: 은행 잔고  1: 예금,  2: 적금   3: 기타")
    private String ammountType;

}
