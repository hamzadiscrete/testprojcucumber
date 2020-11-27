package Featuredefs;

import Methods.Methodss;
import Methods.Methodss2;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runner.a1runnerr;
import runner.a2runnerr;

/**
 * Hello world!
 *
 */
public class featuredefss2 


{
	
	Methodss2 mt2 = new Methodss2();
    a2runnerr c2 = new a2runnerr();

	
	
	   
		@Given("^Homepage12$")
		public void homepage2() {
			c2.setEnv12();
		}

		@Then("^Login12$")
		public void login2() {
			 mt2.loginmt12();

		    
		    
		}

		@Then("^Bye12$")
		public void bye2() {
			 mt2.byemt12();
		  //  throw new PendingException();
		}


}
