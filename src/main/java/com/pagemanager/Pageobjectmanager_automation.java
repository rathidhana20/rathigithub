package com.pagemanager;

import org.openqa.selenium.WebDriver;

import com.pom_for_automation.Back;
import com.pom_for_automation.Bank;
import com.pom_for_automation.Confirm;
import com.pom_for_automation.Homepage1;
import com.pom_for_automation.Homepage2;
import com.pom_for_automation.Homepage3;
import com.pom_for_automation.Homepage4;
import com.pom_for_automation.Logout;
import com.pom_for_automation.Proceed1;
import com.pom_for_automation.Proceed2;
import com.pom_for_automation.Proceed3;
import com.pom_for_automation.Product1;
import com.pom_for_automation.Product2;
public class Pageobjectmanager_automation {
	public WebDriver driver;
	private Homepage1 hp1;
	private Homepage2 hp2;
	private Homepage3 hp3;
	private Homepage4 hp4;
	private Product1 p1;
	private Product2 p2;
	private Proceed1 pc1;
	private Proceed2 pc2;
	private Proceed3 pc3;
	private Bank b;
	private Confirm c1;
	private Back b1;
	private Logout lg;
	
	
	public Pageobjectmanager_automation(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public Homepage1 getinstancehp1() {
		if (hp1==null) {
			hp1=new Homepage1(driver);	
		}
		return hp1;
		

	}
	
	public Homepage2 getinstancehp2() {
		if (hp2==null) {
			hp2=new Homepage2(driver);
		}
		
		return hp2;

		
	}
     public Homepage3 getinstancehp3() {
    	 if (hp3==null) {
    		 hp3= new Homepage3(driver);
		}
		return hp3;

	}
     public Product1 getinstancep1() {
    	 if (p1==null) {
    		 p1=new Product1(driver);
		}
    	 return p1;
    	 
		

	}
     
     public Homepage4 getinstancehp4() {
    	if (hp4==null) {
    		 hp4=new Homepage4(driver);
		}
	  return hp4;

	}
     public Product2 getinstancep2() {
		if (p2==null) {
			p2=new Product2(driver);
		}
		return p2;
}
     public Proceed1 getinstancepc1() {
    	if (pc1==null) {
    		 pc1= new Proceed1(driver);
		}
		return pc1;

	}
   
     public Proceed2 getinstancepc2() {
		if (pc2==null) {
			pc2= new Proceed2(driver);
		}
				return pc2;
		

	}
      public Proceed3 getinstancepc3() {
		if (pc3==null) {
			pc3=new Proceed3(driver);
		}
		return pc3;

	}
      
      public Bank getinstanceb() {
    	 if (b==null) {
    		 b= new Bank(driver);
			
		}
    	  return b;
		

	}
     
     public Confirm getinstancec1() {
		if (c1==null) {
			c1=new Confirm(driver);
		}
		return c1;
	}
     public Back getinstanceb1() {
		if (b1==null) {
			b1=new Back(driver);
			
		}
    	 return b1;

	}
     
     public Logout getinstancelg() {
    	 if (lg==null) {
    		 lg=new Logout(driver);
		}
		return lg;

	}
     
     
     
     
}
