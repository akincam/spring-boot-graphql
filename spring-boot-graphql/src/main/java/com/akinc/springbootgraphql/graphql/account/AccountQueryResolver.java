package com.akinc.springbootgraphql.graphql.account;

import com.akinc.springbootgraphql.model.response.AccountResponse;
import com.akinc.springbootgraphql.service.account.AccountService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountQueryResolver implements GraphQLQueryResolver{

    private final AccountService accountService;

    public AccountResponse getAccountById(Long id) {
        return accountService.getAccountById(id);
    }
}
