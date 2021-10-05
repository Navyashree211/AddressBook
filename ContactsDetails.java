package com.bridgelabz.addressbook;

//import java.util.Scanner;

public class ContactsDetails {

	// variable declaration
	private String firstname, lastname, address, city, state, email;
	private int zip;
	private int phonenumber;

	// public ContactsDetails(String firstname, String lastname, String address,
	// String city, String state, String email, int zip, int phonenumber) {
	// this.firstname = firstname;
	// this.lastname =lastname;
	// this.address = address;
	// this.city = city;
	// this.state = state;
	// this.email = email;
	// this.zip = zip;
	// this.phonenumber = phonenumber;
	// }

	// getter or setter methods to assign or retrieve the contact details.
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Contact details:" + "\n" + "FirstName=" + firstname + "\n" + "LastName=" + lastname + "\n" + "City="
				+ city + "\n" + "State=" + state + "\n" + "Zip=" + zip + "\n" + "Address=" + address + "\n"
				+ "PhoneNumber=" + phonenumber + "\n" + "Email=" + email;

	}

}
