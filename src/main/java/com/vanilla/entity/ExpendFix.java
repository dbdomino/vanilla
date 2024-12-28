package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
/** @since  2024-12-28
 * @author dbdomino
 * @version 1.0
 */
@Entity
@Table(name = "tbl_expend_fix")
@Builder(toBuilder = true)
@Getter @Setter
public class ExpendFix extends CuDate {

    @Id @GeneratedValue
    @Comment("고정지출 Id")
    private Long expendFixId;

    @NotBlank
    @Comment("회원 Id")
    private String memberId;

    @NotBlank
    @Comment("고정지출 이름")
    private String expendFixName;

    @Comment("출금일")
    private int outDay = 1;

    @Comment("고정지출 설명")
    private String expendFixDetail;

    @Comment("고정지출 타입  0: 하얀색, 1: 주황색, 2: 옅은 회색, 그외 검은색 배경으로")
    private String expendFixType;

    @Comment("고정지출 상태  0: 비활성, 1: 활성")
    private int expendFixStat=1;

    protected ExpendFix() {}

}
