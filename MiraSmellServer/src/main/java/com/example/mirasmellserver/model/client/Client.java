package com.example.mirasmellserver.model.client;

import java.util.List;

import com.example.mirasmellserver.model.shortClient.ShortClient;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client{

	public ShortClient mapToShortClient() {
		ShortClient shortClient = new ShortClient();
		shortClient.setUuid(this.uuid);

		com.example.mirasmellserver.model.shortClient.Name name =
				new com.example.mirasmellserver.model.shortClient.Name();

		name.setFirstName(this.name.getFirstName());
		name.setLastName(this.name.getLastName());
		name.setFatherName(this.name.getFatherName());

		shortClient.setName(name);

		return  shortClient;
	}


	@JsonProperty("hormonalDrugsInfo")
	private HormonalDrugsInfo hormonalDrugsInfo;

	@JsonProperty("listDates")
	private List<Integer> listDates;

	@JsonProperty("femaleInfo")
	private FemaleInfo femaleInfo;

	@JsonProperty("sex")
	private String sex;

	@JsonProperty("chronicIllness")
	private String chronicIllness;

	@JsonProperty("somaticConclusion")
	private String somaticConclusion;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("dateLastTesting")
	private String dateLastTesting;

	@JsonProperty("transcript")
	private String transcript;

	@JsonProperty("recommendations")
	private String recommendations;


	@JsonProperty("name")
	private Name name;

	@JsonProperty("additionalInfo")
	private String additionalInfo;

	@JsonProperty("psychoemlyonicConclusion")
	private String psychoemlyonicConclusion;

	@JsonProperty("implantsInfo")
	private Boolean implantsInfo;

	@JsonProperty("age")
	private Integer age;

	@JsonProperty("requestClient")
	private String requestClient;


	@JsonProperty("conclusion")
	private String conclusion;
	@JsonProperty("groupSmells")
	private GroupSmells groupSmells;

	public void setHormonalDrugsInfo(HormonalDrugsInfo hormonalDrugsInfo){
		this.hormonalDrugsInfo = hormonalDrugsInfo;
	}

	public HormonalDrugsInfo getHormonalDrugsInfo(){
		return hormonalDrugsInfo;
	}

	public void setListDates(List<Integer> listDates){
		this.listDates = listDates;
	}

	public List<Integer> getListDates(){
		return listDates;
	}

	public void setFemaleInfo(FemaleInfo femaleInfo){
		this.femaleInfo = femaleInfo;
	}

	public FemaleInfo getFemaleInfo(){
		return femaleInfo;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getSex(){
		return sex;
	}

	public void setChronicIllness(String chronicIllness){
		this.chronicIllness = chronicIllness;
	}

	public String getChronicIllness(){
		return chronicIllness;
	}

	public void setSomaticConclusion(String somaticConclusion){
		this.somaticConclusion = somaticConclusion;
	}

	public String getSomaticConclusion(){
		return somaticConclusion;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}

	public void setDateLastTesting(String dateLastTesting){
		this.dateLastTesting = dateLastTesting;
	}

	public String getDateLastTesting(){
		return dateLastTesting;
	}

	public void setTranscript(String transcript){
		this.transcript = transcript;
	}

	public String getTranscript(){
		return transcript;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setAdditionalInfo(String additionalInfo){
		this.additionalInfo = additionalInfo;
	}

	public String getAdditionalInfo(){
		return additionalInfo;
	}

	public void setPsychoemlyonicConclusion(String psychoemlyonicConclusion){
		this.psychoemlyonicConclusion = psychoemlyonicConclusion;
	}

	public String getPsychoemlyonicConclusion(){
		return psychoemlyonicConclusion;
	}

	public void setImplantsInfo(Boolean implantsInfo){
		this.implantsInfo = implantsInfo;
	}

	public Boolean isImplantsInfo(){
		return implantsInfo;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return age;
	}

	public void setRequestClient(String requestClient){
		this.requestClient = requestClient;
	}

	public String getRequestClient(){
		return requestClient;
	}

	public void setGroupSmells(GroupSmells groupSmells){
		this.groupSmells = groupSmells;
	}

	public GroupSmells getGroupSmells(){
		return groupSmells;
	}



	public Boolean getImplantsInfo() {
		return implantsInfo;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Client{");
		sb.append("hormonalDrugsInfo=").append(hormonalDrugsInfo);
		sb.append(", listDates=").append(listDates);
		sb.append(", femaleInfo=").append(femaleInfo);
		sb.append(", sex='").append(sex).append('\'');
		sb.append(", chronicIllness='").append(chronicIllness).append('\'');
		sb.append(", somaticConclusion='").append(somaticConclusion).append('\'');
		sb.append(", uuid='").append(uuid).append('\'');
		sb.append(", dateLastTesting='").append(dateLastTesting).append('\'');
		sb.append(", transcript='").append(transcript).append('\'');
		sb.append(", recommendations='").append(recommendations).append('\'');
		sb.append(", name=").append(name);
		sb.append(", additionalInfo='").append(additionalInfo).append('\'');
		sb.append(", psychoemlyonicConclusion='").append(psychoemlyonicConclusion).append('\'');
		sb.append(", implantsInfo=").append(implantsInfo);
		sb.append(", age=").append(age);
		sb.append(", requestClient='").append(requestClient).append('\'');
		sb.append(", conclusion='").append(conclusion).append('\'');
		sb.append(", groupSmells=").append(groupSmells);
		sb.append('}');
		return sb.toString();
	}
}