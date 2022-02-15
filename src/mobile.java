import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobile {
    public static void main(String[] args) {
        String phoneNumberz = "+380984323423";
        Pattern pattern = Pattern.compile("^((\\+?380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(phoneNumberz);
        if (matcher.matches()) {
            System.out.println("Phone numberz " + phoneNumberz + "correct");

        }else System.out.println("Phone numberz  " + phoneNumberz + "is incorrect");
    }
}
