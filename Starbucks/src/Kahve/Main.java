package Kahve;

public class Main {
    public static void main(String[] args) throws Exception {
    //BaseCustomerManager customerManager = new NeroCustomerManager();
    BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

    Customer customer = new Customer(1, "Ali", "Veli", 1990, "12345123451");

    customerManager.save(customer);

        System.out.println("ok");

    }
}
