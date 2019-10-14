package org.debugroom.test.spring.security.app.web.security;

import java.util.Collection;

import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
public class CustomUserDetails implements UserDetails {

    private final Collection<GrantedAuthority> authorities;

    @Override
    public Collection<GrantedAuthority> getAuthorities(){
        return authorities;
    }

    @Override
    public String getPassword(){
        // return your user password.
        return "{noop}test";
    }

    @Override
    public String getUsername(){
        // return your user loginId.
        return "test";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
