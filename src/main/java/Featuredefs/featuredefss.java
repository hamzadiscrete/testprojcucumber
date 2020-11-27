package Featuredefs;

import Methods.Methodss;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runner.a1runnerr;

/**
 * Hello world!
 *
 */
public class featuredefss 


{
	
	Methodss mt = new Methodss();
    a1runnerr c = new a1runnerr();
    
    
	@Given("^Homepage$")
	public void homepage()  {
		c.setEnv();
	}

	@Then("^Login$")
	public void login()  {
		 mt.loginmt();

	    
	    
	}

	@Then("^Bye$")
	public void bye()  {
		 mt.byemt();
	  //  throw new PendingException();
	}

	//-----------------------
	
	
	   
		@Given("^Homepage2$")
		public void homepage2() {
			c.setEnv();
		}

		@Then("^Login2$")
		public void login2() {
			 mt.loginmt2();

		    
		    
		}

		@Then("^Bye2$")
		public void bye2() {
			 mt.byemt2();
		  //  throw new PendingException();
		}


}
