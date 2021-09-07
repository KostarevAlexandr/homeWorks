import java.util.TreeSet;

public class EmailList {

    TreeSet<String> mails = new TreeSet<>();

    public void add(String email) { mails.add(email); }

    public TreeSet<String> getSortedEmails()
    {
       for (String mail :mails){ System.out.println(mail.toLowerCase()); }
       return mails;
    }

}
