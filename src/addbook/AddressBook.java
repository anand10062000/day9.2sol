package addbook;

import java.util.ArrayList;
import java.util.Scanner;

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
	public void update(String firstname) {

		for (int i = 0; i < persons.size(); i++) {
			PersonInfo p = (PersonInfo) persons.get(i);
			if (firstname.equals(p.firstname)) {

				System.out.println("enterd name found");
				System.out.println("enter first name to update");

				String fname = sc.next();

				p.firstname = fname;
				p.setFirstname(firstname);

				System.out.println("enter new address to upadate");

				String lname = sc.next();

				p.lastname = lname;
				String lastname = lname;
				p.setLastname(lastname);

				System.out.println("enter new address to upadate");

				String add = sc.next();
				p.setAddress(add);
				System.out.println("enter new address to upadate");

				String city = sc.next();
				
				p.setCity(city);
				
				System.out.println("enter new state to update");

				String state = sc.next();
				p.setState(state);
				
				System.out.println("enter zip code to update");

				int zip = sc.nextInt();
				p.setZip(zip);
				

				System.out.println("enter new phone num to update");

				int phoneNum1 = sc.nextInt();
				p.setPhoneNum(p.phoneNum);

			}
		}

	}


}
