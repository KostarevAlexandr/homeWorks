import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
String text = "Вася заработал - 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей, Андрей -3000";
    System.out.println("Сумма равна: " + calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text){

    String[] chops = text.split("[,]");
          int sum = 0;

        for (int i= 0; i<chops.length; i++)
    {
         String chop = chops[i].trim();
          Pattern pattern = Pattern.compile("\\d+");
          Matcher matcher = pattern.matcher(chop);
       if (matcher.find())
        {
          int num = Integer.parseInt(matcher.group());
          sum = sum + num;
        }
    }
    return sum;
  }

}