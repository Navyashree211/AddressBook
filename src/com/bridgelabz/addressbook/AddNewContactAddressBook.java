package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddNewContactAddressBook {  
	
	public void addContactDetails() {
		ContactsDetails contacts = new ContactsDetails();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name of persion : ");
		contacts.setFirstname(sc.next());
		System.out.println("Enter the Last name of persion : ");
		contacts.setLastname(sc.next());
		System.out.println("Enter the Address name of persion : ");
		contacts.setAddress(sc.next());
		System.out.println("Enter the City name of persion : ");
		contacts.setCity(sc.next());
		System.out.println("Enter the State name of persion : ");
		contacts.setState(sc.next());
		System.out.println("Enter the Email of persion : ");
		contacts.setEmail(sc.next());
		System.out.println("Enter the Zip of persion : ");
		contacts.setZip(sc.nextInt());
		System.out.println("Enter the Phone Number of persion : ");
		contacts.setPhonenumber(sc.nextInt());

		System.out.println("------------------------------------------------");
		System.out.println(contacts.toString());
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		System.out.println("---------------------------------------------");
		AddNewContactAddressBook addContact = new AddNewContactAddressBook();
		addContact.addContactDetails();
	}

}
