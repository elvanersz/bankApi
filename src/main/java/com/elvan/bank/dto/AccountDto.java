package com.elvan.bank.dto;


import com.elvan.bank.model.Currency;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class AccountDto implements Serializable {

    private String id;
    private String customerId;
    private Double balance;
    private Currency currency;
}
