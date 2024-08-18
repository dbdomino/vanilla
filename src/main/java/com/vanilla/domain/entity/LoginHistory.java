package com.vanilla.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class LoginHistory {
    @Id @GeneratedValue
    private Long loginHistoryId;

    private LocalDateTime loginDatetime;
    private String loginHistoryMemo;
    private String memberId;
    private String loginIp;
    private String stat;


}
