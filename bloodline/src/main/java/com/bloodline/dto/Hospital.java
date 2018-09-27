package com.bloodline.dto;

public class Hospital {
	
	private int hospitalId;
	private String address;
	private int moblie;
	private String hospitalName;
	private String userName;
	private String password;
	
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoblie() {
		return moblie;
	}
	public void setMoblie(int moblie) {
		this.moblie = moblie;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", address=" + address + ", moblie=" + moblie + ", hospitalName="
				+ hospitalName + ", userName=" + userName + ", password=" + password + "]";
	}	

}
