package com.library.books;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private String city;
	private int noBookIssued;
	private LocalDate issueDate;
	private LocalDate submitBook;
	private double totalFine;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNoBookIssued() {
		return noBookIssued;
	}
	public void setNoBookIssued(int noBookIssued) {
		this.noBookIssued = noBookIssued;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getSubmitBook() {
		return submitBook;
	}
	public void setSubmitBook(LocalDate submitBook) {
		this.submitBook = submitBook;
	}
	public double getTotalFine() {
		return totalFine;
	}
	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", noBookIssued=" + noBookIssued
				+ ", issueDate=" + issueDate + ", submitBook=" + submitBook + ", totalFine=" + totalFine + "]";
	}
	
   
	public Student() {
		
	}
	

	public Student(int id, String name, String city, int noBookIssued, LocalDate issueDate, LocalDate submitBook,
			double totalFine) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.noBookIssued = noBookIssued;
		this.issueDate = issueDate;
		this.submitBook = submitBook;
		this.totalFine = totalFine;
	}
			
	}


