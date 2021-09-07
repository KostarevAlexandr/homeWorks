import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Client client1 = new PhysicalPerson();
Client client2 = new LegalPerson();
Client client3 =new IndividualBusinessman();

        System.out.println("какой клиент?");
        System.out.println("1- физ. лицо 2- Юр. лицо 3- Предприниматель");
        Scanner scanner =new Scanner(System.in);
        String in = scanner.nextLine();

        if (in.equals("1")){
            System.out.println("Баланс: " +client1.getAmount());
            client1.put(500);
            System.out.println("Положить 500руб: "+ client1.getAmount());
            client1.take(300);
            System.out.println("Снять 300руб: "+ client1.getAmount());
            client1.conditions();
        }
        else if (in.equals("2")){
            System.out.println("Баланс: " +client2.getAmount());
            client2.put(500);
            System.out.println("Положить 500руб: "+ client2.getAmount());
            client2.take(300);
            System.out.println("Снять 300руб: "+ client2.getAmount());
            client2.conditions();
        }
        else if (in.equals("3")){
            System.out.println("Баланс: " +client3.getAmount());
            client3.put(500);
            System.out.println("Положить 500руб: "+ client3.getAmount());
            client3.take(300);
            System.out.println("Снять 300руб: "+ client3.getAmount());
            client3.conditions();
        }else { System.out.println("Такого клиента нет"); }

    }
}
