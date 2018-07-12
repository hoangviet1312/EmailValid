package validategradename;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GradeName {
    private Pattern pattern;
    private Matcher matcher;

    private static final String GRADE_NAME = "^[CAP][0-9]{4}[G-M]$";

    public GradeName() {
        pattern = Pattern.compile(GRADE_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
