package Kahve;

public class StarbucksCustomerManager extends BaseCustomerManager{

    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this._customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (_customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }else {
            System.out.println("Not valid person");
        }
    }
}
