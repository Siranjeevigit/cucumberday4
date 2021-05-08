package com.stepdefinition;

import com.base.LibGlobal;
import com.manager.PageObjectManager;
import com.pages.BookHotel;
import com.pages.BookingConfirmation;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends LibGlobal{
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	SearchHotel search;
	SelectHotel hotel;
	BookHotel book;
	BookingConfirmation con;
	
	@Given("User on the adactin page")
	public void user_on_the_adactin_page() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		
	}
    @When("User should enter{string} and {string}")
	public void user_should_enter_and(String userName, String userPassword) {
    	pageObjectManager=PageObjectManager.getInstance();
    	 loginPage=pageObjectManager.getLoginpage();
    	// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		type(loginPage.getTxtUserName(),userName);
		type(loginPage.getTxtUserPassword(),userPassword);
		}
      @When("User click the login button")
	public void user_click_the_login_button() {
		btnClick(loginPage.getBtnClick());
        }

	@When("User should select {string},{string},{string},{string},{string}and{string}")
	public void user_should_select_and(String location, String hotels, String roomType, String noOfRoom, String adult, String child) 
	{
		search=pageObjectManager.getSearch();
		select(search.getLoc(),location);
		select(search.getHot(),hotels);
		select(search.getRoom(),roomType);
		select(search.getNoRoom(),noOfRoom);
		select(search.getAdu(),adult);
		select(search.getChi(),child);
		}

	@When("User click search button")
	public void user_click_search_button() {
		
		btnClick(search.getBtnClick());
	 }

	@When("User select hotel button")
	public void user_select_hotel_button() {
		hotel= pageObjectManager.getHotel();
		
		btnClick(hotel.getRadiobutton());
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
		btnClick(hotel.getBtnClick());
	}
	@When("User should select {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_select_and(String firstName, String lastName, String address, String credits, String cardType, String endMnth, String endYr, String cvv) {
		book=pageObjectManager.getBook();
        type(book.getFirst(),firstName);
		type(book.getLast(),lastName);
		type(book.getAdd(),address);
		type(book.getCre(),credits);
		select(book.getCard(),cardType);
		select(book.getMonth(),endMnth);
		select(book.getYear(),endYr);
		type(book.getCv(),cvv);
		}

	@When("User click the book now button")
	public void user_click_the_book_now_button() {
		btnClick(book.getBtnClick());
			 }

	@Then("User should  booking  successfully")
	public void user_should_booking_successfully() throws InterruptedException {
		con=  pageObjectManager.getCon();
		 Thread.sleep(5000);
	     System.out.println(con.getOrderno().getAttribute("value"));
          
        quitBrowser();
}

}
