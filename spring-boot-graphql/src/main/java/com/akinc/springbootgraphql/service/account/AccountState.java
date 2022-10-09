package com.akinc.springbootgraphql.service.account;

import lombok.Getter;

@Getter
public enum AccountState {

    ACTIVE,
    PASSIVE,
    NEEDS_ACTIVATION;

}
