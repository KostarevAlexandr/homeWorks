import java.util.*;

public class Main {

   private static final String number = "Н999КА199";
    private static final List<String> list =CoolNumbers.generateCoolNumbers();


    public static void main(String[] args)
    {
        bruteforce();
        binarySearch();
        inHashSet();
        inTreeSet();
    }

    private static void bruteforce ()
    {
        ArrayList<String> numbers =new ArrayList<>(list);
        long time =System.nanoTime();
        boolean find = CoolNumbers.bruteForceSearchInList(numbers,number);
        time =System.nanoTime()-time;
        System.out.println("Поиск перебором: Результат - "+ find +", поиск занял: " + time);
    }

    private static void binarySearch ()
    {   ArrayList<String> numbers = new ArrayList<>(list);
        Collections.sort(numbers);
        long time =System.nanoTime();
        CoolNumbers.binarySearchInList(numbers,number);
        time =System.nanoTime()-time;

        System.out.println("Бинарный поиск: Результат - "+ CoolNumbers.binarySearchInList(numbers,number) + ", поиск занял: "+ time);
    }

    private static void inHashSet ()
    {
        HashSet<String> numbers =new HashSet<>(list);
        long time =System.nanoTime();
        boolean find = CoolNumbers.searchInHashSet(numbers,number);
        time =System.nanoTime()-time;
        System.out.println("Поиск в HashSet: Результат - "+ find +", поиск занял: " + time);
    }

    private static void inTreeSet ()
    {
        TreeSet<String> numbers =new TreeSet<>(list);
        long time =System.nanoTime();
        boolean find = CoolNumbers.searchInTreeSet(numbers,number);
        time = System.nanoTime()-time;
        System.out.println("Поиск в TreeSet: Результат - "+ find +", поиск занял: " + time);
    }
}
