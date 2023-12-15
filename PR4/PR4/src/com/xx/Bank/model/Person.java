package com.xx.Bank.model;

import com.xx.Bank.logic.BankCard;
import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private String username;
  private String password;
  private Account account;  // Обліковий запис (може бути null)
  private List<BankCard> bankCards;
  
  public Person(String name, String username, String password) {
    this.name = name;
    this.username = username;
    this.password = password;
    this.bankCards = new ArrayList<>();
  }
  
  public String getName() {
    return name;
  }
  
  public Account getAccount() {
    return account;
  }
  
  public void setAccount(Account account) {
    this.account = account;
  }
  
  public void displayInfo() {
    System.out.println("Ім'я: " + name);
    System.out.println("Ім'я користувача: " + username);
    
    if (account != null) {
      System.out.println("Номер акаунту: " + account.getAccountNumber());
      
      
      if (account.getOwner() == this) {
        System.out.println("Ви є власником цього аккаунту.");
      } else {
        System.out.println("Ви довірений користувач цього облікового запису.");
      }
      
      List<BankCard> cards = account.getAssociatedCards();
      for (BankCard card : cards) {
        System.out.println("Номер карти: " + card.getCardNumber());
      }
    } else {
      System.out.println("Інформація про аккаунт відсутня.");
    }
  }
  public boolean authenticate(String enteredUsername, String enteredPassword) {
    return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
  }
  
  public static Person[] personCreate() {
    Person[] people = new Person[5];
    
    people[0] = new Person("Оксана", "Oksana32", "oksana32");
    people[1] = new Person("Орест", "Orest78", "orest78");
    people[2] = new Person("Денис", "Denis65", "denis65");
    people[3] = new Person("Олександр", "Sasha48", "sasha48a");
    people[4] = new Person("Єва", "Eva59", "eva59");
    
    return people;
  }
}