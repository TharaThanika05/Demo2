package Features;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ABSBinding {
private String string;

@Given("^I am \"([^\"]*)\"$")
public void i_am_something(String strArg1) throws Throwable {
System.out.println("Data is :"+string);
    }

		
		
@Given("^I am A$")
public void i_am_a() throws Throwable {
	System.out.println("**I do B");
}

@When("^I am B$")
public void i_am_b() throws Throwable {
	System.out.println("**I get C");
    
    }


@Then("^I get c$")
public void i_get_c() throws Throwable {
    
}



@Given("I am reading a name and age")
public void i_am_reading_a_name_and_age(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
}
@When("I enter the above provided name")
public void i_enter_the_above_provided_name() {
    // Write code here that turns the phrase above into concrete actions
  
}


}
