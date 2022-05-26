package org.backend.Service;

import org.backend.Models.AccountDTO;

import java.util.List;

public interface AccountService {
	
	List<AccountDTO> getAll();

    boolean insert(AccountDTO account);

    boolean insertAuthorities(String username, String authorities);

    boolean update(String id, AccountDTO account);

    boolean delete(String id);

    AccountDTO getByUserName(String userName);

    List<String> getUserRoles(String username);
}
