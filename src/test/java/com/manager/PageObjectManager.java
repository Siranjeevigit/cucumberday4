package com.manager;

import com.base.LibGlobal;
import com.pages.BookHotel;
import com.pages.BookingConfirmation;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

public class PageObjectManager extends LibGlobal  {
	
	
	private static PageObjectManager pageObjectManager;
	private LoginPage loginPage;
	private SearchHotel search;
	private SelectHotel hotel;
	private BookHotel book;
	private BookingConfirmation con;
	
     private PageObjectManager() {
		
	} 
     public static PageObjectManager getInstance() {
    	
    	 return (pageObjectManager==null)?pageObjectManager=new PageObjectManager():pageObjectManager;
    }
	public LoginPage getLoginpage() {
		 if (driver.getCurrentUrl().contains("adactinhotelapp")) {
			 pageObjectManager = null;
			 loginPage = null;
	}
		return( loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotel getSearch() {
		return( search==null)?search=new SearchHotel():search;
	}
	public SelectHotel getHotel() {
		return( hotel==null)?hotel=new SelectHotel():hotel;
	}
	public BookHotel getBook() {
		return (book==null)?book=new BookHotel():book;
	}
	public BookingConfirmation getCon() {
		return (con==null)?con=new BookingConfirmation():con;
	}
	
	
	
	 

}
 