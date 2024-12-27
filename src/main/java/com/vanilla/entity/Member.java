package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Member extends CuDate {
    @Id
    private String memberId;
    private String memberPw;

    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private String memberAddress;

    private String memberType= "N3";
    private String memberDel = "N";


//    public List<PaymentMethod> getPaymentMethods() {
//
//        return paymentMethods;
//    }

    public void setMember(String memberId, String memberPw, String memberName, String memberEmail,String memberPhone,String memberAddress ){
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberAddress = memberAddress;

    }



}
