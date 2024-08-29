package com.devsu.accounts.movements.service;

import com.devsu.accounts.movements.api.dto.AccountDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AccountService {

    List<AccountDTO> getAllAccounts();
    Optional<AccountDTO> getAccountById(String accountNumber);
    AccountDTO createAccount(AccountDTO accountDTO);
    Optional<AccountDTO> updateAccount(String accountNumber, AccountDTO accountDTO);

    Optional<AccountDTO> partiallyUpdateAccount(String accountNumber, Map<String, Object> accountMap);
    Optional<AccountDTO> deleteAccount(String accountNumber);
}
