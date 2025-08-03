package com.vanilla.dto;

import lombok.Getter;

import java.io.Serializable;

/** @since  2024-12-28
 * @author dbdomino
 * @version 1.0
 * DTO for {@link com.vanilla.entity.Ammount}
 */
@Getter
public class AmmountDto implements Serializable {
    Long id;
    String memberId;
    String amountName;
    int amount;
    String ammountType;
}
