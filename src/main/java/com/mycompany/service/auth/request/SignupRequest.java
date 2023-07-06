package com.mycompany.service.auth.request;

import java.util.Set;

public class SignupRequest {

  private String noms;

  private String email;

  private Set<String> role;

  private String password;

  public String getNoms() {
    return noms;
  }

  public void setNoms(String noms) {
    this.noms = noms;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
