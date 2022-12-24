package emailAddres;

public class EmailAddress {
  String email;

  public EmailAddress(String email) {
    this.email = email;

  }

  public String getEmailAddress() {
    return this.email;
  }

  public void setEmailAddress(String email) {
    this.email = email;
  }
}

// import java.util.regex.*;
// import java.util.*;

// public class EmailAddress {
// private String email;
// String regex = "^(.+)@(.+)$";
// Pattern pattern = Pattern.compile(regex);

// private EmailAddress(String email) {
// this.email = email;

// }

// public static void main(String args[]) {

// // Compile regular expression to get the pattern
// // Iterate emails array list
// }
// }