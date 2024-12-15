package com.example.mirasmellserver.model.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositiveItem{

	@JsonProperty("isImportant")
	private Boolean isImportant;

	@JsonProperty("type")
	private String type;

	@JsonProperty("nameSmell")
	private String nameSmell;

	public void setIsImportant(Boolean isImportant){
		this.isImportant = isImportant;
	}

	public Boolean isIsImportant(){
		return isImportant;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setNameSmell(String nameSmell){
		this.nameSmell = nameSmell;
	}

	public String getNameSmell(){
		return nameSmell;
	}

	@Override
 	public String toString(){
		return 
			"PositiveItem{" + 
			"isImportant = '" + isImportant + '\'' + 
			",type = '" + type + '\'' + 
			",nameSmell = '" + nameSmell + '\'' + 
			"}";
		}
}