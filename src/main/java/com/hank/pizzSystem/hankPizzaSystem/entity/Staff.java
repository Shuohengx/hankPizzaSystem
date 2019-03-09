package com.hank.pizzSystem.hankPizzaSystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class Staff implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstName;
  private String lastName;
  private String email;

  @Column(nullable = false, unique = false)
  private LocalDate addressLine;

  @Column(nullable = false, unique = false)
  private String postcode;

  @Column(nullable = false, unique = false)
  private String state;

  @Column(nullable = false, unique = false)
  private String country;



  @Column(nullable = false, unique = false)
  private String telephoneNumber;

  private String password;
  private boolean enabled;
  private boolean tokenExpired;




  @Column(nullable = false, unique = false)
  private LocalDate createdTime;

  @Column(nullable = false, unique = false)
  private LocalDate lastUpdateTime;



//JsonIgnore
  @JsonIgnore
  @ManyToMany
  @JoinTable(
      name = "staff_roles",
      joinColumns = @JoinColumn(
          name = "staff_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id"))
  private Collection<Role> roles;

  public Staff() {

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  public Long getId() {
    return id;
  }

  public Collection<Role> getRoles() {
    return roles;
  }

  public void setRoles(Collection<Role> roles) {
    this.roles = roles;
  }
}
