package com.vanilla.domain.entity;

import com.vanilla.domain.entity.superclass.CuDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member extends CuDate {
    @Id
    private String memberId;

    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private String memberAddress;
    private String memberPw;
    private String memberType;
    private String memberDel;


}
