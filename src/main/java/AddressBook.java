
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private LinkedList < Contact > addressBookList;
    private Map < String , Contact > addressBookMap;
    public AddressBook(){
        addressBookList = new LinkedList<>();
        addressBookMap = new HashMap<>();
    }
    Contact contact;
    Scanner scanner = new Scanner( System.in );
    //To add into AddressBook
    public void add() {
        contact = new Contact();
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        System.out.println("Enter city : ");
        String city = scanner.nextLine();
        System.out.println("Enter state : ");
        String state = scanner.nextLine();
        System.out.println("Enter zip : ");
        String zip = scanner.nextLine();
        System.out.println("Enter phonenumber : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email : ");
        String email = scanner.nextLine();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        addressBookList.add( contact );
        addressBookMap.put(contact.getFirstName(),contact);
        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());
    }
    //To edit AddressBook
    public boolean edit() {
        System.out.println("Enter First name");
        String firstName = scanner.nextLine();
        if (!firstName.equals(contact.getFirstName())) {
            return false;
        }
        System.out.println("Which details you have to edit");
        System.out.println("Press 1 for changing first name");
        System.out.println("Press 2 for changing last name");
        System.out.println("Press 3 for changing address");
        System.out.println("Press 4 for changing city name");
        System.out.println("Press 5 for changing state name");
        System.out.println("Press 6 for changing zip");
        System.out.println("Press 7 for changing phoneNumber");
        System.out.println("Press 8 for changing email");
        int choice = Integer.valueOf(scanner.next());
        switch (choice) {
            case 1:
                contact.setFirstName(scanner.nextLine());
                break;
            case 2:
                contact.setLastName(scanner.nextLine());
                break;
            case 3:
                contact.setAddress(scanner.nextLine());
                break;
            case 4:
                contact.setCity(scanner.nextLine());
                break;
            case 5:
                contact.setState(scanner.nextLine());
                break;
            case 6:
                contact.setZip(scanner.nextLine());
                break;
            case 7:
                contact.setPhoneNumber(scanner.nextLine());
                break;
            case 8:
                contact.setEmail(scanner.nextLine());
                break;
        }
        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());
        return true;
    }
    //To delete AddressBook
    public boolean delete() {
        System.out.println("press 1 for delete");
        System.out.println("press 2 exit");
        int choice = Integer.valueOf(scanner.next());
        switch (choice) {
            case 1:
                System.out.println("Enter first Name to delete");
                String firstName2 = scanner.next();
                if (contact != null && firstName2.equals(contact.getFirstName())) {
                    contact = null;
                }
                break;
            case 2:
                break;
        }
        return true;
    }
}

