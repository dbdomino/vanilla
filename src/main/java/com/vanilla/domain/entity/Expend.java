package com.vanilla.domain.entity;

import com.vanilla.domain.entity.superclass.CuDate;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Getter @Setter
public abstract class Expend extends CuDate {
    @Id
    @GeneratedValue
    private Long Id;

    private String memberId;
//    private Long expendId;
    private String expendName;
    private Long expendCost;
    private String expendMemo;
    private String stat;
    private String sequence;

}
