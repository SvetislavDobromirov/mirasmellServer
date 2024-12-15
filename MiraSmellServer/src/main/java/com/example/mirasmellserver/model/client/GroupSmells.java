package com.example.mirasmellserver.model.client;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupSmells{

	@JsonProperty("veryNegative")
	private List<Object> veryNegative;

	@JsonProperty("negative")
	private List<Object> negative;

	@JsonProperty("noSmell")
	private List<Object> noSmell;

	@JsonProperty("veryPositive")
	private List<VeryPositiveItem> veryPositive;

	@JsonProperty("neutral")
	private List<Object> neutral;

	@JsonProperty("positive")
	private List<PositiveItem> positive;

	@JsonProperty("revers")
	private List<Object> revers;

	public void setVeryNegative(List<Object> veryNegative){
		this.veryNegative = veryNegative;
	}

	public List<Object> getVeryNegative(){
		return veryNegative;
	}

	public void setNegative(List<Object> negative){
		this.negative = negative;
	}

	public List<Object> getNegative(){
		return negative;
	}

	public void setNoSmell(List<Object> noSmell){
		this.noSmell = noSmell;
	}

	public List<Object> getNoSmell(){
		return noSmell;
	}

	public void setVeryPositive(List<VeryPositiveItem> veryPositive){
		this.veryPositive = veryPositive;
	}

	public List<VeryPositiveItem> getVeryPositive(){
		return veryPositive;
	}

	public void setNeutral(List<Object> neutral){
		this.neutral = neutral;
	}

	public List<Object> getNeutral(){
		return neutral;
	}

	public void setPositive(List<PositiveItem> positive){
		this.positive = positive;
	}

	public List<PositiveItem> getPositive(){
		return positive;
	}

	public void setRevers(List<Object> revers){
		this.revers = revers;
	}

	public List<Object> getRevers(){
		return revers;
	}

	@Override
 	public String toString(){
		return 
			"GroupSmells{" + 
			"veryNegative = '" + veryNegative + '\'' + 
			",negative = '" + negative + '\'' + 
			",noSmell = '" + noSmell + '\'' + 
			",veryPositive = '" + veryPositive + '\'' + 
			",neutral = '" + neutral + '\'' + 
			",positive = '" + positive + '\'' + 
			",revers = '" + revers + '\'' + 
			"}";
		}
}