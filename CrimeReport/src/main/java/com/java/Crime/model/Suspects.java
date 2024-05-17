package com.java.Crime.model;

import java.sql.Date;
import java.util.Objects;

public class Suspects {
	
	private int SuspectID;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private Gender Gender;
	private String PhoneNumber;
	private String Address;
	public int getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(int suspectID) {
		SuspectID = suspectID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return Gender;
	}
	public void setGender(Gender gender) {
		Gender = gender;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Suspects [SuspectID=" + SuspectID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + ", PhoneNumber=" + PhoneNumber + ", Address="
				+ Address + "]";
	}
	public Suspects(int suspectID, String firstName, String lastName, Date dateOfBirth,
			com.java.Crime.model.Gender gender, String phoneNumber, String address) {
		super();
		SuspectID = suspectID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public Suspects() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DateOfBirth, FirstName, Gender, LastName, PhoneNumber, SuspectID);
	}
	@Override
	public boolean equals(Object obj) {
		
		Suspects other = (Suspects) obj;
		if( Objects.equals(Address, other.Address) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName) && Gender == other.Gender
				&& Objects.equals(LastName, other.LastName) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& SuspectID == other.SuspectID)
			{ return true;
	}
		return false;
	
	
}
}
	