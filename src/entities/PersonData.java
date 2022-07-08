package entities;

public class PersonData {

  private String name;
  private int accNumber;
  private double balance;

  public PersonData(String name, int accNumber) {
    this.name = name;
    this.accNumber = accNumber;
  }

  public PersonData(String name, int accNumber, double initialDeposit) {
    this.name = name;
    this.accNumber = accNumber;
    deposit(initialDeposit);
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAccNumber() {
    return this.accNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount + 5.0;
  }

  public String toString() {
    return "Account " + this.accNumber + ", Holder: " + this.name + ", Balance: $" + this.balance;
  }
  
}
