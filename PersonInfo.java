public class PersonInfo {
    // Variables to store personal information
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String zipCode;

    // Method to print the information
    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }

    public static void main(String[] args) {
        // Creating an instance of PersonInfo
        PersonInfo person = new PersonInfo();

        // Assigning values
        person.firstName = "Stephen";
        person.lastName = "Strange";
        person.streetAddress = "177A Bleaker Street";
        person.city = "New York";
        person.zipCode = "10001";

        // Printing the information
        person.printInfo();
    }
}