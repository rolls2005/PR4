package com.xx.Bank.model;

public class Product {
  private String name;
  private String description;
  private double price;
  
  public Product(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
  
  public String getName() {
    return name;
  }
  
  public double getPrice() {
    return price;
  }

  public static Product[] createProducts() {
    Product[] products = new Product[10];

    products[0] = new Product("Олія", "Оливкова олія", 50.0);
    products[1] = new Product("Хліб", "Італійський хліб", 30.0);
    products[2] = new Product("Вишні", "Свіжі вишні, 500 г", 70.0);
    products[3] = new Product("Апельсини", "Апельсиновий сік", 50.0);
    products[4] = new Product("Курка", "Філе курки", 120.0);
    products[5] = new Product("Цвітна капуста", "Квіткова капуста", 40.0);
    products[6] = new Product("Ананас", "Солодкий ананас", 30.0);
    products[7] = new Product("Кава", "Арабіка, 100 г", 40.0);
    products[8] = new Product("Пшоно", "Пшоно, 500 г", 45.0);
    products[9] = new Product("Фета", "Фета, 200 г", 70.0);

    return products;
  }
}
