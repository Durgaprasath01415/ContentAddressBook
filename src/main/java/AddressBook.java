import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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
        PrintStream file = null;
        try {
            file = new PrintStream("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(file);
        System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());

    }
    public boolean edit(){
        System.out.println("Enter First name");
        String firstName = scanner.nextLine();
        if(firstName.matches(contact.getFirstName())){
            return false;
        }
        System.out.println("Which details you have to edit");
        System.out.println("Press 1 for editing first name");
        System.out.println("Press 2 for editing last name");
        System.out.println("Press 3 for editing address");
        System.out.println("Press 4 for editing city name");
        System.out.println("Press 5 for editing state name");
        System.out.println("Press 6 for editing zip");
        System.out.println("Press 7 for editing phoneNumber");
        System.out.println("Press 8 for editing email");
        int choice = Integer.valueOf(scanner.next());
        switch (choice){
            case 1: contact.setFirstName(scanner.nextLine());
                break;
            case 2: contact.setLastName(scanner.nextLine());
                break;
            case 3: contact.setAddress(scanner.nextLine());
                break;
            case 4: contact.setCity(scanner.nextLine());
                break;
            case 5: contact.setState(scanner.nextLine());
                break;
            case 6: contact.setZip(scanner.nextLine());
                break;
            case 7: contact.setPhoneNumber(scanner.nextLine());
                break;
            case 8: contact.setEmail(scanner.nextLine());
                break;
        }
        return true;
    }
}