package com.akinc.springbootgraphql.model.response;

import com.akinc.springbootgraphql.service.account.AccountState;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {

    private Long id;

    private String name;

    private AccountState state;
}

