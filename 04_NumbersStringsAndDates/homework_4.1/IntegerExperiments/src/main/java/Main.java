public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 12345;
    int sum = sumDigits(12345);
    System.out.println("Сумма чисел равна: " + sum);
  }

  public static int sumDigits(Integer number) {

    if (number == null) { return -1; }

    String numStr = Integer.toString(number);
    char[] chars = numStr.toCharArray();
    int summ =0;

    for (int i = 0; i < chars.length; i++)
    {
      summ = summ + Character.getNumericValue(chars[i]);
    }
    return summ;
  }
}
