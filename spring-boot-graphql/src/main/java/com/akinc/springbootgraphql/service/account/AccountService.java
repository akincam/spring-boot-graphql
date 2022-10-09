package com.akinc.springbootgraphql.service.account;

import com.akinc.springbootgraphql.model.response.AccountResponse;

public interface AccountService {

    AccountResponse getAccountById(Long id);

}
