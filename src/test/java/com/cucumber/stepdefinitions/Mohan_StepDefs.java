package com.cucumber.stepdefinitions;

import java.util.Hashtable;

import org.apache.log4j.Logger;

import com.cucumber.helper.UserActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mohan_StepDefs {

	private static Logger Log = Logger.getLogger(UserActions.class.getName());

	UserActions User;
	Hashtable<String,String> Data;

	public Mohan_StepDefs(UserActions User) {
		this.User = User;
	}
	
	@Given("User is loggedin to the application with the  {string} , {string} and {string} in Browser")
	public void user_is_loggedin_to_the_application_with_the_and_in_Browser(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("A fund transer of rs {string} has been done betweeb the same account")
	public void a_fund_transer_of_rs_has_been_done_betweeb_the_same_account(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Accouct Details Page is displayed")
	public void accouct_Details_Page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The Statement is sorted for the last Done transaction")
	public void the_Statement_is_sorted_for_the_last_Done_transaction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verifies that the last transaction \"<amount\">")
	public void user_verifies_that_the_last_transaction_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Logs out of the application")
	public void logs_out_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user opens the statement page")
	public void the_user_opens_the_statement_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
}
