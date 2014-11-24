package dk.cphbusiness.dummy.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Person {
  private static Map<String,Person> items = new HashMap<>();

  public static Collection<Person> list() {
    return items.values();
    }
  
  public static Person find(String email) {
    return items.get(email);
    }
  
  private String email;
  private String firstName;
  private String lastName;
  private int age;

  public Person(String email, String firstName, String lastName, int age) {
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    items.put(email, this);
    }

  public String getEmail() {
    return email;
    }

  public void setEmail(String email) {
    this.email = email;
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

  public int getAge() {
    return age;
    }

  public void setAge(int age) {
    this.age = age;
    }
  
  }
