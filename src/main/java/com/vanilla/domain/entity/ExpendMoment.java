package com.vanilla.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class ExpendMoment extends Expend {
//    @Id @GeneratedValue
//    private Long expendMomentId;

    private LocalDate expendDate;

    private String expendLocation;

    // 연관관계
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classification_id")
//    private Long classificationId;
    private ExpendClassification classificationId;

    // 연관관계
    private Long paymentMethodId;



//    // Default constructor
//    public ExpendMoment() {}
//
//    // Parameterized constructor
//    public ExpendMoment(Long expendMomentId, String memberId) {
//        this.expendMomentId = expendMomentId;
//        this.memberId = memberId;
//    }
//
//    // Equals and HashCode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ExpendMoment expendMoment = (ExpendMoment) o;
//        return expendMomentId.equals(expendMoment.expendMomentId) &&
//                memberId.equals(expendMoment.memberId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(expendMomentId, memberId);
//    }


}
