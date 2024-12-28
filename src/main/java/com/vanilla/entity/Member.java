package com.vanilla.entity;

import com.vanilla.entity.superclass.CuDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;

@Entity
@Getter @Setter @ToString
public class Member extends CuDate {
    @Id @Column(nullable = false, unique = true)
    @Comment("회원 id")
    private String id;

    @Comment("회원 PW")
    @NotEmpty
    private String pw;

    @Comment("회원 이름")
    private String name;
    @Comment("회원 이메일")
    private String email;
    @Comment("회원 휴대폰번호")
    private String phone;
    @Comment("회원 주소")
    private String address;

    @Comment("회원 유형 0: 일반 사용자  1: 관리자")
    private String type = "0";
    @Comment("회원 삭제유무")
    private String isDel = "N";


    // Default constructor (required by JPA)
    public Member() {
    }

    // Constructor with fields
    public Member(String id, String pw) {
        this.id = id;
        this.pw = name;
    }



    @Override
    public String toString() {
        return "ExampleEntity{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

    public void setMember(String memberId, String memberPw, String memberName, String memberEmail,String memberPhone,String memberAddress ){
        this.id = memberId;
        this.pw = memberPw;
        this.name = memberName;
        this.email = memberEmail;
        this.phone = memberPhone;
        this.address = memberAddress;

    }



}
