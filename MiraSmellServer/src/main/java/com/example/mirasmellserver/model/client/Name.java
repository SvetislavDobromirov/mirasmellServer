package com.example.mirasmellserver.model.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("fatherName")
	private String fatherName;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}

	public String getFatherName(){
		return fatherName;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",fatherName = '" + fatherName + '\'' + 
			"}";
		}
}