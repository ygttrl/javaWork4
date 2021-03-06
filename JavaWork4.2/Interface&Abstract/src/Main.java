import java.time.LocalDate;

import Abstruct.BaseCustomerManager;

import Concreate.CustomerCheckManager;
import Concreate.NeroCustomerManager;
import Concreate.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerCheckManager  checkManager = new CustomerCheckManager();
		BaseCustomerManager customerManager = new SturbucksCustomerManager(checkManager);
		customerManager.Save(new Customer(1,"Engin","Demiro?",LocalDate.now(),"28881321832"));
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.Save(new Customer(2,"Ay?e","Can",LocalDate.now(),"28888514851832"));
	}

}
