package com.vanilla.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;
/** @since  2024-12-28
 * @author dbdomino
 * @version 1.0
*/
@Entity
@Table(name = "tbl_login_history")
@Builder(toBuilder = true)
@Getter @Setter
public class LoginHistory {
    @Id @GeneratedValue
    @Comment("로그인 이력 기본키")
    private Long loginHistoryId;

    @Comment("로그인 Id")
    private String id;
    @Comment("로그인 시간")
    private LocalDateTime loginDatetime;
    @Comment("로그인 주소")
    private String loginIp;

    protected LoginHistory() {}

}
