package addbook;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		AddressBook add = new AddressBook();
		add.toString();
		Scanner sc1=new Scanner(System.in);
		String firstname = null;


		while(true){
			System.out.println("Enter 1 to add\nEnter 2 toremove\nEnter 3 to update\nEnter 4 to display");
			int ch=sc1.nextInt(); //converting String to character
			switch(ch){
			case 1:
				add.addPerson();
				break;
			case 2:
				String name2=sc1.next();
				firstname=name2;
				System.out.println("Enter The Name");
				add.remove(firstname);
				break;
			case 3: 
				String name3 = sc1.next();
				firstname = name3;
				add.update(firstname);
				add.toString();
				break;
			case 4:
				add.display();
				break;
			}//statment
		}//while
	}
}