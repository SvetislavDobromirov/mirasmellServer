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

	@JsonProperty("isBreastFeeding")
	private Boolean isBreastFeeding;

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

	public void setBeautyInjections(Boolean beautyInjections) {
		isBeautyInjections = beautyInjections;
	}

	public Boolean getContraceptives() {
		return isContraceptives;
	}

	public void setContraceptives(Boolean contraceptives) {
		isContraceptives = contraceptives;
	}

	public Boolean getBreastFeeding() {
		return isBreastFeeding;
	}

	public void setBreastFeeding(Boolean breastFeeding) {
		isBreastFeeding = breastFeeding;
	}

	public Boolean getPregnant() {
		return isPregnant;
	}

	public void setPregnant(Boolean pregnant) {
		isPregnant = pregnant;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("FemaleInfo{");
		sb.append("isBeautyInjections=").append(isBeautyInjections);
		sb.append(", beautyInjections='").append(beautyInjections).append('\'');
		sb.append(", dayOfMenstrual=").append(dayOfMenstrual);
		sb.append(", isContraceptives=").append(isContraceptives);
		sb.append(", isBreastFeeding=").append(isBreastFeeding);
		sb.append(", isPregnant=").append(isPregnant);
		sb.append('}');
		return sb.toString();
	}
}