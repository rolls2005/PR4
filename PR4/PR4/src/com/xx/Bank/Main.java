package com.xx.Bank;

import static com.xx.Bank.ui.MenuHandler.startMenu;
import com.xx.Bank.model.Account;
import com.xx.Bank.logic.BankCard;
import com.xx.Bank.logic.AuthenticationService;
import com.xx.Bank.model.Person;
import com.xx.Bank.model.Product;


public class Main {

  public static void main(String[] args) {
    Person[] people = Person.personCreate();
    Account.createAccountsForPeople(people);

    Product[] product =Product.createProducts();
    Person authenticatedPerson = AuthenticationService.performAuthentication(people);
    BankCard card = BankCard.generateBankCardForAccount(authenticatedPerson.getAccount());

    if (authenticatedPerson != null) {
      System.out.println("Авторизація успішна");
      authenticatedPerson.displayInfo();
      card.displayInfo();
      startMenu(authenticatedPerson.getAccount(),card);
    } else {
      System.out.println("Невірне ім'я користувача або пароль.");
    }
  }
}