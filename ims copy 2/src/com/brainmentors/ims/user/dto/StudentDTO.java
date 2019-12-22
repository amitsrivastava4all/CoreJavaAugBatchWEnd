package com.brainmentors.ims.user.dto;

import java.util.Date;

public class StudentDTO {
	private String id;
	private String name;
	private double fees;
	private double pendingFees;
	private Date dueDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getPendingFees() {
		return pendingFees;
	}
	public void setPendingFees(double pendingFees) {
		this.pendingFees = pendingFees;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", fees=" + fees + ", pendingFees=" + pendingFees
				+ ", dueDate=" + dueDate + "]";
	}
	

}
