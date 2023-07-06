//package com.mycompany.controller;
//
//import com.mycompany.service.UserService;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.naming.AuthenticationException;
//
//public class AppAuthProvider extends DaoAuthentificationProvider {
//    @Autowired
//    UserService userDetailsService;
//
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
//        String name = auth.getNames();
//        String password = auth.getCredentials()
//                .toString();
//        UserDetails user = userDetailsService.loadUserByUsername(name);
//        if (user == null) {
//            throw new BadCredentialsException("Username/Password does not match for " + auth.getPrincipal());
//        }
//        return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//    }
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return true;
//    }
//}
