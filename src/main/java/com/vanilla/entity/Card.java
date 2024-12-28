package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter @Setter
public class Card extends CuDate {

    @Id @GeneratedValue
    @Comment("카드 Id")
    private int id;

    @Comment("회원Id")
    @Column(nullable = false)
    private String memberId;

    @Comment("카드 담당은행")
    private String cardBank;

    @Comment("카드 이름")
    private String cardName;

    @Comment("카드 종류")
    private String cardType;

    @Comment("카드 설명")
    private String cardMemo;

}
