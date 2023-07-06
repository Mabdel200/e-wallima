package com.mycompany.service.auth.response;

import java.util.List;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id_users;
  private String noms;
  private String email;
  private final List<String> roles;

  public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles) {
    this.token = accessToken;
    this.id_users = id;
    this.noms = username;
    this.email = email;
    this.roles = roles;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Long getId() {
    return id_users;
  }

  public void setId(Long id) {
    this.id_users = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return noms;
  }

  public void setUsername(String username) {
    this.noms = username;
  }

  public List<String> getRoles() {
    return roles;
  }
}
