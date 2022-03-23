package com.pagemanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom_for_adactin.Confirm_page;
import pom_for_adactin.Continue_page;
import pom_for_adactin.Home_page;
import pom_for_adactin.Hotel_details;
import pom_for_adactin.Personal_details;

public class Pageobjectmanager_Adactin {
	public WebDriver driver;
	private Home_page hp;
	private Hotel_details hd;
	private Personal_details pd;
	private Continue_page cp;
	private Confirm_page cfm;
	
	public Pageobjectmanager_Adactin(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public Home_page getinstance_hp() {
		if (hp==null) {
			hp=new Home_page(driver);
		}
		 
		return hp;

	}

		public Hotel_details getinstance_hd() {
			if (hd==null) {
				hd=new Hotel_details(driver);
			}
			
			return hd;
			
			
}

		public Personal_details getpersonal_details_pd() {
			if (pd==null) {
			
				pd=new Personal_details(driver);
			}
			
			return pd;
			

		}
		public Continue_page getcontinue_page_cp() {
			if (cp==null) {
				cp=new Continue_page(driver);
			}
			cp=new Continue_page(driver);
			return cp;
			

		}
		
		public Confirm_page getinstanceconfirm_page_cfm() {
			if (cfm==null) {
				cfm=new Confirm_page(driver);
			}
			
			return cfm;
			

		}
}
