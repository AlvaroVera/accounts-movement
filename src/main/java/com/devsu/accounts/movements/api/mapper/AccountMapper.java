package com.devsu.accounts.movements.api.mapper;

import com.devsu.accounts.movements.api.dto.AccountDTO;
import com.devsu.accounts.movements.domain.entities.Account;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

@Component
public class AccountMapper {
    public AccountDTO toDTO(Account account) {
        if (account == null) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountId(account.getAccountId());
        accountDTO.setAccountNumber(account.getAccountNumber());
        accountDTO.setAccountType(account.getAccountType());
        accountDTO.setBalance(account.getBalance());
        accountDTO.setPreviousBalance(account.getPreviousBalance());
        accountDTO.setStatus(account.getStatus());
        accountDTO.setClientId(account.getClientId());

        return accountDTO;
    }

    public Account toEntity(AccountDTO accountDTO) {
        if (accountDTO == null) {
            return null;
        }

        Account account = new Account();
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setAccountType(accountDTO.getAccountType());
        account.setBalance(accountDTO.getBalance());
        account.setPreviousBalance(accountDTO.getPreviousBalance());
        account.setStatus(accountDTO.getStatus());
        account.setClientId(accountDTO.getClientId());

        return account;
    }

    public void updateEntityFromDTO(AccountDTO accountDTO, Account account) {
        if (accountDTO == null) {
            return;
        }

        if (accountDTO.getAccountNumber() != null) {
            account.setAccountNumber(accountDTO.getAccountNumber());
        }
        if (accountDTO.getAccountType() != null) {
            account.setAccountType(accountDTO.getAccountType());
        }
        if (accountDTO.getBalance() != null) {
            account.setBalance(accountDTO.getBalance());
        }
        if (accountDTO.getPreviousBalance() != null) {
            account.setPreviousBalance(accountDTO.getPreviousBalance());
        }
        if (accountDTO.getStatus() != null) {
            account.setStatus(accountDTO.getStatus());
        }
    }

    public void updateEntityPartial(Map<String, Object> accountMap, Account account) {
        if (accountMap.get("accountNumber") != null) {
            account.setAccountNumber((String) accountMap.get("accountNumber"));
        }



        if (accountMap.get("accountNumber") != null) {
            account.setAccountNumber((String) accountMap.get("accountNumber"));
        }
        if (accountMap.get("accountType") != null) {
            account.setAccountType((String) accountMap.get("accountType"));
        }
        if (accountMap.get("balance") != null) {
            account.setBalance((BigDecimal) accountMap.get("balance"));
        }
        if (accountMap.get("previousBalance") != null) {
            account.setPreviousBalance((BigDecimal) accountMap.get("previousBalance"));
        }
        if (accountMap.get("status") != null) {
            account.setStatus((String) accountMap.get("status"));
        }
    }
}
