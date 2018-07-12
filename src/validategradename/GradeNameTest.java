package validategradename;

public class GradeNameTest {
    private static GradeName gradeName;
    public static final String[] validName = new String[]{"C0318G"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        gradeName = new GradeName();
        for (String name : validName) {
            boolean isvalid = gradeName.validate(name);
            System.out.println("Grade name is " + name + " is valid: " + isvalid);
        }

        for (String name : invalidName) {
            boolean isvalid = gradeName.validate(name);
            System.out.println("Grade name is " + name + " is valid: " + isvalid);
        }

    }
}
