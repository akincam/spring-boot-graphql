package com.akinc.springbootgraphql.service.account;

import com.akinc.springbootgraphql.model.response.AccountResponse;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private final List<AccountModel> accountList = new ArrayList<>();

    @PostConstruct
    void setUp() {
        accountList.addAll(List.of(AccountModel.builder().id(1L).name("Test User - 1").accountState(AccountState.NEEDS_ACTIVATION).build(),
                                   AccountModel.builder().id(2L).name("Test User - 2").accountState(AccountState.ACTIVE).build()));
    }

    @Override
    public AccountResponse getAccountById(Long id) {
        return accountList.stream()
                          .filter(a -> a.getId().equals(id))
                          .map(a -> AccountResponse.builder().id(a.getId()).name(a.getName()).state(a.getAccountState()).build())
                          .findFirst()
                          .orElseThrow(IllegalArgumentException::new);
    }

}
