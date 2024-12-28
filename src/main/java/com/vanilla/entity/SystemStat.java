package com.vanilla.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
public class SystemStat {
    @Id @GeneratedValue
    @Comment("사용자별 시스템 설정 Id")
    private Long id;



}
