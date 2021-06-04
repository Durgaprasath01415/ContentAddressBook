import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {
    private List<Contact> addressBookMap = new LinkedList<>();
    private Map<String, String> dictionary = new HashMap<>();
    Contact contact;
    List<Contact> contactList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    //To add into AddressBook
    public void add () {
        contact = new Contact();
        List<Contact> contactList = new LinkedList<>();
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        Predicate<Contact> predicate = ((contact_List) ->(contact_List.getFirstName() != contact_List.getFirstName()));
        contactList.stream().filter(predicate);
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
        addressBookMap.add(contact);
//        Collection<Contact> bookValues = addressBookMap.values();
        //List<Contact> contactBook = bookValues.stream().collect(Collectors.toList());
//        Stream<Contact> sortOfAddressBook = bookValues.stream().sorted();
//        sortOfAddressBook.forEach(System.out::println);
            System.out.println(addressBookMap);

        dictionary.put(contact.getFirstName(), city);
        Collection<String> values = dictionary.values();
        List<String> cityName = values.stream().collect(Collectors.toList());
        System.out.println("Dictionary Of Contact with city : " + cityName);

    }

    //To edit AddressBook
    public boolean edit () {
        System.out.println("Enter First name for editing");
        String firstName = scanner.nextLine();
        Contact person = null;
        Collection<Contact> values = addressBookMap;
        for(Contact contact : values) {
            if (contact.getFirstName().equals(firstName))
                person = contact;
        }
        if(person == null) {
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
                System.out.println("Enter the firstName");
                person.setFirstName(scanner.next());
                addressBookMap.add(person);
                break;
            case 2:
                System.out.println("Enter the lastName");
                person.setLastName(scanner.next());
                addressBookMap.add(person);                break;
            case 3:
                System.out.println("Enter the Address");
                person.setAddress(scanner.next());
                addressBookMap.add(person);                break;
            case 4:
                System.out.println("Enter the city");
                person.setCity(scanner.next());
                addressBookMap.add(person);                break;
            case 5:
                System.out.println("Enter the state");
                person.setState(scanner.next());
                addressBookMap.add(person);                break;
            case 6:
                System.out.println("Enter the Zip");
                person.setZip(scanner.next());
                addressBookMap.add(person);                break;
            case 7:
                System.out.println("Enter the Phone Number");
                person.setPhoneNumber(scanner.next());
                addressBookMap.add(person);                break;
            case 8:
                System.out.println("Enter the email");
                person.setEmail(scanner.next());
                addressBookMap.add(person);                break;
        }
        System.out.println("Firstname : " + person.getFirstName() + "\nLastname : " + person.getLastName() + "\nAddress : " + person.getAddress() + "\nCity : " + person.getCity() + "\nState : " + person.getState() + "\nZip : " + person.getZip() + "\nPhonenumber : " + person.getPhoneNumber() + "\nEmail : " + person.getEmail());
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
    public boolean search () {
        System.out.println("Enter the city name to search");
        String cityName = scanner.next();
        List<Contact> values = addressBookMap;
        values.forEach(addressBookMap -> {
            if(addressBookMap.getCity().equals(cityName)){
                System.out.println(addressBookMap.getFirstName());
            }
        });
        return true;
    }

//    public void sort()
//    {
//        System.out.println("Sort By...\n"
//                + "1: First Name\n"
//                + "2: City\n"
//                + "3: State\n"
//                + "4: Zip Code\n"
//                + "5: Back");
//        int choice = scanner.nextInt();
//        switch (choice)
//        {
//            case 1:
//                Sort.sortByName((addressBookMap));
//                break;
//            case 2 :
//                Sort.sortByCity((addressBookMap));
//                break;
//            case 3 :
//                Sort.sortByState((addressBookMap));
//                break;
//            case 4 :
//                Sort.sortByZip((addressBookMap));
//                break;
//            case 5 :
//                return;
//            default:
//                System.out.println("Please Enter Valid Option...");
//        }
//    }
//}