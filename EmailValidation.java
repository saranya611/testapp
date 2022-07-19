
import java.util.ArrayList;
import java.util.Scanner;

class mail {
    public void action() {

        ArrayList<String> email = new ArrayList<String>();

        email.add("aaa@bb.com");
        email.add("bbb@cc.com");
        email.add("ccc@dd.com");
        email.add("ddd@ee.com");
        email.add("eee@ff.com");
        email.add("fff@gg.com");
        email.add("ggg@hh.com");

        // search code
        String searchid = null;
        System.out.println("Email Validation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email to be searched: ");
        searchid = sc.nextLine();

        if (email.contains(searchid)) {
            System.out.println("email ID ( " + searchid + " ) is found in the arraylist");
        } else {
            System.out.println("email ID ( " + searchid + " ) is not found in the arraylist");
        }
    }
}

public class EmailValidation {
    public static void main(String[] args) {
        mail e = new mail();
        e.action();
        mail e1 = new mail();
        e1.action();
    }
}
