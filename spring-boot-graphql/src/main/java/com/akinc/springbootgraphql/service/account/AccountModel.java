package com.akinc.springbootgraphql.service.account;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {

    private Long id;

    private String name;

    private AccountState accountState;
}
