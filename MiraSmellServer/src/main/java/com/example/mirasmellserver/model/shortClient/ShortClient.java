package com.example.mirasmellserver.model.shortClient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ShortClient{

	@JsonProperty("listDateInviting")
	private List<Integer> listDateInviting;

	@JsonProperty("name")
	private Name name;

	@JsonProperty("uuid")
	private String uuid;

	public void setListDateInviting(List<Integer> listDateInviting){
		this.listDateInviting = listDateInviting;
	}

	public List<Integer> getListDateInviting(){
		return listDateInviting;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}
}