import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList Email =new EmailList();

        while (true)
        {
            String input = scanner.nextLine();
            if (input.equals("0")) { break; }

            if(input.matches("ADD\\s.+@.+[.][A-Za-z]+"))
            {
                String[] added = input.split("\\s",2);
                Email.add(added[1]);
                System.out.println("Добавлено " + added[1]);
            }
            else if (input.matches("LIST")){ Email.getSortedEmails(); }

            else{ System.out.println(WRONG_EMAIL_ANSWER); }



        }
    }
}
