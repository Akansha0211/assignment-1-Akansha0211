package ContactListApplication;

import details.Person;

import java.util.ArrayList;

public class ContactListApplication {
    private ArrayList<Person> contactList = new ArrayList<>();

    /**
     * This method will add firstName ,lastName, contactName, emailAddress
     *
     * @param firstName     will add firstName of the Person in the contactList
     * @param secondName      will add lastName of the Person in the contactList
     * @param contactNumber will add  contactNumber of the Person in the contactList
     * @param emailAddress  will add emailAddress of the Person in the contactList
     */
    public void add(String firstName, String secondName, String contactNumber, String emailAddress) {
        contactList.add(new Person(firstName, secondName, contactNumber, emailAddress));
    }

    public void addFirstName(String firstName) {
        contactList.add(new Person(firstName));
    }

    public void addSecondName(String secondName) {
        contactList.add(new Person(secondName));
    }

    public void addContactNumber(String contactNumber) {
        contactList.add(new Person(contactNumber));
    }

    public void addEmailAddress(String emailAAddress) {
        contactList.add(new Person(emailAAddress));
    }



    /**
     * This method will return contactList created
     *
     * @return the contactList created
     */
    public ArrayList<Person> getContactList() {
        return contactList;
    }

    /**
     * This method will print the contactList
     */
    public void print() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + "." + contactList.get(i));
        }
    }

    /**
     * This method will search for cotactList according to the firstName
     *
     * @param searchName the firstName to be searched for in the contactList
     * @return position if searchName(i.e firstName) found  and will return null if the searchName is not found
     */
    public Person search(String searchName) {
        int position = contactList.indexOf(new Person(searchName));
        if (position >= 0) {
            System.out.println(" 1 match found");
            System.out.println("----- * ----- * ----- * -----");
            return contactList.get(position);

        }
        return null;
    }

    /**
     * This method will remove a particular contact from the contactList according to the position
     * @param position the position from which contact is to be removed
     */

    public void remove(int position) {
        Person contact = contactList.get(position);
        contactList.remove(position);
        System.out.println(contact + "'s contact deleted from the list!");
    }
}
