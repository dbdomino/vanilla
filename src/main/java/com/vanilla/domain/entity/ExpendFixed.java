package com.vanilla.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ExpendFixed extends Expend {


    private int fixDay;

    private String groupId;



}
