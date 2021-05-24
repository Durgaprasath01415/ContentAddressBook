
import java.util.Scanner;


public class AddressBook {
    Contact contact;
    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());

    }
}