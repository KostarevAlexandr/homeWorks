import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
       ArrayList<String> numbers = new ArrayList<>();
        final String[] letters = new String[] {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        long time =System.nanoTime();

        for (String X : letters) {
            for (int N = 0; N < 10; N++) {
                for (String Y:letters) {
                    for (String Z:letters) {
                        for (int R = 1; R <= 199; R++) {
                           numbers.add(X+N+N+N+Y+Z+R);
                        }
                    }
                }
            }
        }

        time =System.nanoTime() - time;
        System.out.println("Время создания списка:"+ time);
        System.out.println("Всего номеров:" + numbers.size());
        return numbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {

        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {

        return Collections.binarySearch(sortedList,number)>=0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {

        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        return treeSet.contains(number);
    }

}


