package Adapters;

import Abstruct.ICustomerCheckService;
import Entities.Customer;
 
public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		 
		return true;
	}
	
}
