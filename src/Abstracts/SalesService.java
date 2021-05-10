package Abstracts;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Sale;



public interface SalesService {
    public void add(Sale sale, Game game, Customer customer, Campaign campaign);
    public void delete(Sale sale);
    public void update(Sale sale);
    public void addAll(Sale[] sales);

}
