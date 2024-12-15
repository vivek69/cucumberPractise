package awesomeCucumber.stepdef;

import java.util.List;
import java.util.Map;

import awesomeCucumber.objects.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

public class DataTableStepDef {
@DataTableType
/*
 // Multiple Rows with Header with Map
 public Customer customerEntryAgain(Map<String,String> entry) {
	return new Customer(entry.get("username"),entry.get("password"));
}


public Customer customerEntry(List<String> entry) {
	return new Customer(entry.get(0),entry.get(1));
}
*/

	

@Given("My credentials")
public void myCredentials(DataTable dataTable) {
 //List<String>cred= dataTable.values();
	List<String>cred= dataTable.row(0);
 
 System.out.println("username "+cred.get(0));
 System.out.println("password "+cred.get(1));
}


@Given("My credentials with Multiple Row With no Header")
//public void my_credentials_with_multiple_row_with_no_header(DataTable dataTable) {
public void my_credentials_with_multiple_row_with_no_header(List<List<String>>all) {
       //        List<List<String>>all=dataTable.asLists();
               System.out.println("First row username  "+all.get(0).get(0));
               System.out.println("First row Password  "+all.get(0).get(1));
               System.out.println("Second row username  "+all.get(1).get(0));
               System.out.println("Second row Pssword  "+all.get(1).get(1));
}


//72 video
@Given("My credentials with Map Data Table directly with domain object")
public void my_credentials_with_map_data_table_directly_with_domain_object(List<Customer> customer) {
    System.out.println("Row 0 username "+customer.get(0).getUsername());
    System.out.println("Row 0 Password "+customer.get(0).getPassword());
    System.out.println("Row 1 username "+customer.get(1).getUsername());
    System.out.println("Row 1 Password "+customer.get(1).getPassword());
}

//74 video

@Given("My credentials with Multiple Rows with Header")
public void my_credentials_with_multiple_rows_with_header(List<Map<String, String>> customers) {
    System.out.println("Row 0 username "+customers.get(0).get("username"));
    System.out.println("Row 0 password "+customers.get(0).get("password"));
    System.out.println("Row 1 username "+customers.get(1).get("username"));
    System.out.println("Row 1 password "+customers.get(1).get("password"));
}

@Given("Map Data Table directly with domain object with Map")
public void map_data_table_directly_with_domain_object_with_map(List<Customer> customers) {
	System.out.println("Username 0 "+customers.get(0).getUsername());
	System.out.println("Password 0 "+customers.get(0).getPassword());
	System.out.println("Username 1 "+customers.get(1).getUsername());
	System.out.println("Password 1 "+customers.get(1).getPassword());
    
}


}
