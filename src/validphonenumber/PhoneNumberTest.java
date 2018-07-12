package validphonenumber;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;

    private static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    private static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Phone number is " + number + " is valid: " + isvalid);
        }
        for (String number : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Phone number is " + number + " is valid: " + isvalid);
        }
    }
}
