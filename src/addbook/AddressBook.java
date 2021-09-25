package addbook;

import java.util.ArrayList;
import java.util.Scanner;

import Addresbook.PersonInfo;

public class AddressBook {
	ArrayList<PersonInfo> persons;
	Scanner sc = new Scanner(System.in);
	
	public AddressBook() {
		persons = new ArrayList<PersonInfo>();
	}

	public void addPerson() {

		System.out.println("Enter first name");
		String firstname = sc.next();
		
		System.out.println("Enter last name");
		String lastname = sc.next();
		
		System.out.println("Enter address");
		String add = sc.next();
		
		System.out.println("Enter city name");
		String city = sc.next();
		
		System.out.println("Enter state name");
		String state = sc.next();
		
		System.out.println("Enter zip code");
        int zip = sc.nextInt();

		System.out.println("Enter phone no");
		int phonenum = sc.nextInt();

		PersonInfo p = new PersonInfo(firstname, lastname, add, city, state, zip, phonenum);

		persons.add(p);
	}


}
