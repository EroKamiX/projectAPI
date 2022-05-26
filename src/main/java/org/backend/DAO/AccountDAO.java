package org.backend.DAO;

import org.backend.Entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountDAO {
	
    List<Account> getAll();

    boolean insert(Account account);

    boolean insertAuthorities(String username, String authorities);

    boolean update(String id, Account account);

    boolean delete(String id);

    Account getByUserName(String userName);

    List<String> getUserRoles(String username);
    
    Account getSignIn(String username, String password);
}
