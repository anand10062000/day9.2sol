package addbook;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		AddressBook add = new AddressBook();
		add.toString();
		Scanner sc1=new Scanner(System.in);


		String name = null;

		while(true){
			System.out.println("\nEnter 1 to add\n Enter 2 to search\n Enter 3 to remove\n Enter 4 to update\n Enter 5 to display1");
			int ch=sc1.nextInt(); //converting String to character
			switch(ch){
			case 1:
				add.addPerson();
				break;

			}
		}
	}
}
