package com.vanilla.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ExpendClassification {
    @Id @GeneratedValue
    private Long classificationId;

    private String memberId;

    private String classificationName;

    private Long limitCost;

    private String sequence;

    private String stat;



}
