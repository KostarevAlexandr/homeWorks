import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("Ведите имя, номер или команду:");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            if (input.equals("LIST")){
                phoneBook.getAllContacts();
            }
            else if (input.matches("^[А-Я][а-я]+")){
                phoneBook.getPhonesByName(input);
            }
            else if (input.matches("^(7)\\d{10}")){
                phoneBook.getNameByPhone(input);
            }
            else {
                System.out.println("не верный формат ввода");
            }


        }
    }

}
