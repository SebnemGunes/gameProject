import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Sale;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
     CustomerManager customerManager=new CustomerManager(new MernisServiceAdapter());
     customerManager.signUp (new Customer(   "1","Sebnem","Gunes","333333", LocalDate.of(1999,5,1)));
     System.out.println(" "); System.out.println(" ");
     GameManager gameManager=new GameManager();
     gameManager.add(new Game(1,"Hollow Knight",50,45));
     gameManager.add(new Game(2,"Call Of Duty",100,65));
     gameManager.add(new Game(3,"The Sims 4",80,60));
     System.out.println(" "); System.out.println(" ");

   
    }
}
