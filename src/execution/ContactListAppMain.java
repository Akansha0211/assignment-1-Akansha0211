package execution;


import ContactListApplication.ContactListApplication;
import details.Person;

import java.util.Scanner;

public class ContactListAppMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactListApplication ca = new ContactListApplication();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    ca.print();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Welcome to DBC's Contact List App");
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit the program");
    }

    public static void addContact() {
        System.out.println("You have chosen to add a new contact number");
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name:");
        ca.addFirstName(scanner.nextLine());
        System.out.print("Last Name:");
        ca.addSecondName(scanner.nextLine());
        System.out.print("Contact Number:");
        ca.addContactNumber(scanner.nextLine());
        System.out.println("Would you like to add another contact number?(y/n");
        String input = scanner.nextLine();
        scanner.nextLine();
        if (input.toLowerCase() == "y") {
            ca.addContactNumber(scanner.nextLine());
        }
//        else if (input.toLowerCase()=="n"){
//            break;
//        }

        System.out.println("Would you like to ad email address?(y/n)");
        String input2 = scanner.nextLine();
        scanner.nextLine();
        if (input2.toLowerCase() == "y") {
            ca.addEmailAddress(scanner.nextLine());
        }
    }

    public static void searchContact() {
        System.out.println("You could search for a contact menu from their first Names:");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        ca.search(firstName);

    }

    public static void removeContact() {
        System.out.println("Here are all your contacts:");
        ca.print();
        System.out.println("Press the number against the contact to delete it :");
        int index = scanner.nextInt();
        ca.remove(index);

    }


}
