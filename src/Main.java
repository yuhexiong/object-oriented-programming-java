import java.util.GregorianCalendar;

import encapsulation.BankAccount;

import polymorphism.Food;
import polymorphism.Notebook;
import polymorphism.Product;

import inheritance.Car;
import inheritance.Motorcycle;

public class Main {
    public static void main(String[] args) {
        // Abstraction Example
        System.out.println("test for Abstraction");
        abstraction.Animal dog = new abstraction.Dog();
        System.out.println("dog bark " + dog.makeSound());
        abstraction.Animal cat = new abstraction.Cat();
        System.out.println("cat bark " + cat.makeSound());
        System.out.println("=======================================");

        // Encapsulation Example
        System.out.println("test for Encapsulation");
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("=======================================");

        // Polymorphism Example
        System.out.println("test for Polymorphism");

        Notebook nb = new Notebook("Asus Notebook", 50000,365);
        Product item = nb;
        System.out.println(item.desc());

        GregorianCalendar calendar = new GregorianCalendar(2019,2,10);
        Food food = new Food("肉鬆",100,calendar.getTime());
        Product item2 = food;

        Product[] items = new Product[]{nb,food};
        buy(items);
        System.out.println("We can buy nb and food because they are Products");

        System.out.println("After convert nb from Notebook to Product, is it Notebook?");
        System.out.println(item instanceof Notebook);
        System.out.println("After convert item2 from Food to Product, is it Food?");
        System.out.println(item2 instanceof Food);
        System.out.println("=======================================");

        // Inheritance Example
        System.out.println("test for Inheritance");
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        myCar.start();
        myMotorcycle.start();
        System.out.println("Both Car and Motorcycle can use start");
    }

    public static void buy(Product[] ps){
        int sum = 0;
        for (Product eachItem : ps) {
            System.out.println("買入: " + eachItem.desc());
            sum = sum + eachItem.getPrice();
        }
        System.out.println("總金額: " + sum);
    }
}
