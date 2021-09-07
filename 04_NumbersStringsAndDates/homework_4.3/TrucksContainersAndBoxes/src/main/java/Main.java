import java.util.Scanner;

public class Main {
    public static final int MAXCONTAINER = 12;
    public static final int MAXBOX = 27;
    public static int container = 1;
    public static int box;
    public static int truck = 1;

    public static void main(String[] args) {
        System.out.print("Введите кол-во ящиков:");
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        box = Integer.parseInt(boxes);

        System.out.println("Грузовик: " + truck);
        System.out.println("\tКонтейнер: " + container);

        for (int i=1; i <= box; i++) {
            System.out.println("\t\tЯщик: " + i);
            if (i % (MAXCONTAINER * MAXBOX) == 0 && box != i) {
                truck += 1;
                System.out.println("Грузовик: " + truck);
            }

            if (i % MAXBOX == 0 && box !=i) {
                container +=1;
                System.out.println("\tКонтейнер: " + container);
            }


        }
        System.out.println("Необходимо: " + "\nГрузовиков "+truck+  "\nКонтейнеров: "+ container);

    }
}

