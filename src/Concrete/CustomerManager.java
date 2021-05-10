package Concrete;

import Abstracts.CustomerService;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
    private CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        super();
        this.customerCheckService =customerCheckService;
    }

    @Override
    public void signUp(Customer customer) {
        if (customerCheckService._checkIfRealPerson(customer)){
            System.out.println("A valid customer or gamer "+customer.getFullName());
        }else{
            System.out.println("Not a valid gamer");
        }
    }

    @Override
    public void update(Customer customer) {
        if (customerCheckService._checkIfRealPerson(customer)){
            System.out.println("A valid customer or gamer "+customer.getFullName());
        }else{
            System.out.println("UPDATE FAILED, a valid gamer");
        }
    }

    @Override
    public void delete(Customer customer) {
      System.out.println("Customer deleted "+customer.getFullName());
    }
}
