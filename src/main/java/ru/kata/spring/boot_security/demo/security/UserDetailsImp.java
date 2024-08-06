//package ru.kata.spring.boot_security.demo.security;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

//public class UserDetailsImp implements UserDetails{
//    private final User user;
//
//    public UserDetailsImp(User user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        return user.getRole().stream()
//                .map(RoleGrantedAuthorityImp::new)
//                .collect(Collectors.toSet());
//
//    }
//
//
//    public Long getId() {
//        return user.getId();
//    }
//
//    public String getName() {
//        return user.getName();
//    }
//
//    public String getLastname() {
//        return user.getLastname();
//    }
//
//    public Long getAge() {
//        return user.getAge();
//    }
//
//    public String getEmail() {
//        return user.getEmail();
//    }
//    public Collection<Role> getRole() {
//        return user.getRole();
//    }
//    public User getPerson() {
//        return this.user;
//    }
//    @Override
//    public String getPassword() {
//        return this.user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return this.user.getEmail();
//    }
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//}

