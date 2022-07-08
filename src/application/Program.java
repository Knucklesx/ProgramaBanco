package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonData;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    PersonData personData;

    System.out.println("Enter client name: ");
    String name = sc.nextLine();
    System.out.println("Enter client account number: ");
    int accNumber = sc.nextInt();

    System.out.println("Is there an initial deposit? (y/n)");
    char answer = sc.next().charAt(0);

    if (answer == 'y') {
      System.out.println("Enter initial deposit amount: ");
      double initialDeposit = sc.nextDouble();
      personData = new PersonData(name, accNumber, initialDeposit);
    } else {
      personData = new PersonData(name, accNumber);
    }

    System.out.println();
    System.out.println(personData);
    System.out.println();



    System.out.println("Enter a deposit amount: ");
    double depositAmount = sc.nextDouble();
    personData.deposit(depositAmount);

    System.out.println();
    System.out.println(personData);
    System.out.println();


    System.out.println("Enter a withdraw amount: ");
    double withdrawAmount = sc.nextDouble();
    personData.withdraw(withdrawAmount);

    System.out.println();
    System.out.println(personData);
    System.out.println();


 

    sc.close();

  }
  
}
