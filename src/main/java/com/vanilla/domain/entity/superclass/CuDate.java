package com.vanilla.domain.entity.superclass;


import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter @Setter
public abstract class CuDate {
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;
}
