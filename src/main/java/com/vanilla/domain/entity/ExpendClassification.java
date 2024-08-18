package com.vanilla.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@NamedQuery( // name ="StaticQuery"   이런식으로 그냥 써도 되지만, 엔티티명.쿼리명 으로 쓰는게 관례 라고 함.
        name = "ExpendClassification.findByUsername",
        query = "select m from ExpendClassification m where m.memberId = :memberId" // 쿼리 이상할 경우컴파일에러로 스프링 실행안됨. (이게 장점이라고 함)
)
@Entity
@Getter @Setter
public class ExpendClassification {
    @Id @GeneratedValue
    private Long classificationId;
    @NotBlank
    private String memberId;

    @NotBlank
    private String classificationName;
    @NotNull
    private Long limitCost;
    @NotBlank
    private String sequence;
    @NotBlank
    private String stat;

    /*
    @NotBlank: 빈 문자열 또는 공백 문자열을 허용하지 않습니다.
    @NotNull: null 값을 허용하지 않습니다.
     */

}
