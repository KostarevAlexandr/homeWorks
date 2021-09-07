import java.util.Scanner;

public class Main {
    public static String surname;
    public static String name;
    public static String middleName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            //  Считаем пробелы между словами, если больше двух - ошибку.
            int spaceCount = 0;
            for (char s : input.toCharArray()) {
                if (s == ' ') {
                    spaceCount++;
                }
            }
            if (spaceCount == 2) {

                //Разбивка текста на 3 слова
                int spaceIndex1 = input.indexOf(' ');
                int spaceIndex2 = input.lastIndexOf(' ');
                surname = input.substring(0, spaceIndex1);
                name = input.substring(spaceIndex1 + 1, spaceIndex2);
                middleName = input.substring(spaceIndex2 + 1);
            } else {
                System.out.println("Ошибка ввода!");
                continue;
            }


            if (!checkWord(surname) || !checkWord(name) || !checkWord(middleName)) {
                System.out.println("Ввод не верный");

            } else
                System.out.println("Фамилия = " + surname + "\nИмя = " + name + "\nОтчество = " + middleName);
        }

    }
    private static boolean checkWord(String word) {
        //Заглавные буквы
        if (!Character.isUpperCase(word.charAt(0))) {
            return false;
        }
        //строчные буквы
        for (int i = 1; i < word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i)) || !Character.isLetter(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}








