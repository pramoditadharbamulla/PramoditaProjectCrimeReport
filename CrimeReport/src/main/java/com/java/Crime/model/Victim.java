package com.java.Crime.model;

import java.sql.Date;
import java.util.Objects;

public class Victim {
	private int victimID;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private Gender Gender;
	private String PhoneNumber;
	private String Address;
	public int getVictimID() {
		return victimID;
	}
	public void setVictimID(int victimID) {
		this.victimID = victimID;
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
		return "Victim [victimID=" + victimID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DateOfBirth="
				+ DateOfBirth + ", Gender=" + Gender + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + "]";
	}
	public Victim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Victim(int victimID, String firstName, String lastName, Date dateOfBirth, com.java.Crime.model.Gender gender,
			String phoneNumber, String address) {
		super();
		this.victimID = victimID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DateOfBirth, FirstName, Gender, LastName, PhoneNumber, victimID);
	}
	@Override
	public boolean equals(Object obj) {
		
		Victim other = (Victim) obj;
		if(Objects.equals(Address, other.Address) && Objects.equals(DateOfBirth, other.DateOfBirth)
				&& Objects.equals(FirstName, other.FirstName) && Gender == other.Gender
				&& Objects.equals(LastName, other.LastName) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& victimID == other.victimID) {
			return true;
			
		}
		return false;
	}
	
	

}
