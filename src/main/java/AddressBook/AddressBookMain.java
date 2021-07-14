package AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBook myObj = new AddressBook();
		System.out.println("Welcome to Address Book System");
		myObj.add();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Edit \n2.Delete \n3.ShowContacts \n4.Exist ");
		int input = sc.nextInt();
		boolean exit = false;
		switch (input) {
		case 1:
			myObj.editContact();
			break;
		case 2:
			myObj.delete();
			break;
		case 3:
			myObj.showContact();
			break;
		case 4:
			 exit = true;
			break;
		default:
			System.out.print("Please Choose right option: ");

			break;
		}
	}

}
