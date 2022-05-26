package org.backend.Service;

import org.backend.DAO.AccountDAO;
import org.backend.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account ac = accountDAO.getByUserName(username);

        if (ac == null) {
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }

        List<String> roles = accountDAO.getUserRoles(username);
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

        if (roles != null) {
            for (String role : roles) {
                GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role);
                grantList.add(authority);
            }
        }

        UserDetails userDetails = new User(ac.getUsername(), ac.getPassword(), grantList);
        return userDetails;
    }
}
