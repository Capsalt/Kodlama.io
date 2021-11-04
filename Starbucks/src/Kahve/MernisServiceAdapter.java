package Kahve;

import mernisServicesReferences.VMBKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        VMBKPSPublicSoap client = new VMBKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.tcNo, customer.firstName.toUpperCase(),
                customer.lastName.toUpperCase(), customer.dateOfBirth);
    }
}
