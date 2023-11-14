package com.manfashion.manfashion.service.impl;

import com.manfashion.manfashion.model.entity.User;
import com.manfashion.manfashion.model.entity.UserRole;
import com.manfashion.manfashion.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AppUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public AppUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository
                .findByEmail(email)
                .map(AppUserDetailsService::map)
                .orElseThrow(() -> new UsernameNotFoundException("User " + email + " not found!"));
    }

    private static UserDetails map(User user) {
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getPassword())
                .authorities(user.getRoles().stream().map(AppUserDetailsService::map).toList())
                .build();
    }

    private static GrantedAuthority map(UserRole userRoleEntity) {
        return new SimpleGrantedAuthority(
                "ROLE_" + userRoleEntity.getRole().name()
        );
    }

}

