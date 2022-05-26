package org.backend.Service.impl;

import org.backend.DAO.AccountDAO;
import org.backend.Entity.Account;
import org.backend.Models.AccountDTO;
import org.backend.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceIMPL implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public List<AccountDTO> getAll() {
        List<AccountDTO> lsDTO = new ArrayList<>();
        List<Account> ls = accountDAO.getAll();
        for (Account ac : ls) {
            AccountDTO acDT = new AccountDTO();
            acDT.setUsername(ac.getUsername());
            acDT.setPassword(ac.getPassword());
            acDT.setTeacherId(ac.getTeacherId());
            acDT.setStudentId(ac.getStudentId());
            acDT.setAuthority(ac.getAuthority());
            acDT.setEnabled(ac.isEnabled());
            lsDTO.add(acDT);
        }
        return lsDTO;
    }

    @Override
    public boolean insert(AccountDTO account) {
        Account ac = new Account();
        ac.setUsername(account.getUsername());
        ac.setPassword(account.getPassword());
        ac.setStudentId(account.getStudentId());
        ac.setTeacherId(account.getTeacherId());
        ac.setAuthority(account.getAuthority());
        ac.setEnabled(account.isEnabled());
        return accountDAO.insert(ac);
    }

    @Override
    public boolean insertAuthorities(String username, String authorities) {
        return accountDAO.insertAuthorities(username, authorities);
    }

    @Override
    public boolean update(String id, AccountDTO account) {
        Account ac = new Account();
        ac.setUsername(account.getUsername());
        ac.setPassword(account.getPassword());
        ac.setStudentId(account.getStudentId());
        ac.setTeacherId(account.getTeacherId());
        ac.setAuthority(account.getAuthority());
        return accountDAO.update(id, ac);
    }

    @Override
    public boolean delete(String id) {
        return accountDAO.delete(id);
    }


    @Override
    public AccountDTO getByUserName(String userName) {
        Account ac = accountDAO.getByUserName(userName);
        AccountDTO adto = new AccountDTO();
        adto.setUsername(ac.getUsername());
        adto.setPassword(ac.getPassword());
        adto.setStudentId(ac.getStudentId());
        adto.setTeacherId(ac.getTeacherId());
        return adto;
    }

    @Override
    public List<String> getUserRoles(String username) {
        return accountDAO.getUserRoles(username);
    }
}
