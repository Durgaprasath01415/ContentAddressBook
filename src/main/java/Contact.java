import java.util.Comparator;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Comparator<Contact> firstNameSorting = new Comparator<Contact>() {
        @Override
        public int compare(Contact p1, Contact p2)
        {
            String firstName1 = p1.getFirstName();
            String firstName2 = p2.getFirstName();
            // ascending order
            return firstName1.compareToIgnoreCase(firstName2);
        }
    };

    // Sort By City
    public static Comparator<Contact> citySorting = new Comparator<Contact>() {
        @Override
        public int compare(Contact p1, Contact p2)
        {
            String city1 = p1.getCity();
            String city2 = p2.getCity();
            // ascending order
            return city1.compareToIgnoreCase(city2);
        }
    };
    // Sort By State
    public static Comparator<Contact> stateSorting = new Comparator<Contact>() {
        @Override
        public int compare(Contact p1, Contact p2)
        {
            String state1 = p1.getState();
            String state2 = p2.getState();
            // ascending order
            return state1.compareToIgnoreCase(state2);
        }
    };
    // Sort By Zip
    public static Comparator<Contact> zipSorting = new Comparator<Contact>() {
        @Override
        public int compare(Contact p1, Contact p2)
        {
            String zip1 = p1.getZip();
            String zip2 = p2.getZip();
            // ascending order
            return zip1.compareToIgnoreCase(zip2);
        }
    };

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
