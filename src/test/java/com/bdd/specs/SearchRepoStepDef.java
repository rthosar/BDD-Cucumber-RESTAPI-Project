package com.bdd.specs;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;

public class SearchRepoStepDef {
	OkHttpClient client = new OkHttpClient();
	int Actual_Responsecode=0;
	@Given("open a github repo and search a repo with keyword {string}")
	public void open_a_github_repo_and_search_a_repo_with_keyword(String option) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
		String URL ="https://api.github.com/search/repositories?q="+option;
		
		Request request = new Request.Builder()
		  .url(URL)
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "4d100521-6168-e824-79ad-828a5194fe87")
		  .build();

		System.out.println("Request :" +request);
		Response response = client.newCall(request).execute();
		Actual_Responsecode=response.code();
		//System.out.println("Actual Response Code :" +Actual_Responsecode);

	}
	
	
	

	@Then("verify if the http response code is {int}")
	public void verify_if_the_http_response_code_is(Integer Expected_Responsecode) {
	   
		System.out.println("Actual Response Code :" +Actual_Responsecode);
		System.out.println("Expected Response Code :" +Expected_Responsecode);		
		assertTrue(Actual_Responsecode==Expected_Responsecode?true:false);
		
	}


}
