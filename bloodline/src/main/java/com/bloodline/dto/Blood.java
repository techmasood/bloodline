package com.bloodline.dto;

public class Blood {
	
	private int bloodId;
	private String bloodGroup;
	
	public int getBloodId() {
		return bloodId;
	}
	public void setBloodId(int bloodId) {
		this.bloodId = bloodId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	@Override
	public String toString() {
		return "Blood [bloodId=" + bloodId + ", bloodGroup=" + bloodGroup + "]";
	}

	
}
