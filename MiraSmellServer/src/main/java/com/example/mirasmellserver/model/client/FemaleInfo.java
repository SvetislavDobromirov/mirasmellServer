package com.example.mirasmellserver.model.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FemaleInfo{

	@JsonProperty("isBeautyInjections")
	private Boolean isBeautyInjections;

	@JsonProperty("beautyInjections")
	private String beautyInjections;

	@JsonProperty("dayOfMenstrual")
	private Integer dayOfMenstrual;

	@JsonProperty("isContraceptives")
	private Boolean isContraceptives;

	@JsonProperty("isPregnant")
	private Boolean isPregnant;

	public void setIsBeautyInjections(Boolean isBeautyInjections){
		this.isBeautyInjections = isBeautyInjections;
	}

	public Boolean isIsBeautyInjections(){
		return isBeautyInjections;
	}

	public void setBeautyInjections(String beautyInjections){
		this.beautyInjections = beautyInjections;
	}

	public String getBeautyInjections(){
		return beautyInjections;
	}

	public void setDayOfMenstrual(Integer dayOfMenstrual){
		this.dayOfMenstrual = dayOfMenstrual;
	}

	public Integer getDayOfMenstrual(){
		return dayOfMenstrual;
	}

	public void setIsContraceptives(Boolean isContraceptives){
		this.isContraceptives = isContraceptives;
	}

	public Boolean isIsContraceptives(){
		return isContraceptives;
	}

	public void setIsPregnant(Boolean isPregnant){
		this.isPregnant = isPregnant;
	}

	public Boolean isIsPregnant(){
		return isPregnant;
	}

	@Override
 	public String toString(){
		return 
			"FemaleInfo{" + 
			"isBeautyInjections = '" + isBeautyInjections + '\'' + 
			",beautyInjections = '" + beautyInjections + '\'' + 
			",dayOfMenstrual = '" + dayOfMenstrual + '\'' + 
			",isContraceptives = '" + isContraceptives + '\'' + 
			",isPregnant = '" + isPregnant + '\'' + 
			"}";
		}
}