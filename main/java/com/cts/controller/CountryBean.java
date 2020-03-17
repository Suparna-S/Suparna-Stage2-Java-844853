package com.cts.controller;

public class CountryBean 
{
	String countryname;
	public CountryBean(String countryname, String climate) {
		super();
		this.countryname = countryname;
		this.climate = climate;
	}
	String climate;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	
}
