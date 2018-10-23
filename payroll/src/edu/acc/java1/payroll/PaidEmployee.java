package edu.acc.java1.payroll;

import edu.acc.java1.savenload.Employee;

public class PaidEmployee extends Employee {
	private String title;
	private double wage;
	private double hours;
	private double pieceRate;
	private int    pieceCount;
	
	public PaidEmployee(String firstName, String lastName, String unsername,
			String password, boolean hashIt, String title, double wage,
			double hours, double pieceRate, int pieceCount) {
		super(firstName, lastName, username, password, hashIt);
		this.title = title;
		this.wage = wage;
		this.hours = hours;
		this.pieceRate = pieceRate;
		this.pieceCount = pieceCount;
	}

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public double getWage() { return wage; }
	public void setWage(double wage) { this.wage = wage; }
	public double getHours() { return hours; }
	public void setHours(double hours) { this.hours = hours; }
	public double getPieceRate() { return pieceRate; }
	public void setPieceRate(double pieceRate) { this.pieceRate = pieceRate;}
	public int getPieceCount() { return pieceCount; }
	public void setPieceCount(int pieceCount) { this.pieceCount = pieceCount; }
	
	@Override
	public String toString() {
		return String.format("%s\b, title=%s, wage=$%.2f, " +
			"hours=%.2f, pieceRate=%.2f, pieceCount=%d]", super.toString());
	}
	
}