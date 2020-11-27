package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pom.pomm;
import runner.a1runnerr;

public class Methodss extends a1runnerr {
	
	 pomm p = new pomm();
	 //static WebDriver driver = null;
	 
	 public void byemt() {
			// TODO Auto-generated method stub
			System.out.println("bye");
		}
	 
	 public void byemt2() {
			// TODO Auto-generated method stub
			System.out.println("bye2");
		}

		public void loginmt() {
		//	System.out.println("login");	
		
			
			
				
				String b = driver.findElement(By.xpath(p.findtext)).getText();
			//	b.getText();
			System.out.println(b);
		
				
				//System.out.println(p.verifytexthomestr);
		//	System.out.println("login");
		//	System.out.println("login");
			}
		
		
		public void loginmt2() {
			//	System.out.println("login");	
			
				//System.out.println(p.s);
				//System.out.println(p.verifytexthomestr);
					//String ss=p.s;
					//System.out.println(lss);
					
					String b = driver.findElement(By.xpath(p.findtext)).getText();
				//	b.getText();
				System.out.println(b);
			
					
					//System.out.println(p.verifytexthomestr);
			//	System.out.println("login");
			//	System.out.println("login");
				}
		}

	

