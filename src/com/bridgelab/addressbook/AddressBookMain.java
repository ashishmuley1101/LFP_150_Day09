package com.bridgelab.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System...");
		Scanner sc = new Scanner(System.in);
		IAddressBook addressbook = new AddressBook();
		System.out.println("Please select the option you want to do in Address Book!!  ");
		boolean stoprun = false;
		int choice;
		while (!stoprun) {
			System.out.println(
					"1.Create Contact\t 2.Show Contacts\t 3.Delete Contact\t 4.Update Contact\t 5.Quit");
			System.out.println("Enter your option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addressbook.addContact();
				System.out.println();
				break;
			case 2:
				addressbook.showaddress();
				System.out.println();
				break;
			case 3:
				addressbook.deleteContact();
				break;
			case 4:
				addressbook.updateContact();
				break;
			case 5:
				stoprun = true;
				System.out.println("Application is exited!!");
				break;
			default:
				System.out.println("Incorrect choice");
			}
		}

		}
}
