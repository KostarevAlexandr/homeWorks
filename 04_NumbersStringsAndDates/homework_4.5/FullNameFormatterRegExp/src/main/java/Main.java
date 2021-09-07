import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //делаю шаброн ФИО
      String text = "Фамилия: =Имя: =Отчество: =";
            String[] shablon = text.split("=");

      //разбиваю ввод по пробелу
      String name = "";
      StringBuilder builder = new StringBuilder(name );
      String[] fio = input.split("\\s+",3);

        for (int i = 0; i< fio.length; i++)
        {
          name = fio[i];
          Pattern checkName = Pattern.compile("^[А-Я][а-я]+(-[А-Я][а-я]+)?([ ][а-я]+)?$", Pattern.UNICODE_CHARACTER_CLASS);
          Matcher n = checkName.matcher(name);

            if (fio.length >=3 && fio.length <=4 && n.matches())
            {
              builder.append( shablon[i] + name + "\n" );
            }
            else  {
              builder.setLength(0);
              builder.append("Введено не верно");
              break; }
        }
      System.out.println(builder);
      }
  }
}