import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      input.trim();
       if (input.matches("^(\\+7|7|8)\\s*\\(?\\d{3}\\)?\\s*\\d{3}\\-?\\d{2}\\-?\\d{2}$"))
       {
        input = input.replaceAll("[\\s+()-]", "");
        input = input.substring(1);
        System.out.println("7" + input);
       }
      // если кода страны нет вообще:
      else if (input.matches("^\\d{3}\\s*\\-?\\d{3}\\-?\\d{2}\\-?\\d{2}$"))
      {
        input = input.replaceAll("[\\s+()-]", "");
        System.out.println("7" + input);
      }
      else{ System.out.println("Ввод не верный, попробуйте еще"); }
    }
  }
}
