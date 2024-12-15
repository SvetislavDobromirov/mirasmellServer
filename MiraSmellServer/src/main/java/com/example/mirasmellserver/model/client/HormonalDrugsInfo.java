package com.example.mirasmellserver.model.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class HormonalDrugsInfo{

	@JsonProperty("hormonalDrugs")
	private String hormonalDrugs;

	@JsonProperty("isHormonalDrugs")
	private Boolean isHormonalDrugs;

	public void setHormonalDrugs(String hormonalDrugs){
		this.hormonalDrugs = hormonalDrugs;
	}

	public String getHormonalDrugs(){
		return hormonalDrugs;
	}

	public void setIsHormonalDrugs(Boolean isHormonalDrugs){
		this.isHormonalDrugs = isHormonalDrugs;
	}

	public Boolean isIsHormonalDrugs(){
		return isHormonalDrugs;
	}

	@Override
 	public String toString(){
		return 
			"HormonalDrugsInfo{" + 
			"hormonalDrugs = '" + hormonalDrugs + '\'' + 
			",isHormonalDrugs = '" + isHormonalDrugs + '\'' + 
			"}";
		}
}