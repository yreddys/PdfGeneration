package com.example.DepartmentService.model;

public class DepartmentResponse {
	private int dId;
	private String dName;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public DepartmentResponse(int dId, String dName) {
		
		this.dId = dId;
		this.dName = dName;
	}
	public DepartmentResponse() {}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

}
