package com.bloodline.dto;

public class Country {

	private int  countryId;
	private String country;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", country=" + country + "]";
	}
	
	
	
}
