package Kahve;

public class Main {
    public static void main(String[] args) {
    BaseCustomerManager customerManager = new NeroCustomerManager();

    Customer customer = new Customer(1, "Ali", "Veli", 2000, "12345612345");

    customerManager.save(customer);








    }
}
