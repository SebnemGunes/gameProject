package Abstracts;

import Entities.Customer;

public interface CustomerService {
    public void signUp(Customer customer);
    public void update(Customer customer);
    public void delete(Customer customer);

}
