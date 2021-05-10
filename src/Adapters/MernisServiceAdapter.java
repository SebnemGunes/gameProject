package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import MernisService.BDVKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean _checkIfRealPerson(Customer customer) {
        BDVKPSPublicSoap client=new BDVKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),customer.getFullName(),customer.getSurname(),customer.getDateOfBirth().getYear());
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }
}
