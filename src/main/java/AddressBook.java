import java.util.*;

public class AddressBook {
    private Map<String, Contact> addressBookMap = new HashMap<>();
    private Map<String, String> dictionary = new HashMap<>();
        Contact contact;
        Scanner scanner = new Scanner(System.in);

        //To add into AddressBook
        public void add () {
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
            System.out.println("Enter phone number : ");
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
            addressBookMap.put(contact.getFirstName(),contact);
            for (Map.Entry m : addressBookMap.entrySet()) {
                System.out.println("AddressBook Key :" +m.getKey() + " " + " Values : " + m.getValue());
            }
            dictionary.put(contact.getFirstName(), city);
            for (Map.Entry d : dictionary.entrySet()) {
               System.out.println("Dictionary Key : " + d.getKey() + " " + " Value : " + d.getValue());
            }
            System.out.println("Number of contact with city : " + dictionary.size());
        }

        //To edit AddressBook
        public boolean edit () {
            System.out.println("Enter First name for editing");
            String firstName = scanner.nextLine();
            if(!firstName.equals(addressBookMap.values())) {
               return false;
            }
            System.out.println("Edit Menu which details you have to edit");
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
                    contact.setFirstName(scanner.next());
                    addressBookMap.put(contact.getFirstName(), contact);
                    break;
                case 2:
                    contact.setLastName(scanner.next());
                    addressBookMap.put(contact.getLastName(), contact);
                    break;
                case 3:
                    contact.setAddress(scanner.next());
                    addressBookMap.put(contact.getAddress(), contact);
                    break;
                case 4:
                    contact.setCity(scanner.next());
                    addressBookMap.put(contact.getCity(), contact);
                    break;
                case 5:
                    contact.setState(scanner.next());
                    addressBookMap.put(contact.getState(), contact);
                    break;
                case 6:
                    contact.setZip(scanner.next());
                    addressBookMap.put(contact.getZip(), contact);
                    break;
                case 7:
                    contact.setPhoneNumber(scanner.next());
                    addressBookMap.put(contact.getPhoneNumber(), contact);
                    break;
                case 8:
                    contact.setEmail(scanner.next());
                    addressBookMap.put(contact.getEmail(), contact);
                    break;
            }
            System.out.println("Firstname : " + contact.getFirstName() + "\nLastname : " + contact.getLastName() + "\nAddress : " + contact.getAddress() + "\nCity : " + contact.getCity() + "\nState : " + contact.getState() + "\nZip : " + contact.getZip() + "\nPhonenumber : " + contact.getPhoneNumber() + "\nEmail : " + contact.getEmail());
            return true;
        }

        //To delete AddressBook
        public boolean delete () {
            System.out.println("press 1 for delete");
            System.out.println("press 2 exit");
            int choice = Integer.valueOf(scanner.next());
            switch (choice) {
                case 1:
                    System.out.println("Enter first Name to delete");
                    String firstName2 = scanner.next();
                    if (contact != null && firstName2.equals(contact.getFirstName())) {
                        addressBookMap.remove(firstName2);
                    }
                    break;
                case 2:
                    break;
            }
            return true;
        }

        //To search a contact by City name
        public String search () {
            System.out.println("Enter the city name to search");
                    String cityName = scanner.next();
                    Collection<Contact> values = addressBookMap.values();
                    values.forEach(addressBookMap -> {
                        if (addressBookMap.getCity().equals(cityName)) {
                            System.out.println(addressBookMap.getFirstName());
                        }
                    });
        return cityName;
        }
    }